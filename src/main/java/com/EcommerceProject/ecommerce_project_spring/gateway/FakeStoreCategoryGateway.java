package com.EcommerceProject.ecommerce_project_spring.gateway;

import com.EcommerceProject.ecommerce_project_spring.dtos.*;
import com.EcommerceProject.ecommerce_project_spring.gateway.api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{

    FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi) {
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO fakeStoreCategoryResponseDTO = this.fakeStoreCategoryApi.getAllCategories().execute().body();

        if (fakeStoreCategoryResponseDTO == null) {
            throw new IOException("Failed to fetch categories from FakeStore API");
        }
        return fakeStoreCategoryResponseDTO.getCategories()
                .stream()
                .map(category -> CategoryDTO.builder()
                .name(category)
                .build())
                .toList();
    }

    @Override
    public List<ProductsDTO> getAllProductsByCategory(String category) throws IOException {
        FakeStoreProductsByCategoryResponseDTO fakeStoreProductsByCategoryResponseDTO = this.fakeStoreCategoryApi.getAllProductsByCategory(category).execute().body();

        if(fakeStoreProductsByCategoryResponseDTO == null) {
            throw new IOException("Failed to fetch products by category from FakeStore API");
        }

        return fakeStoreProductsByCategoryResponseDTO.getProducts()
                .stream()
                .map(product -> ProductsDTO.builder()
                        .title(product.getTitle())
                        .description(product.getDescription())
                        .price(product.getPrice())
                        .image(product.getImage())
                        .brand(product.getBrand())
                        .build())
                .toList();
    }

    @Override
    public ProductsDTO getProductById(Long id) throws IOException {
        FakeStoreSingleProductResponseDTO fakeStoreSingleProductResponseDTO = this.fakeStoreCategoryApi.getProductById(id).execute().body();

        if(fakeStoreSingleProductResponseDTO == null) {
            throw new IOException("Failed to fetch product by ID from FakeStore API");
        }
        System.out.println(fakeStoreSingleProductResponseDTO);
        return fakeStoreSingleProductResponseDTO.getProduct();
    }


}
