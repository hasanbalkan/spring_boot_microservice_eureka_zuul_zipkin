package com.hsnblkn.microservice.productpriceservice.model;

import java.math.BigDecimal;

public class ProductPriceModel {

	private Long productId;
	private BigDecimal price;

	public ProductPriceModel() {
	}

	public ProductPriceModel(Long productId, BigDecimal price) {
		super();
		this.productId = productId;
		this.price = price;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
