package com.csc340.medcheck.portal.inventory;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Item, Long> {}
