package ru.itshop.daoImp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import ru.itshop.dao.ProductDao;
import ru.itshop.database.DatabaseTradingHall;
import ru.itshop.database.DatabaseWarehouse;
import ru.itshop.model.Product;

@Repository
public class ProductDaoImp implements ProductDao {

    DatabaseTradingHall databaseTradingHall = DatabaseTradingHall.getInstance(); //database  - singelton

    DatabaseWarehouse databaseWarehouse = DatabaseWarehouse.getInstance();

    @Value("${tradingHall.maxProducts}")
    int maxProductsInTraidingHall;

    @Value("${tradingHall.minProducts}")
    int minProductsInTraidingHall;

    @Value("${warehouse.maxProducts}")
    int maxProductsInWarehouse;

    @Value("${warehouse.minProducts}")
    int minProductsInWarehouse;

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
        if(databaseTradingHall.getProductsInTraidingHall().size()<maxProductsInTraidingHall) {
            databaseTradingHall.addProduct(product);
            System.out.println("add product (ProductImp.class)");
        }
        else {
            System.out.println("to many products in stock. Product don't add");
            System.out.println("add product (ProductImp.class)");
        }
    }

    @Override
    public void addProduct_warehouse(Product product) {
        if(databaseWarehouse.getProductsInWarehouse().size()<maxProductsInWarehouse) {
            databaseWarehouse.addProduct(product);
            System.out.println("add product (ProductImp.class)");
        }
        else {
            System.out.println("to many products in warehouse. Product don't add");
            System.out.println("add product (ProductImp.class)");
        }
    }

    @Override
    public void deleteProduct_warehouse(Product product) {
        databaseWarehouse.deleteProduct(product);
        System.out.println("add product (ProductImp.class)");
    }

}
