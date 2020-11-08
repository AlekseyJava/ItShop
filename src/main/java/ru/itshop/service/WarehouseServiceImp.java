package ru.itshop.service;

import org.springframework.stereotype.Service;
import ru.itshop.dao.ProductDao;
import ru.itshop.dao.WarehouseDao;
import ru.itshop.model.Product;

@Service
public class WarehouseServiceImp implements WarehouseService{

    private WarehouseDao warehouseDao;

    public WarehouseServiceImp(WarehouseDao warehouseDao) {
        this.warehouseDao = warehouseDao;
    }

    public WarehouseServiceImp() {

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
