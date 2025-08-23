package com.EcommerceProject.ecommerce_project_spring.gateway.api;

import com.EcommerceProject.ecommerce_project_spring.dtos.FakeStoreCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllCategories();
}
