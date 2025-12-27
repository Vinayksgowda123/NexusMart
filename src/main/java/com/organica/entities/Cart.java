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
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private float TotalAmount;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cart")
    private List<CartDetalis> cartDetalis;


    public void setCartDetalis(List<CartDetalis> pro) {
        this.cartDetalis = pro;
    }

    // Explicit getters/setters to avoid Lombok/IDE processing issues
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public float getTotalAmount() {
        return this.TotalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.TotalAmount = totalAmount;
    }

    // Overload to accept Integer as some services call setTotalAmount(Integer)
    public void setTotalAmount(Integer totalAmount) {
        if (totalAmount == null) return;
        this.TotalAmount = totalAmount.floatValue();
    }

    public List<CartDetalis> getCartDetalis() {
        return this.cartDetalis;
    }
}