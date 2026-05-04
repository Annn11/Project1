package org.example;

import java.util.Objects;

public class Product {
    private String id;
    private String title;
    private int price;
    public Product(String id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getId().equals(product.getId());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
