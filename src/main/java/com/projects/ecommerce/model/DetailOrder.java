package com.projects.ecommerce.model;

public class DetailOrder {
	private Integer id;
	private String name;
	private Double amount;
	private Double price;
	private Double total;

	public DetailOrder() {
	}

	public DetailOrder(Integer id, String name, Double amount, Double price, Double total) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.total = total;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "DetailOrder{" +
				"id=" + id +
				", name='" + name + '\'' +
				", amount=" + amount +
				", price=" + price +
				", total=" + total +
				'}';
	}
}
