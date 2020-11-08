package ru.itshop.daoImp;

import ru.itshop.dao.TradingHallDao;
import ru.itshop.database.DatabaseTradingHall;
import ru.itshop.model.Product;

public class TradingHallDaoImpl implements TradingHallDao {

    DatabaseTradingHall databaseTradingHall = DatabaseTradingHall.getInstance();

    @Override
    public void sellProduct(Product product) {
        databaseTradingHall.sellProduct(product);
        System.out.println("sell product (ProductImp.class)");
    }

    @Override
    public void returnProduct(Product product) {
        databaseTradingHall.returnProduct(product);
        System.out.println("return product (ProductImp.class)");
    }

    @Override
    public void exchangeProduct(Product product1, Product product2) {
        databaseTradingHall.exchangeProduct(product1, product2);
        System.out.println("exchange product (ProductImp.class)");
    }

    @Override
    public void selectProduct(Product product) {
        databaseTradingHall.selectProduct(product.getSerialId());
        System.out.println("select product (ProductImp.class)");
    }

    @Override
    public void addProduct(Product product) {
        databaseTradingHall.addProduct(product);
        System.out.println("add product (ProductImp.class)");
    }
}
