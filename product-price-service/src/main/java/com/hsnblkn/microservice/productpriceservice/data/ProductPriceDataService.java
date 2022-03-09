package com.hsnblkn.microservice.productpriceservice.data;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hsnblkn.microservice.productpriceservice.entity.ProductPriceEntity;
import com.hsnblkn.microservice.productpriceservice.repository.ProductPriceRepository;

@Component
public class ProductPriceDataService {

	@Autowired
	private ProductPriceRepository productPriceRepository;

	public Optional<ProductPriceEntity> findByProductId(Long productId) {
		return productPriceRepository.findByProductId(productId);
	}

}
