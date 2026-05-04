package org.example;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
public class StockService extends Repository {
    private static final Logger logger = Logger.getLogger(StockService.class.getName());
    private Repository<Stock> stocks = new Repository<>();
    public Stock createStock(String id, Product product, Inventory inventory, Category category) {
        if(id == null || id.isBlank()) {
            logger.severe("id cannot be blank");
            throw new StockException("id cannot be blank");
        }
        if(category == null) {
            logger.warning("category cannot be null");
            throw new StockException("category cannot be null");
        }
        if(inventory == null) {
            logger.warning("inventory cannot be null");
            throw new StockException("inventory cannot be null");
        }
        Stock stock = new Stock(id, product, inventory, category);
        stocks.add(stock);
        return stock;
    }
    public Optional<Stock> findById(String id) {
        return stocks.findById(id);
    }
    public List<Stock> findAll() {
        return stocks.findAll();
    }
}
