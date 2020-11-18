package ru.itshop.service;

import ru.itshop.controller.dto.ProductDto;
import ru.itshop.model.Product;

public interface WarehouseService {
    ProductDto addProduct(ProductDto productDto);
    ProductDto deleteProduct(ProductDto productDto);
}
