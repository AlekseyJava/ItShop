package ru.itshop.service;

import ru.itshop.dao.ProductDao;
import ru.itshop.daoImp.ProductImp;

public class TraidingHallServiceImp implements TraidingHallService{

    private ProductImp productImp;

    public TraidingHallServiceImp(ProductImp productImp) {
    }

    @Override
    public void sellProduct(ProductDao product) {
        productImp=(ProductImp) product;
        productImp.sellProduct(productImp);
    }

    @Override
    public void returnProduct(ProductDao product) {
        productImp=(ProductImp) product;
        productImp.returnProduct(productImp);
    }

    @Override
    public void exchangeProduct(ProductDao product1, ProductDao product2) {
        productImp.exchangeProduct((ProductImp) product1, (ProductImp) product2);
    }

    @Override
    public void selectProduct(ProductDao product) {
        productImp=(ProductImp) product;
        productImp.selectProduct(productImp);
    }

    @Override
    public void addProduct(ProductDao product) {
        productImp=(ProductImp) product;
        productImp.addProduct(productImp);
    }

    public ProductImp getProductImp() {
        return productImp;
    }

    public void setProductImp(ProductImp productImp) {
        this.productImp = productImp;
    }
}
