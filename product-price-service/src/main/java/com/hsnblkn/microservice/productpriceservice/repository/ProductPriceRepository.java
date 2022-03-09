package com.hsnblkn.microservice.productpriceservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hsnblkn.microservice.productpriceservice.entity.ProductPriceEntity;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPriceEntity, Long> {
	Optional<ProductPriceEntity> findByProductId(Long productId);
}
