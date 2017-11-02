package ch.bfh.swos.bookapp.impl;

import ch.bfh.swos.bookapp.StockService;

import java.util.ArrayList;
import java.util.List;

public class DefaultStockService implements StockService {

    private List<String> todoList = new ArrayList<>();

    public List<String> listProducts() {
        return  todoList;
    }

    @Override
    public String getProduct(int position) {
        return todoList.get(position);
    }

    public String addProduct(String todo) {
        todoList.add(todo);
        return todo;
    }

    public void deleteProduct(int position) {
        todoList.remove(position);
    }

    public void updateProduct(int position, String todo) {
        todoList.set(position, todo);
    }
}
