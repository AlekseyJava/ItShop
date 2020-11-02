package ru.itshop.service;

import ru.itshop.dao.ProductDao;
import ru.itshop.model.Product;

public interface TradingHallService {

    //    продать товар - sellProduct
    void sellProduct(Product product);

    //    сделать возврат товара - returnProduct
    void returnProduct(Product product);

    //    обменять товар – exchangeProduct
    void exchangeProduct(Product product1, Product product2);

    //    выбрать товар для просмотра характеристик - selectProduct
    void selectProduct(Product product);

    //    взять товар со склада – addProduct
    void addProduct(Product product);

}
