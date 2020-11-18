package ru.itshop.service;

import ru.itshop.controller.dto.ProductDto;

public interface ClientService {
    ProductDto buy(ProductDto productDto);
    ProductDto return_product(ProductDto productDto);
    ProductDto exchange(ProductDto productDto1, ProductDto productDto2);
    ProductDto look(ProductDto productDto);
}
