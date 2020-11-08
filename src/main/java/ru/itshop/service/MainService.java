package ru.itshop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import ru.itshop.config.SpringConfig;
import ru.itshop.model.Product;


@Component
public class MainService {
    public static void main(String[] args) {

//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("spring_application_context.xml");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        TradingHallService tradingHallService = (TradingHallService) applicationContext.getBean("tradingHallServiceImp");

        WarehouseService warehouseService = (WarehouseService) applicationContext.getBean("warehouseServiceImp");
        ClientService clientService = (ClientService) applicationContext.getBean("clientServiceImp");

        Product mouse1 = (Product) applicationContext.getBean("mouse_1");
        Product mouse2 = (Product) applicationContext.getBean("mouse_2");
        Product keyboard1 = (Product) applicationContext.getBean("keyboard_1");

        mouse1.setName("mouse defender");
        mouse1.setSerialId("0001");
        mouse1.setCost(200);

        mouse2.setName("mouse logitech");
        mouse2.setSerialId("0002");
        mouse2.setCost(900);

        keyboard1.setName("keyboard defender");
        keyboard1.setSerialId("0003");
        keyboard1.setCost(500);

        System.out.println("\r\nLogs my test traidingHallService");
        tradingHallService.addProduct(mouse1);
        tradingHallService.addProduct(mouse2);
        tradingHallService.addProduct(keyboard1);
        tradingHallService.selectProduct(mouse1);
        tradingHallService.sellProduct(mouse2);
        tradingHallService.returnProduct(mouse2);
        tradingHallService.sellProduct(mouse1);
        tradingHallService.exchangeProduct(mouse1, mouse2);

        System.out.println("\r\nLogs my test WarehouseService");
        warehouseService.deleteProduct(mouse1);
        for(int i=0; i < 10; i++) {
            warehouseService.addProduct(mouse1);
        }
        warehouseService.deleteProduct(mouse1);
        
        System.out.println("\r\nLogs my test ClientService");
        clientService.buy(keyboard1);

        System.out.println("\r\nLogs my test import-resourse");
        Product notebook = (Product) applicationContext.getBean("acer");
        warehouseService.addProduct(notebook);
    }
}
