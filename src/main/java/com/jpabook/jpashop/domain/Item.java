package com.jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ITEM_ID")
	private Long id;

	private String name;
	private int price;
	private int stockQuantity;

	public Long getId() {
		return id;
	}

	public Item setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Item setName(String name) {
		this.name = name;
		return this;
	}

	public int getPrice() {
		return price;
	}

	public Item setPrice(int price) {
		this.price = price;
		return this;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public Item setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
		return this;
	}
}