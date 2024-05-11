package com.projects.ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String description;
	private String image;
	private Double price;
	private Integer amount;

	@ManyToOne
	private User user;

	public Product() {
	}

	public Product(Integer id, String name, String description, String image, Double price, Integer amount, com.projects.ecommerce.model.User user) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
		this.amount = amount;
		this.user = user;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public com.projects.ecommerce.model.User getUser() {
		return user;
	}

	public void setUser(com.projects.ecommerce.model.User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", image='" + image + '\'' +
				", price=" + price +
				", amount=" + amount +
				", user=" + user +
				'}';
	}
}
