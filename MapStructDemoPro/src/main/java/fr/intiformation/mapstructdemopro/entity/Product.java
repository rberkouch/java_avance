package fr.intiformation.mapstructdemopro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
    @Setter
@Entity
@Table
    public  class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String name;
        private String descrip;
        private int quantity;
        private long price;

        private String itemId;

        @OneToMany
        private List<Item> items;
    }

