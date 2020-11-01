package ru.itshop.service;

import ru.itshop.dao.ProductDao;
import ru.itshop.daoImp.ProductImp;
import ru.itshop.database.DatabaseWarehouse;
import ru.itshop.model.Product;

public class WarehouseServiceImp implements WarehouseService{

    private ProductImp productImp;

    @Override
    public void addProduct(Product product) {
        productImp = (ProductImp) product;
        productImp.addProduct_warehouse(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productImp = (ProductImp) product;
        productImp.addProduct_warehouse(product);
    }
}
