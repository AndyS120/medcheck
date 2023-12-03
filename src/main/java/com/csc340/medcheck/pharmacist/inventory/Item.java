package com.csc340.medcheck.pharmacist.inventory;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventory")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {

    @Id
    @GeneratedValue()
    private long itemID;

    @Column(nullable = false, unique = true)
    @NonNull
    private String itemName;

    @Column()
    private int amount;

    private String details;

}
