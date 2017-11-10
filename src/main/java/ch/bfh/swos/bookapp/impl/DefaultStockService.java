package ch.bfh.swos.bookapp.impl;

import ch.bfh.swos.bookapp.StockService;

import java.util.ArrayList;
import java.util.List;

public class DefaultStockService implements StockService {

    private List<String> stock = new ArrayList<>();

    public List<String> listProducts() {
        return stock;
    }

    @Override
    public String getProduct(int position) {
        return stock.get(position);
    }

    public String addProduct(String product) {
        stock.add(product);
        return product;
    }

    public void deleteProduct(int position) {
        stock.remove(position);
    }

    public void updateProduct(int position, String product) {
        stock.set(position, product);
    }
}
