package com.EcommerceProject.ecommerce_project_spring.service;


import com.EcommerceProject.ecommerce_project_spring.dtos.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    public List<CategoryDTO> getAllCategories() throws IOException;
}
