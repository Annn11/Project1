package org.example;
import java.util.List;
import java.util.Optional;
public class InventoryService extends Repository {
    private Repository<Inventory> inventorys = new Repository<>();
    public Inventory createInventory(String id, String name, int number) {
        if(id == null || id.isBlank()) {
            throw new StockException("id cannot be blank");
        }
        if(name == null || name.isBlank()) {
            throw new StockException("name cannot be blank");
        }
        if(number <= 0) {
            throw new StockException("number cannot be negative");
        }
        Inventory inventory = new Inventory(id, name, number);
        inventory.add(inventory);
        return inventory;
    }
    public Optional<Inventory> findById(String id) {
        return inventorys.findById(id);
    }
    public List<Inventory> findAll() {
        return inventorys.findAll();
    }
}
