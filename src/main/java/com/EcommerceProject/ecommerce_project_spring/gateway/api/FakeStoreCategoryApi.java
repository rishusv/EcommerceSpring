package com.EcommerceProject.ecommerce_project_spring.gateway.api;

import com.EcommerceProject.ecommerce_project_spring.dtos.FakeStoreCategoryResponseDTO;
import com.EcommerceProject.ecommerce_project_spring.dtos.FakeStoreProductsByCategoryResponseDTO;
import com.EcommerceProject.ecommerce_project_spring.dtos.FakeStoreSingleProductResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllCategories();

    @GET("products/category")
    Call<FakeStoreProductsByCategoryResponseDTO> getAllProductsByCategory(@Query("type") String type);

    @GET("products/{id}")
    Call<FakeStoreSingleProductResponseDTO> getProductById(@Path("id") Long id);

}
