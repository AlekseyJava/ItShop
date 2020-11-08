package ru.itshop.model;

import ru.itshop.dao.ProductDao;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Model {

    private static final long serialVersionUID = 1931737332645464539L;

    private long id;
    private String name;
    private String serialId;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost &&
                Objects.equals(name, product.name) &&
                Objects.equals(serialId, product.serialId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serialId, cost);
    }

    @Override
    public Serializable getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
