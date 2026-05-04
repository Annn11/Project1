package org.example;

public class Stock implements Identifiable{
    private String id;
    Product product;
    Inventory inventory;
    Category category;
    public Stock(String id, Product product, Inventory inventory, Category category) {
        this.id = id;
        this.product = product;
        this.inventory = inventory;
        this.category = category.HAVING;
    }
    public String getId() {
        return id;
    }
    public Product getProduct() {
        return product;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public Category getCategory() {
        return category;
    }
    public Category setCategory(Category category) {
        this.category = category;
        return category;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;
        Stock stock = (Stock) o;
        return id.equals(stock.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
