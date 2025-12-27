package com.organica.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CartDetailDto {

    private int CartDetalisId;
    private ProductDto products;
    private int Quantity;
    private int Amount;

//    private CartDto cart;

    // Explicit getters/setters to avoid Lombok/IDE issues
    public ProductDto getProducts() {
        return this.products;
    }

    public void setProducts(ProductDto products) {
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
}