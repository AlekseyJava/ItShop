package ru.itshop.service;

import ru.itshop.daoImp.ProductImp;
import ru.itshop.model.Product;

public class ClientServiceImp implements ClientService {
    private ProductImp productImp;

    @Override
    public void buy(Product product) {
        productImp=(ProductImp) product;
        productImp.sellProduct(product);
    }

    @Override
    public void return_product(Product product) {
        productImp=(ProductImp) product;
        productImp.returnProduct(product);
    }

    @Override
    public void exchange(Product product1, Product product2) {
        productImp.exchangeProduct((ProductImp) product1, (ProductImp) product2);
    }

    @Override
    public void look(Product product) {
        productImp=(ProductImp) productImp;
        productImp.selectProduct(productImp);
    }
}
