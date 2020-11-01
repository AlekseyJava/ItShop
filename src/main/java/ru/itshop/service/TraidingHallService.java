package ru.itshop.service;

import ru.itshop.dao.ProductDao;
import ru.itshop.model.Product;

public interface TraidingHallService {

    //    продать товар - sellProduct
    void sellProduct(ProductDao product);

    //    сделать возврат товара - returnProduct
    void returnProduct(ProductDao product);

    //    обменять товар – exchangeProduct
    void exchangeProduct(ProductDao product1, ProductDao product2);

    //    выбрать товар для просмотра характеристик - selectProduct
    void selectProduct(ProductDao product);

    //    взять товар со склада – addProduct
    void addProduct(ProductDao product);

}
