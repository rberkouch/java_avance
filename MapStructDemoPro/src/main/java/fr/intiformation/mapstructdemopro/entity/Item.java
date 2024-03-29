package fr.intiformation.mapstructdemopro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Item {
    @Id
    private int id;
    private String name;
}
