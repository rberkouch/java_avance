package fr.intiformation.mapstructdemopro.dto;

import fr.intiformation.mapstructdemopro.entity.Item;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDto {
    @Id
    private int id;
    private String name;
    private String description;
     private int quantity;
    private long price;

    private String itemId;

    private List<Item> itemList;
}
