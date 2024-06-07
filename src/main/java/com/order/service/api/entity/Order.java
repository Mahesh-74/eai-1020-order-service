package com.order.service.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TBL")
public class Order {

	@Id
	private Integer id;
	private String name;
	private Integer qty;
	private Double price;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, String name, Integer qty, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
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

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}

}
