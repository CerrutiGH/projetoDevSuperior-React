package com.cerruti.cerrutivendar.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "tb_sales")
public class Sale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idLong;
private Integer visited;
private Integer deals;
private Double amount;
private LocalDate date;


@ManyToOne
@JoinColumn(name = "seller_id")
private Seller seller;

public Sale() {
	
}

public Sale(Long idLong, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
	this.idLong = idLong;
	this.visited = visited;
	this.deals = deals;
	this.amount = amount;
	this.date = date;
	this.seller = seller;
}

public Long getIdLong() {
	return idLong;
}

public void setIdLong(Long idLong) {
	this.idLong = idLong;
}

public Integer getVisited() {
	return visited;
}

public void setVisited(Integer visited) {
	this.visited = visited;
}

public Integer getDeals() {
	return deals;
}

public void setDeals(Integer deals) {
	this.deals = deals;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public Seller getSeller() {
	return seller;
}

public void setSeller(Seller seller) {
	this.seller = seller;
}



}
