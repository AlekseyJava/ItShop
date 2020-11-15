package ru.itshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itshop.dao.ClientDao;
import ru.itshop.model.Product;

@RestController
public class ClientController {

    private ClientDao clientDao;
    private Product product;

    @RequestMapping(value = "/buy")
    public String buy() {
//        product.setName("printer");
//        clientDao.buy(product);
        return "product bought";
    }
}
