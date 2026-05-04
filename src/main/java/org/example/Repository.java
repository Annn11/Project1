package org.example;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public class Repository<T extends Repository> {
    private List<T> items = new ArrayList<>();
    public Repository() {
    }
    public void add(T items) {
        this.items.add(items);
    }
    public List<T> findAll() {
        return this.items;
    }
    public Optional<T> findById(String id) {
        this.items.forEach(i -> i.findById(id));
        return items.stream().findFirst();
    }
}
