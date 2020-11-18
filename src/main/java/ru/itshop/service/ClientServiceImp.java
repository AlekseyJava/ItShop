package ru.itshop.service;

import ru.itshop.controller.dto.ProductDto;
import ru.itshop.dao.ClientDao;
import ru.itshop.model.Product;

public class ClientServiceImp implements ClientService {

    private ClientDao clientDao;

    public ClientServiceImp(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public ProductDto buy(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        clientDao.buy(product);
        return productDto;
    }

    @Override
    public ProductDto return_product(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        clientDao.return_product(product);
        return productDto;
    }

    @Override
    public ProductDto exchange(ProductDto productDto1, ProductDto productDto2) {
        Product product1 = new Product(productDto1.getId(), productDto1.getName(), productDto1.getSerialId(), productDto1.getCost());
        Product product2 = new Product(productDto2.getId(), productDto2.getName(), productDto2.getSerialId(), productDto2.getCost());
        clientDao.exchange(product1, product2);
        return productDto2;
    }

    @Override
    public ProductDto look(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        clientDao.look(product);
        return productDto;
    }
}
