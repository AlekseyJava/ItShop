package ru.itshop.service;

import ru.itshop.dao.ProductDao;
import ru.itshop.model.Product;

public class WarehouseServiceImp implements WarehouseService{

    private ProductDao productDao;

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
       // productDao.delete
    }
}
