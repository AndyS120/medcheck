package com.csc340.medcheck.pharmacist.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    InventoryRepo repository;

    public Item getItemById(long id) {
        return repository.getReferenceById(id);
    }

//    public Item getItemByName(String name) {
//        repository.get
//    }

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public void saveItem(Item item) {
        repository.save(item);
    }

    public void updateItem(long id, Item item) {
        Item existing = getItemById(id);
        existing.setAmount(item.getAmount());
        existing.setDetails(item.getDetails());

        repository.save(existing);
    }

    public void deleteItemById(long id) {
        repository.deleteById(id);
    }
}
