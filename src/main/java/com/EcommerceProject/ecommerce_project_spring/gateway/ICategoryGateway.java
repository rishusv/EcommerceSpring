package com.EcommerceProject.ecommerce_project_spring.gateway;

import com.EcommerceProject.ecommerce_project_spring.dtos.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<CategoryDTO> getAllCategories() throws IOException; // we want to return a list of CategoryDTO objects in our API
}
