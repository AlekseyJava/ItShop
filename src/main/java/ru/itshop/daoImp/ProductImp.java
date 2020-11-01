package ru.itshop.daoImp;

import ru.itshop.dao.ProductDao;
import ru.itshop.database.DatabaseTraidingHall;
import ru.itshop.database.DatabaseWarehouse;
import ru.itshop.model.Product;

public class ProductImp extends Product implements ProductDao {

    DatabaseTraidingHall databaseTraidingHall = DatabaseTraidingHall.getInstance(); //database  - singelton

    DatabaseWarehouse databaseWarehouse = DatabaseWarehouse.getInstance();

    @Override
    public void sellProduct(Product product) {
        databaseTraidingHall.sellProduct(product);
        System.out.println("sell product (ProductImp.class)");
    }

    @Override
    public void returnProduct(Product product) {
        databaseTraidingHall.returnProduct(product);
        System.out.println("return product (ProductImp.class)");
    }

    @Override
    public void exchangeProduct(Product product1, Product product2) {
        databaseTraidingHall.exchangeProduct(product1, product2);
        System.out.println("exchange product (ProductImp.class)");
    }

    @Override
    public void selectProduct(Product product) {
        databaseTraidingHall.selectProduct(product.getSerialId());
        System.out.println("select product (ProductImp.class)");
    }

    @Override
    public void addProduct(Product product) {
        databaseTraidingHall.addProduct(product);
        System.out.println("add product (ProductImp.class)");
    }

    public void addProduct_warehouse(Product product) {
        databaseWarehouse.addProduct(product);
        System.out.println("add product (ProductImp.class)");
    }

    public void deleteProduct_warehouse(Product product) {
        databaseWarehouse.deleteProduct(product);
        System.out.println("add product (ProductImp.class)");
    }

}
