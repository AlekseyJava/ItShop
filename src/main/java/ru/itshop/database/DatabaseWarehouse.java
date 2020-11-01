package ru.itshop.database;

import ru.itshop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DatabaseWarehouse {
    private static DatabaseWarehouse instance;

    private List<Product> productsInWarehouse = new ArrayList<>();

    public static DatabaseWarehouse getInstance() {
        if (instance == null) {
            instance = new DatabaseWarehouse();
        }
        return instance;
    }

    public void addProduct(Product product) {
        productsInWarehouse.add(product);
        System.out.println("Add product (database Warehouse)");
    }

    public void deleteProduct(Product product) {
        productsInWarehouse.remove(product);
        System.out.println("Delete product (database Warehouse)");
    }

}
