package com.datajpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String name;

	// created one separate table and add customer id & item id

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "Customer_Item", joinColumns = { @JoinColumn(name = "customer_id") }, inverseJoinColumns = {
                             @JoinColumn(name = "Item_id") })
	private Item item;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
