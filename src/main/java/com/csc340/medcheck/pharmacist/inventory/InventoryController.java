package com.csc340.medcheck.pharmacist.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/inventory")
@Controller
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @GetMapping({"", "/"})
    public String getInventory(Model model) {
        model.addAttribute("itemList", inventoryService.getAllItems());
        return "portal-inventory";
    }

    @GetMapping("/order")
    public String createOrder(Model model) {
        Item item = new Item();
        model.addAttribute("itemList", inventoryService.getAllItems());
        model.addAttribute("newItem", item);
        model.addAttribute("isUpdate", false);
        return "order";
    }

    @GetMapping("/delete/id={itemID}")
    public String deleteItem(@PathVariable long itemID) {
        inventoryService.deleteItemById(itemID);
        return "redirect:/inventory";
    }

    @GetMapping("/edit/id={itemID}")
    public String editItem(@PathVariable long itemID, Model model) {
        Item item = inventoryService.getItemById(itemID);
        model.addAttribute("item", item);
        model.addAttribute("isUpdate", true);
        return "order";
    }

    @PostMapping("/create")
    public String saveOrder(Item item) {
        inventoryService.saveItem(item);
        return "redirect:/inventory";
    }

    @PostMapping("/edit/id={itemID}")
    public String editItem(@PathVariable long itemID, Item item) {
        inventoryService.updateItem(itemID, item);
        return "redirect:/inventory";
    }
}
