package ru.itshop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itshop.daoImp.ProductImp;

public class MainService {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring_application_context.xml");

        TraidingHallService traidingHallService = (TraidingHallService) applicationContext.getBean("traidingHallServiceImp");
        WarehouseService warehouseService = (WarehouseService) applicationContext.getBean("WarehouseServiceImp");
        ClientService clientService = (ClientService) applicationContext.getBean("ClientServiceImp");

        ProductImp mouse1 = (ProductImp) applicationContext.getBean("mouse_1");
        ProductImp mouse2 = (ProductImp) applicationContext.getBean("mouse_2");
        ProductImp keyboard1 = (ProductImp)  applicationContext.getBean("keyboard_1");

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
        traidingHallService.addProduct(mouse1);
        traidingHallService.addProduct(mouse2);
        traidingHallService.addProduct(keyboard1);
        traidingHallService.selectProduct(mouse1);
        traidingHallService.sellProduct(mouse2);
        traidingHallService.returnProduct(mouse2);
        traidingHallService.sellProduct(mouse1);
        traidingHallService.exchangeProduct(mouse1, mouse2);

        System.out.println("\r\nLogs my test WarehouseService");
        for(int i=0; i < 10; i++) {
            warehouseService.addProduct(mouse1);
        }
        warehouseService.deleteProduct(mouse1);

        System.out.println("\r\nLogs my test ClientService");
        clientService.buy(keyboard1);
    }
}
