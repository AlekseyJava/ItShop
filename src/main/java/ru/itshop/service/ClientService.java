package ru.itshop.service;

import ru.itshop.dao.ProductDao;
import ru.itshop.model.Product;

public interface ClientService {
    void buy(Product product);
    void return_product(Product product);
    void exchange(Product product1, Product product2);
    void look(Product product);
}
