package ru.itshop.dao;

import ru.itshop.model.Product;

public interface WarehouseDao {

    //    добавить товар на склад - addProduct_warehouse
    void addProduct_warehouse(Product product);

    //    взять товар со склада - deleteProduct_warehouse
    void deleteProduct_warehouse(Product product);
}
