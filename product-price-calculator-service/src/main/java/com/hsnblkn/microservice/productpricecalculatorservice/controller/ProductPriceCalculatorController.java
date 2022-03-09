package com.hsnblkn.microservice.productpricecalculatorservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsnblkn.microservice.productpricecalculatorservice.business.ProductPriceCalculatorService;
import com.hsnblkn.microservice.productpricecalculatorservice.model.ProductPriceCalculateModel;

@RestController
@RequestMapping("price-calculate")
public class ProductPriceCalculatorController {

	private static final Logger LOG = LoggerFactory.getLogger(ProductPriceCalculatorController.class);

	@Autowired
	private ProductPriceCalculatorService productPriceCalculatorService;

	@GetMapping("productId/{productId}/quantity/{quantity}")
	public ProductPriceCalculateModel getProductPrice(@PathVariable Long productId, @PathVariable Long quantity) {

		LOG.info("productId : {}, quantity : {}", productId, quantity);

		return productPriceCalculatorService.calculatePrice(productId, quantity);

	}
}
