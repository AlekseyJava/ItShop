package ru.itshop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.itshop.dao.ProductDao;
import ru.itshop.daoImp.ProductDaoImp;
import ru.itshop.model.Product;

@Service
public class TradingHallServiceImp implements TradingHallService {

    private ProductDao productDao;

    public TradingHallServiceImp() {

    }

    public TradingHallServiceImp(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void sellProduct(Product product) {
        productDao.sellProduct(product);
    }

    @Override
    public void returnProduct(Product product) {
        productDao.returnProduct(product);
    }

    @Override
    public void exchangeProduct(Product product1, Product product2) {
        productDao.exchangeProduct(product1, product2);
    }

    @Override
    public void selectProduct(Product product) {
        productDao.selectProduct(product);
    }

    @Override
    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
}
