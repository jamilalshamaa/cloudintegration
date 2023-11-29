package fr.efrei.server.web.rest;

import fr.efrei.server.domain.Item;
import fr.efrei.server.repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class ItemResourceIT {
    @Autowired
    private ItemRepository itemRepository;

    @Test
    @Transactional
    void createItems() throws Exception {
        int databaseSizeBeforeCreate = itemRepository.findAll().size();
        //System.out.println("Database size before create: " + databaseSizeBeforeCreate);
        assertThat(databaseSizeBeforeCreate).isEqualTo(0);
        // Create some items (replace this with your actual logic to create items)
        Item item1 = new Item();
        item1.setName("Dummy");
        item1.setPrice(20.00);
        itemRepository.save(item1);

        Item item2 = new Item();
        item2.setName("Dummy2");
        item2.setPrice(20.00);
        itemRepository.save(item2);

        int databaseSizeAfterCreate = itemRepository.findAll().size();
        //System.out.println("Database size before create: " + databaseSizeAfterCreate);

        //assertThat(databaseSizeAfterCreate).isEqualTo(2);
        assertThat(databaseSizeAfterCreate).isEqualTo(databaseSizeBeforeCreate+2);
    }


}
