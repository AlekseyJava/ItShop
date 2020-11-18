package ru.itshop.service;

import ru.itshop.controller.dto.ProductDto;

public interface TradingHallService {

    //    продать товар - sellProduct
    ProductDto sellProduct(ProductDto productDto);

    //    сделать возврат товара - returnProduct
    ProductDto returnProduct(ProductDto productDto);

    //    обменять товар – exchangeProduct
    ProductDto exchangeProduct(ProductDto productDto1, ProductDto productDto2);

    //    выбрать товар для просмотра характеристик - selectProduct
    ProductDto selectProduct(ProductDto productDto);

    //    взять товар со склада – addProduct
    ProductDto addProduct(ProductDto productDto);

}
