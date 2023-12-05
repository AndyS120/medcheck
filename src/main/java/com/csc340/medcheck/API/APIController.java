package com.csc340.medcheck.API;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Controller
public class APIController {

    @GetMapping("/search")
    public String getAPI(Model model, SearchField searchField) {
        String term = searchField.getTerm();
        try {
            String url = String.format("https://api.fda.gov/drug/label.json?search=openfda.generic_name:%s", term);
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jSonQuote = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jSonQuote);
            JsonNode response = root.get("results").get(0);

            model.addAttribute("response", response);
            model.addAttribute("openFDA", response.get("openfda"));

        } catch (RestClientException | JsonProcessingException ignored) {
        }
        return "portal-search";
    }
}
