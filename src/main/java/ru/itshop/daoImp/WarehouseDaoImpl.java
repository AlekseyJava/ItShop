package ru.itshop.daoImp;

import ru.itshop.dao.WarehouseDao;
import ru.itshop.database.DatabaseWarehouse;
import ru.itshop.model.Product;
import ru.itshop.service.WarehouseServiceImp;

public class WarehouseDaoImpl implements WarehouseDao {

    DatabaseWarehouse databaseWarehouse = DatabaseWarehouse.getInstance();

    @Override
    public void addProduct_warehouse(Product product) {
        databaseWarehouse.addProduct(product);
        System.out.println("add product (ProductImp.class)");
    }

    @Override
    public void deleteProduct_warehouse(Product product) {
        databaseWarehouse.deleteProduct(product);
        System.out.println("add product (ProductImp.class)");
    }
}
