package com.organica.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CartHelp {
    private String UserEmail;
    private int ProductId;
    private int Quantity;

    // Explicit getters/setters to avoid Lombok processing issues
    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        this.UserEmail = userEmail;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        this.ProductId = productId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }
}