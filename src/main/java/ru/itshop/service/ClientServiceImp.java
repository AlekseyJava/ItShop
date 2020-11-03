package ru.itshop.service;

import ru.itshop.dao.ProductDao;
import ru.itshop.daoImp.ProductDaoImp;
import ru.itshop.model.Product;

public class ClientServiceImp implements ClientService {
    private ProductDao productDao;

    public ClientServiceImp(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void buy(Product product) {
        productDao.sellProduct(product);
    }

    @Override
    public void return_product(Product product) {
        productDao.returnProduct(product);
    }

    @Override
    public void exchange(Product product1, Product product2) {
        productDao.exchangeProduct(product1, product2);
    }

    @Override
    public void look(Product product) {
        productDao.selectProduct(product);
    }
}
