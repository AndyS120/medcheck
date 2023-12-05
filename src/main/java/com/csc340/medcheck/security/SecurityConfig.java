package com.csc340.medcheck.security;

import jakarta.servlet.DispatcherType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private CustomUserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        HttpSessionRequestCache requestCache = new HttpSessionRequestCache();
        requestCache.setMatchingRequestParameterName(null);
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((authorize) -> authorize
                        .dispatcherTypeMatchers(DispatcherType.FORWARD,
                                DispatcherType.ERROR).permitAll()
                        .requestMatchers("/inventory/**").hasAuthority("PHARMACIST")
                        .requestMatchers("/prescriptions/**").hasAuthority("PHARMACIST")
                        .requestMatchers("/doctor/**").hasAuthority("DOCTOR")
                        .requestMatchers("/**").permitAll()
                        .requestMatchers("/medcheck/**").hasAuthority("DOCTOR")
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginProcessingUrl("/login")
                        .loginPage("/login-doctor").permitAll()
                        .defaultSuccessUrl("/medcheck/portal-messages")
                )
                .formLogin((form) -> form
                        .loginProcessingUrl("/login")
                        .loginPage("/login-patient").permitAll()
                )
                .exceptionHandling((x) -> x.accessDeniedPage("/403"))
                .logout(LogoutConfigurer::permitAll)
                .requestCache((cache) -> cache
                        .requestCache(requestCache)
                );

        return http.build();
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(
                passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
