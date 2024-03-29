package com.example.olifood.entity;

import javax.persistence.*;

@Entity
@Table(name = "orderitem")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantity;

    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
