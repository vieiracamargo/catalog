package com.github.vieiracamargo.api;

import com.github.vieiracamargo.app.ProductService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import software.amazon.awssdk.http.HttpStatusCode;

import java.util.UUID;

@Path("api/v1/product")
public class ProductResource {

    @Inject
    ProductService productService;


    @POST
    public Response createProduct(@Valid ProductRequest request) {
        UUID productId = productService.createProduct(request);
        return Response.status(HttpStatusCode.CREATED).entity(productId).build();
    }
}
