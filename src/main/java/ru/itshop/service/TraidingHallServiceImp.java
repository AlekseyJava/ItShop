package ru.itshop.service;

import ru.itshop.model.Product;

import javax.annotation.PostConstruct;

public class TraidingHallServiceImp implements TraidingHallService{
    private Product product;

    public TraidingHallServiceImp(Product product) {
        this.product = product;
    }

    @PostConstruct
    public void postConstruct() {

    }

    @Override
    public void sellProduct(Product product) {
        System.out.println("sell product");

    }

    @Override
    public void returnProduct(Product product) {
        System.out.println("return product");

    }

    @Override
    public void exchangeProduct(Product product) {
        System.out.println("exchange product");

    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("select product");
    }

    @Override
    public void addProduct(Product product) {
        System.out.println("add product");

    }
}
