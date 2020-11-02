package ru.itshop.service;

import ru.itshop.daoImp.ProductDaoImp;
import ru.itshop.model.Product;

public class ClientServiceImp implements ClientService {
    private ProductDaoImp productDaoImp;

    @Override
    public void buy(Product product) {
        productDaoImp =(ProductDaoImp) product;
        productDaoImp.sellProduct(product);
    }

    @Override
    public void return_product(Product product) {
        productDaoImp =(ProductDaoImp) product;
        productDaoImp.returnProduct(product);
    }

    @Override
    public void exchange(Product product1, Product product2) {
        productDaoImp.exchangeProduct((ProductDaoImp) product1, (ProductDaoImp) product2);
    }

    @Override
    public void look(Product product) {
        productDaoImp =(ProductDaoImp) productDaoImp;
        productDaoImp.selectProduct(productDaoImp);
    }
}
