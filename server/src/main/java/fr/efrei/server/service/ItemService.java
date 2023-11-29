package fr.efrei.server.service;

import fr.efrei.server.domain.Item;
import fr.efrei.server.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;
    public List<Item> findAll(){return itemRepository.findAll();}
}
