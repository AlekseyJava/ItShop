package ru.itshop.service;

import ru.itshop.dao.ProductDao;
import ru.itshop.dao.WarehouseDao;
import ru.itshop.model.Product;

public class WarehouseServiceImp implements WarehouseService{

    private WarehouseDao warehouseDao;

    public WarehouseServiceImp(WarehouseDao warehouseDao) {
        this.warehouseDao = warehouseDao;
    }

    @Override
    public void addProduct(Product product) {
        warehouseDao.addProduct_warehouse(product);
    }

    @Override
    public void deleteProduct(Product product) {
       warehouseDao.deleteProduct_warehouse(product);
    }
}
