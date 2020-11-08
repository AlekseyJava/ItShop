package ru.itshop.model;

import java.io.Serializable;
import java.util.List;

public class TradingHall implements Model{

    private List<Product> products;

    @Override
    public Serializable getId() {
        return null;
    }
}
