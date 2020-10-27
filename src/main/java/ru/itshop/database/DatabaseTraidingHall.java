package ru.itshop.database;


import ru.itshop.model.Product;

import java.util.ArrayList;
import java.util.List;

//singelton
public class DatabaseTraidingHall {

    private static DatabaseTraidingHall instance;

    private List<Product> productsInTraidingHall = new ArrayList<>();

    public List<Product> getProductsInTraidingHall() {
        return productsInTraidingHall;
    }

    public void setProductsInTraidingHall(List<Product> productsInTraidingHall) {
        this.productsInTraidingHall = productsInTraidingHall;
    }

    public static DatabaseTraidingHall getInstance() {
        if (instance == null) {
            instance = new DatabaseTraidingHall();
        }
        return instance;
    }

    public void addProduct(Product product) {
        productsInTraidingHall.add(product);
        System.out.println("Add product");
    }
    
    public void sellProduct(Product product) {
        productsInTraidingHall.remove(product);
        System.out.println("Sell product");
    }

    public void returnProduct(Product product) {
        productsInTraidingHall.add(product);
        System.out.println("Return product");
    }

    public void selectProduct(String serialId) {
        for(Product productFromDatabase : productsInTraidingHall) {
            if (productFromDatabase.getSerialId().equals(serialId) ) {
                System.out.println(productFromDatabase.getName());
                System.out.println(productFromDatabase.getSerialId());
                System.out.println(productFromDatabase.getCost());
            }
        }
        System.out.println("Select product");
    }

    public void exchangeProduct(Product product, Product product2) {
        productsInTraidingHall.add(product);
        productsInTraidingHall.remove(product2);
        System.out.println("Exchange product");
    }

    public void selectAllProduct() {
        for(Product productFromDatabase : productsInTraidingHall) {
                System.out.println("\r\n" + productFromDatabase.getName());
                System.out.println(productFromDatabase.getSerialId());
                System.out.println(productFromDatabase.getCost());
        }
        //productsInTraidingHall.add(product);
        System.out.println("Select all product");
    }

}
