package ru.itshop.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itshop.controller.dto.ProductDto;
import ru.itshop.service.TradingHallService;

@RestController
@RequestMapping("/traidingHall")
public class TradingHallController {
    private TradingHallService tradingHallService;

    @RequestMapping("/add")
    public String add(@RequestBody ProductDto productDto) {
        tradingHallService.addProduct(productDto);
        return "product add";
    }

    @RequestMapping("/return")
    public String returnProduct(@RequestBody ProductDto productDto) {
        tradingHallService.returnProduct(productDto);
        return "product return";
    }

    @RequestMapping("/exchange")
    public String exchange(@RequestBody ProductDto productDto1, ProductDto productDto2) {
        tradingHallService.exchangeProduct(productDto1, productDto2);
        return "product exchange";
    }

    @RequestMapping("/sell")
    public String sell(@RequestBody ProductDto productDto) {
        tradingHallService.sellProduct(productDto);
        return "product sell";
    }

    @RequestMapping("/select")
    public String select(@RequestBody ProductDto productDto) {
        tradingHallService.selectProduct(productDto);
        return "product select";
    }
}
