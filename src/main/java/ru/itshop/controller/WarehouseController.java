package ru.itshop.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itshop.controller.dto.ProductDto;
import ru.itshop.service.WarehouseService;

@RestController
@RequestMapping("warehouse")
public class WarehouseController {
    private WarehouseService warehouseService;

    @RequestMapping("/add")
    public String add(@RequestBody ProductDto productDto) {
        warehouseService.addProduct(productDto);
        return "product add";
    }

    @RequestMapping("/delete")
    public String delete(@RequestBody ProductDto productDto) {
        warehouseService.deleteProduct(productDto);
        return "product delete";
    }
}
