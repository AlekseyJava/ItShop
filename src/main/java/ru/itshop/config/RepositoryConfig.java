package ru.itshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import ru.itshop.model.Product;

@Component
public class RepositoryConfig {

    @Bean()
    public Product acer() {
        return new Product();
    }

    @Bean()
    public Product hp() {
        return new Product();
    }

    @Lazy
    @Bean()
    public Product lenovo() {
        return new Product();
    }
}
