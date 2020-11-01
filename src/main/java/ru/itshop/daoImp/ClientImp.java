package ru.itshop.daoImp;

import ru.itshop.dao.ClientDao;
import ru.itshop.database.DatabaseTraidingHall;
import ru.itshop.model.Client;
import ru.itshop.model.Product;

public class ClientImp extends Client implements ClientDao {

    DatabaseTraidingHall databaseTraidingHall = DatabaseTraidingHall.getInstance(); //database  - singelton

    @Override
    public void buy(Product product) {
        databaseTraidingHall.sellProduct(product);
        System.out.println("buy product (ClientImp.class)");
    }

    @Override
    public void return_product(Product product) {
        databaseTraidingHall.returnProduct(product);
        System.out.println("return product (ClientImp.class)");
    }

    @Override
    public void exchange(Product product1, Product product2) {
        databaseTraidingHall.exchangeProduct(product1, product2);
        System.out.println("return product (ClientImp.class)");
    }

    @Override
    public void look(Product product) {
        databaseTraidingHall.selectProduct(product.getSerialId());
        System.out.println("select product (ClientImp.class)");
    }
}
