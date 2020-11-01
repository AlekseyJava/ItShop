package ru.itshop.service;

import ru.itshop.model.Product;

public interface WarehouseService {
    void addProduct(Product product);
    void deleteProduct(Product product);
}
