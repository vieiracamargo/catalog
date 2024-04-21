package com.github.vieiracamargo.app;

import com.github.vieiracamargo.api.ProductRequest;
import com.github.vieiracamargo.infa.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface IProductJpaMapper {
    @Mapping(target = "title", source = "title")
    @Mapping(target = "price", source = "price")
    @Mapping(target = "description", source = "description")
    @Mapping(target = "category", source = "category")
    ProductEntity toProductEntity(ProductRequest productRequest);
}
