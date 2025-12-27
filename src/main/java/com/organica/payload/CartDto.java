package com.organica.payload;

import com.organica.entities.CartDetalis;
import com.organica.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private int Id;

    private UserDto user;

    private float TotalAmount;

    private List<CartDetailDto> cartDetalis;

    // Explicit getter/setter for cartDetalis to avoid Lombok/IDE issues
    public List<CartDetailDto> getCartDetalis() {
        return this.cartDetalis;
    }

    public void setCartDetalis(List<CartDetailDto> cartDetalis) {
        this.cartDetalis = cartDetalis;
    }
}