package com.study.shopping.order.model;

//订单
public class Order {
    private Integer id;
    private String status;
    private String address;

    public Order(Integer id, String status, String address) {
        this.id = id;
        this.status = status;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
