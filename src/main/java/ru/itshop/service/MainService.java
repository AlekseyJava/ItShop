package ru.itshop.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itshop.database.DatabaseTraidingHall;
import ru.itshop.model.Product;

import java.util.HashSet;
import java.util.Set;

public class MainService {
    public static void main(String[] args) {

        //database singelton
        DatabaseTraidingHall databaseTraidingHall = DatabaseTraidingHall.getInstance();
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring_application_context.xml");


        Product mouse1 = new Product();
        mouse1.setName("mouse defender");
        mouse1.setSerialId("0001");
        mouse1.setCost(200);

        Product mouse2 = new Product();
        mouse2.setName("mouse logitech");
        mouse2.setSerialId("0002");
        mouse2.setCost(900);

        Product keyboard1 = new Product();
        keyboard1.setName("keyboard defender");
        keyboard1.setSerialId("0003");
        keyboard1.setCost(500);


        databaseTraidingHall.addProduct(mouse1);
        databaseTraidingHall.addProduct(mouse2);
        databaseTraidingHall.addProduct(keyboard1);
        databaseTraidingHall.selectProduct("0002");
        databaseTraidingHall.sellProduct(mouse2);
        databaseTraidingHall.returnProduct(mouse2);
        databaseTraidingHall.exchangeProduct(mouse1, keyboard1);
        databaseTraidingHall.selectAllProduct();


    }

}
