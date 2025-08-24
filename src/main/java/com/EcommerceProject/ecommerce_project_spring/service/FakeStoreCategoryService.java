package com.EcommerceProject.ecommerce_project_spring.service;


import com.EcommerceProject.ecommerce_project_spring.dtos.CategoryDTO;
import com.EcommerceProject.ecommerce_project_spring.dtos.ProductsByCategoryDTO;
import com.EcommerceProject.ecommerce_project_spring.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{

    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }

    @Override
    public List<ProductsByCategoryDTO> getProductsByCategory(String category) throws IOException {
        return this.categoryGateway.getAllProductsByCategory(category);
    }
}
