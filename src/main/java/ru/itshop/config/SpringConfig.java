package ru.itshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import ru.itshop.dao.TradingHallDao;
import ru.itshop.daoImp.ClientDaoImp;
import ru.itshop.daoImp.ProductDaoImp;
import ru.itshop.daoImp.TradingHallDaoImpl;
import ru.itshop.daoImp.WarehouseDaoImpl;
import ru.itshop.model.Product;
import ru.itshop.service.ClientServiceImp;
import ru.itshop.service.TradingHallServiceImp;
import ru.itshop.service.WarehouseServiceImp;

@Configuration
@PropertySource("application.properties")
@ComponentScan("ru.itshop")
//@Import(RepositoryConfig.class)

public class SpringConfig {

    @Bean()
    public TradingHallDaoImpl tradingHallDaoImpl() {
        return new TradingHallDaoImpl();
    }

    @Bean()
    public WarehouseDaoImpl warehouseDaoImpl() {
        return new WarehouseDaoImpl();
    }

    @Bean()
    public ClientDaoImp clientDaoImp() {
        return new ClientDaoImp();
    }

    @Bean()
    public Product mouse_1() {
        return new Product();
    }

    @Bean()
    public Product mouse_2() {
        return new Product();
    }

    @Bean()
    public Product keyboard_1() {
        return new Product();
    }

    @Bean(name = "tradingHallServiceImp")
    public TradingHallServiceImp tradingHallServiceImp () {
        return new TradingHallServiceImp(tradingHallDaoImpl());
    }

    @Bean
    public WarehouseServiceImp warehouseServiceImp() {
        return new WarehouseServiceImp(warehouseDaoImpl());
    }

    @Bean
    public ClientServiceImp clientServiceImp() {
        return new ClientServiceImp(clientDaoImp());
    }

}
