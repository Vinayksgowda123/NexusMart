package com.organica.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CartDetalis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CartDetalisId;

    @ManyToOne
    private Product products;
    private int Quantity;
    private int Amount;

    @ManyToOne
    private Cart cart;

    // Explicit getters/setters to avoid Lombok processing issues in IDE
    public Product getProducts() {
        return this.products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }

    public int getAmount() {
        return this.Amount;
    }

    public void setAmount(int amount) {
        this.Amount = amount;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

}