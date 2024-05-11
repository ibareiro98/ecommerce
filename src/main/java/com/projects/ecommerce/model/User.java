package com.projects.ecommerce.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String user_name;
    private String email;
    private String direction;
    private String telephone;
    private String type;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Product> product;

    @OneToMany(mappedBy = "user")
    private List<Order> order;

    public User() {
    }

    public User(Integer id, String name, String user_name, String email, String direction, String telephone, String type, String password) {
        this.id = id;
        this.name = name;
        this.user_name = user_name;
        this.email = email;
        this.direction = direction;
        this.telephone = telephone;
        this.type = type;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", direction='" + direction + '\'' +
                ", telephone='" + telephone + '\'' +
                ", type='" + type + '\'' +
                ", password='" + password + '\'' +
                ", product=" + product +
                ", order=" + order +
                '}';
    }
}
