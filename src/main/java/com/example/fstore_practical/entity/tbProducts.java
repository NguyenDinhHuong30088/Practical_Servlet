package com.example.fstore_practical.entity;

import com.example.fstore_practical.annocation.Column;
import com.example.fstore_practical.annocation.Table;

@Table(name = "tbProducts")
public class tbProducts {
    @Column(name = "id",type = "INT PRIMARY KEY AUTO_INCREMENT")
    private int id;

    @Column(name = "name",type = "VARCHAR(255)")
    private String name;

    @Column(name = "price",type = "DOUBLE")
    private Double price;

    @Column(name = "amount",type = "DOUBLE")
    private Double amount;

    @Column(name = "details",type = "VARCHAR(255)")
    private String details;

    public tbProducts() {
    }

    public tbProducts(int id, String name, Double price, Double amount, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.details = details;
    }

    public tbProducts(String name, Double price, Double amount, String details) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
