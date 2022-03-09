package com.hsnblkn.microservice.productpricecalculatorservice.model;

import java.math.BigDecimal;

public class ProductPriceCalculateModel {

	private Long productId;
	private BigDecimal price;

	public ProductPriceCalculateModel() {
	}

	public ProductPriceCalculateModel(Long productId, BigDecimal price) {
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
