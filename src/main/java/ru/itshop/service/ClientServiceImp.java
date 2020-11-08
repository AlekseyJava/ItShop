package ru.itshop.service;

import ru.itshop.dao.ClientDao;
import ru.itshop.dao.ProductDao;
import ru.itshop.daoImp.ProductDaoImp;
import ru.itshop.model.Product;

public class ClientServiceImp implements ClientService {
    private ClientDao clientDao;

    public ClientServiceImp(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public void buy(Product product) {
        clientDao.buy(product);
    }

    @Override
    public void return_product(Product product) {
        clientDao.return_product(product);
    }

    @Override
    public void exchange(Product product1, Product product2) {
        clientDao.exchange(product1, product2);
    }

    @Override
    public void look(Product product) {
        clientDao.look(product);
    }
}
