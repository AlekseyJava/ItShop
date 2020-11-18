package ru.itshop.service;

import ru.itshop.controller.dto.ProductDto;
import ru.itshop.dao.WarehouseDao;
import ru.itshop.model.Product;

public class WarehouseServiceImp implements WarehouseService{

    private WarehouseDao warehouseDao;

    public WarehouseServiceImp(WarehouseDao warehouseDao) {
        this.warehouseDao = warehouseDao;
    }


    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        warehouseDao.addProduct_warehouse(product);
        return productDto;
    }

    @Override
    public ProductDto deleteProduct(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getSerialId(), productDto.getCost());
        warehouseDao.deleteProduct_warehouse(product);
        return productDto;
    }
}
