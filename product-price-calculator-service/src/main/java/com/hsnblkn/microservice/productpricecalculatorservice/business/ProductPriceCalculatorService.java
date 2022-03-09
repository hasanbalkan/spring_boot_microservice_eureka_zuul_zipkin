package com.hsnblkn.microservice.productpricecalculatorservice.business;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsnblkn.microservice.productpricecalculatorservice.model.ProductPriceCalculateModel;
import com.hsnblkn.microservice.productpricecalculatorservice.proxy.ProductPriceServiceProxy;

@Service
public class ProductPriceCalculatorService {

	@Autowired
	private ProductPriceServiceProxy productPriceServiceProxy;

	public ProductPriceCalculateModel calculatePrice(Long productId, Long quantity) {

		ProductPriceCalculateModel productPriceModel = productPriceServiceProxy.getProductPrice(productId);

		BigDecimal productPrice = productPriceModel.getPrice().multiply(BigDecimal.valueOf(quantity));
		return new ProductPriceCalculateModel(productId, productPrice);
	}

}
