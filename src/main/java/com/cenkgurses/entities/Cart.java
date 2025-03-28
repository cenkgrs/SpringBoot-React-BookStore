package com.cenkgurses.entities;

import java.util.List;

import com.cenkgurses.generator.CartIdGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "cart")
@Entity
public class Cart {
    
    @Id
    @GeneratedValue(generator = CartIdGenerator.generatorName)
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @OneToMany(mappedBy = "book")
    private List<Book> items;

    @Column(name = "total_price")
    private Double totalPrice;



}
