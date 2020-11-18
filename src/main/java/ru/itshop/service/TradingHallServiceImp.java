package ru.itshop.service;

import ru.itshop.controller.dto.ProductDto;
import ru.itshop.dao.TradingHallDao;
import ru.itshop.model.Product;

public class TradingHallServiceImp implements TradingHallService {

    private TradingHallDao tradingHallServiceDao;

    public TradingHallServiceImp(TradingHallDao tradingHallServiceDao) {
        this.tradingHallServiceDao = tradingHallServiceDao;
    }

    @Override
    public ProductDto sellProduct(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        tradingHallServiceDao.sellProduct(product);
        return productDto;
    }

    @Override
    public ProductDto returnProduct(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        tradingHallServiceDao.returnProduct(product);
        return productDto;
    }

    @Override
    public ProductDto exchangeProduct(ProductDto productDto1, ProductDto productDto2) {
        Product product1 = new Product(productDto1.getId(), productDto1.getName(), productDto1.getSerialId(), productDto1.getCost());
        Product product2 = new Product(productDto2.getId(), productDto2.getName(), productDto2.getSerialId(), productDto2.getCost());
        tradingHallServiceDao.exchangeProduct(product1, product2);
        return productDto2;
    }

    @Override
    public ProductDto selectProduct(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        tradingHallServiceDao.selectProduct(product);
        return productDto;
    }

    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        tradingHallServiceDao.addProduct(product);
        return productDto;
    }
}
