package com.github.vieiracamargo.infa;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public interface IProductRepository extends PanacheRepositoryBase<ProductEntity, UUID> {
}
