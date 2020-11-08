package ru.itshop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.itshop.dao.ProductDao;
import ru.itshop.dao.TradingHallDao;
import ru.itshop.daoImp.ProductDaoImp;
import ru.itshop.model.Product;

@Service
public class TradingHallServiceImp implements TradingHallService {

    private TradingHallDao tradingHallServiceDao;

    public TradingHallServiceImp(TradingHallDao tradingHallServiceDao) {
        this.tradingHallServiceDao = tradingHallServiceDao;
    }

    @Override
    public void sellProduct(Product product) {
        tradingHallServiceDao.sellProduct(product);
    }

    @Override
    public void returnProduct(Product product) {
        tradingHallServiceDao.returnProduct(product);
    }

    @Override
    public void exchangeProduct(Product product1, Product product2) {
        tradingHallServiceDao.exchangeProduct(product1, product2);
    }

    @Override
    public void selectProduct(Product product) {
        tradingHallServiceDao.selectProduct(product);
    }

    @Override
    public void addProduct(Product product) {
        tradingHallServiceDao.addProduct(product);
    }

}
