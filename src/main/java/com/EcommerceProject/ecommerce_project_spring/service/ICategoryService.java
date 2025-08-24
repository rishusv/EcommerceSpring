package com.EcommerceProject.ecommerce_project_spring.service;


import com.EcommerceProject.ecommerce_project_spring.dtos.CategoryDTO;
import com.EcommerceProject.ecommerce_project_spring.dtos.ProductsDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    public List<CategoryDTO> getAllCategories() throws IOException;
    public List<ProductsDTO> getProductsByCategory(String category) throws IOException;
    public ProductsDTO getProductById(Long id) throws IOException;
}
