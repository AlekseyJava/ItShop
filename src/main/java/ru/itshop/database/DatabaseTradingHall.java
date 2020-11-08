package ru.itshop.database;


import ru.itshop.model.Product;

import java.util.ArrayList;
import java.util.List;

//singelton
public class DatabaseTradingHall {

    private static DatabaseTradingHall instance;

    private List<Product> productsInTraidingHall = new ArrayList<>();

    public static DatabaseTradingHall getInstance() {
        if (instance == null) {
            instance = new DatabaseTradingHall();
        }
        return instance;
    }

    public void addProduct(Product product) {
        productsInTraidingHall.add(product);
        System.out.println("Add product (databaseTraidingHall)");
    }
    
    public void sellProduct(Product product) {
        productsInTraidingHall.remove(product);
        System.out.println("Sell product (databaseTraidingHall)");
    }

    public void returnProduct(Product product) {
        productsInTraidingHall.add(product);
        System.out.println("Return product (databaseTraidingHall)");
    }

    public void selectProduct(String serialId) {
        for(Product productFromDatabase : productsInTraidingHall) {
            if (productFromDatabase.getSerialId().equals(serialId) ) {
                System.out.println(productFromDatabase.getName());
                System.out.println(productFromDatabase.getSerialId());
                System.out.println(productFromDatabase.getCost());
            }
        }
        System.out.println("Select product (databaseTraidingHall)");
    }

    public void exchangeProduct(Product product, Product product2) {
        productsInTraidingHall.add(product);
        productsInTraidingHall.remove(product2);
        System.out.println("Exchange product (databaseTraidingHall)");
    }

    public void selectAllProduct() {
        for(Product productFromDatabase : productsInTraidingHall) {
                System.out.println("\r\n" + productFromDatabase.getName());
                System.out.println(productFromDatabase.getSerialId());
                System.out.println(productFromDatabase.getCost());
        }
        System.out.println("Select all product (databaseTraidingHall)");
    }

    public List<Product> getProductsInTraidingHall() {
        return productsInTraidingHall;
    }

    public void setProductsInTraidingHall(List<Product> productsInTraidingHall) {
        this.productsInTraidingHall = productsInTraidingHall;
    }
}
