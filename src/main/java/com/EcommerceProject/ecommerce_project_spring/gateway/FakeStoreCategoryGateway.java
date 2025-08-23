package com.EcommerceProject.ecommerce_project_spring.gateway;

import com.EcommerceProject.ecommerce_project_spring.dtos.CategoryDTO;
import com.EcommerceProject.ecommerce_project_spring.dtos.FakeStoreCategoryResponseDTO;
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
        return fakeStoreCategoryResponseDTO.getCategories().stream().map(category -> CategoryDTO.builder()
                .name(category)
                .build()).toList();
    }
}
