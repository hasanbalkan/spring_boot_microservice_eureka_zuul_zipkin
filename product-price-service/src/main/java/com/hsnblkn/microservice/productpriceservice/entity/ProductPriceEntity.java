package com.hsnblkn.microservice.productpriceservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_PRICE")
public class ProductPriceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "PRODUCT_ID")
	private Long productId;

	@Column(name = "PRICE")
	private BigDecimal price;

	public Long getId() {
		return id;
	}

	public Long getProductId() {
		return productId;
	}

	public BigDecimal getPrice() {
		return price;
	}
}
