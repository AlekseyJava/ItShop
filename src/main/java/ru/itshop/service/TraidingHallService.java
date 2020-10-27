package ru.itshop.service;

import ru.itshop.model.Product;

public interface TraidingHallService {

    //    продать товар - sellProduct
    void sellProduct(Product product);

    //    сделать возврат товара - returnProduct
    void returnProduct(Product product);

    //    обменять товар – exchangeProduct
    void exchangeProduct(Product product);

    //    выбрать товар для просмотра характеристик - selectProduct
    void selectProduct(Product product);

    //    взять товар со склада – addProduct
    void addProduct(Product product);

}
