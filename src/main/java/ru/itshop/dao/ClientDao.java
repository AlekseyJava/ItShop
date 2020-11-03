package ru.itshop.dao;

import ru.itshop.model.Product;

public interface ClientDao {

    void buy(Product product);

    void return_product(Product product);

    void exchange(Product product1, Product product2);

    void look(Product product);
}
