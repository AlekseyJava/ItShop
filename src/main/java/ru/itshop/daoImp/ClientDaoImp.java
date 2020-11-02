package ru.itshop.daoImp;

import ru.itshop.dao.ClientDao;
import ru.itshop.database.DatabaseTradingHall;
import ru.itshop.model.Client;
import ru.itshop.model.Product;

public class ClientDaoImp extends Client implements ClientDao {

    DatabaseTradingHall databaseTradingHall = DatabaseTradingHall.getInstance(); //database  - singelton

    @Override
    public void buy(Product product) {
        databaseTradingHall.sellProduct(product);
        System.out.println("buy product (ClientImp.class)");
    }

    @Override
    public void return_product(Product product) {
        databaseTradingHall.returnProduct(product);
        System.out.println("return product (ClientImp.class)");
    }

    @Override
    public void exchange(Product product1, Product product2) {
        databaseTradingHall.exchangeProduct(product1, product2);
        System.out.println("return product (ClientImp.class)");
    }

    @Override
    public void look(Product product) {
        databaseTradingHall.selectProduct(product.getSerialId());
        System.out.println("select product (ClientImp.class)");
    }
}
