package ru.itshop.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itshop.controller.dto.ProductDto;
import ru.itshop.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientService clientService;

    @RequestMapping("/buy")
    public String buy(@RequestBody ProductDto productDto) {
        clientService.buy(productDto);
        return "product buy";
    }

    @RequestMapping("/return")
    public String returnProduct(@RequestBody ProductDto productDto) {
        clientService.return_product(productDto);
        return "product return";
    }
    @RequestMapping("/exchange")
    public String exchange(@RequestBody ProductDto productDto1, ProductDto productDto2) {
        clientService.exchange(productDto1, productDto2);
        return "product exchange";
    }

    @RequestMapping("/look")
    public String look(@RequestBody ProductDto productDto) {
        clientService.look(productDto);
        return "product look";
    }
}
