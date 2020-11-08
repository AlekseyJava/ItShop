package ru.itshop.service;

import org.springframework.stereotype.Service;
import ru.itshop.dao.ProductDao;
import ru.itshop.model.Product;

@Service
public class WarehouseServiceImp implements WarehouseService{

    private ProductDao productDao;

    public WarehouseServiceImp(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct_warehouse(product);
    }

    @Override
    public void deleteProduct(Product product) {
       productDao.deleteProduct_warehouse(product);
    }
}
