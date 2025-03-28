package com.cenkgurses.entities;

import java.util.List;

import com.cenkgurses.generator.CartIdGenerator;

import jakarta.persistence.*;

@Table(name = "cart")
@Entity
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @OneToMany(mappedBy = "id")
    private List<Book> books;

    @Column(name = "total_price")
    private Double totalPrice;



}
