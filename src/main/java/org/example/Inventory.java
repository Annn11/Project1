package org.example;

import java.util.Objects;

public class Inventory implements Identifiable {
    private String id;
    private String name;
    private int number;
    public Inventory(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inventory)) return false;
        Inventory inventory = (Inventory) o;
        return getId().equals(inventory.getId());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
