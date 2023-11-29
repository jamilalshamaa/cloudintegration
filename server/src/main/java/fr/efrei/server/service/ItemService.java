package net.efrei.server.service;

import net.efrei.server.domain.Item;
import net.efrei.server.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll(){return itemRepository.findAll();}
}
