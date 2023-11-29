package fr.efrei.server.web.rest;


import fr.efrei.server.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.efrei.server.domain.Item;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemRessource {

    public final ItemService itemService;

    public ItemRessource(ItemService itemService){this.itemService = itemService;}

    @GetMapping("/items")
    public List<Item> getAllItems(){
        return itemService.findAll();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable String id){
        Item item = new Item();
        item.setName("Pierre");
        return item;
    }



}
