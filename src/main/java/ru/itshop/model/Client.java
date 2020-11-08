package ru.itshop.model;

import java.io.Serializable;

public class Client implements Model {

    private static final long serialVersionUID = 7931737332645464539L;

    private long id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private boolean vipClient;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isVipClient() {
        return vipClient;
    }

    public void setVipClient(boolean vipClient) {
        this.vipClient = vipClient;
    }

    @Override
    public Serializable getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
