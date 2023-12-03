package com.csc340.medcheck.pharmacist.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Item, Long> {}
