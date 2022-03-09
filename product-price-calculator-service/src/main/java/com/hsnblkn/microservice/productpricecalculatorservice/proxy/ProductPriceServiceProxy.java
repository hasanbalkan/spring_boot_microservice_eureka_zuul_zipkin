package com.hsnblkn.microservice.productpricecalculatorservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hsnblkn.microservice.productpricecalculatorservice.model.ProductPriceCalculateModel;

//@FeignClient(name = "product-price-service", url = "${PRODUCT_PRICE_SERVICE_URL}")
//@FeignClient(name = "product-price-service")
@FeignClient(name = "zuul-server")
public interface ProductPriceServiceProxy {

//	@GetMapping("/price/productId/{productId}")
	@GetMapping("/product-price-service/price/productId/{productId}")
	public ProductPriceCalculateModel getProductPrice(@PathVariable("productId") Long productId);

}
