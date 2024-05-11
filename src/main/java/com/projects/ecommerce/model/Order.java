package com.projects.ecommerce.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date creation_date;
    private Date reception_date;
    private double total;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "order")
    private DetailOrder detailOrder;

    public Order() {
    }

    public Order(Integer id, String number, Date creation_date, Date reception_date, double total) {
        this.id = id;
        this.number = number;
        this.creation_date = creation_date;
        this.reception_date = reception_date;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getReception_date() {
        return reception_date;
    }

    public void setReception_date(Date reception_date) {
        this.reception_date = reception_date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DetailOrder getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(DetailOrder detailOrder) {
        this.detailOrder = detailOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", creation_date=" + creation_date +
                ", reception_date=" + reception_date +
                ", total=" + total +
                ", user=" + user +
                ", detailOrder=" + detailOrder +
                '}';
    }
}
