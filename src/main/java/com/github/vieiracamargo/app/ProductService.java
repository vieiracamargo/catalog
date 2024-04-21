package com.github.vieiracamargo.app;

import com.github.vieiracamargo.api.ProductRequest;
import com.github.vieiracamargo.infa.IProductRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.UUID;

@ApplicationScoped
public class ProductService {
    @Inject
    IProductRepository productRepository;

    @Inject
    IProductJpaMapper productJpaMapper;

    @Transactional
    public UUID createProduct(ProductRequest request) {
        var entity = productJpaMapper.toProductEntity(request);
        productRepository.persist(entity);
        return entity.getUuid();
    }
}
