package com.hsnblkn.microservice.productpriceservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsnblkn.microservice.productpriceservice.data.ProductPriceDataService;
import com.hsnblkn.microservice.productpriceservice.entity.ProductPriceEntity;
import com.hsnblkn.microservice.productpriceservice.model.ProductPriceModel;

@RestController
@RequestMapping("price")
public class ProductPriceController {

	private static final Logger LOG = LoggerFactory.getLogger(ProductPriceController.class);

	@Autowired
	private ProductPriceDataService productPriceDataService;

	@GetMapping("productId/{productId}")
	public ProductPriceModel getProductPrice(@PathVariable Long productId) {

		LOG.info("productId : {}", productId);

		return productPriceDataService.findByProductId(productId).map(this::convertToProductPriceModel)
				.orElseThrow(() -> new RuntimeException("productId not found: " + productId));

	}

	private ProductPriceModel convertToProductPriceModel(ProductPriceEntity entity) {
		return new ProductPriceModel(entity.getProductId(), entity.getPrice());
	}

}
