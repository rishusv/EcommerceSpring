package com.EcommerceProject.ecommerce_project_spring.controller;

import com.EcommerceProject.ecommerce_project_spring.dtos.CategoryDTO;
import com.EcommerceProject.ecommerce_project_spring.dtos.ProductsDTO;
import com.EcommerceProject.ecommerce_project_spring.service.ICategoryService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    ICategoryService categoryService;

    CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryService.getAllCategories();
    }

    @GetMapping("/products")
    public List<ProductsDTO> getProductsByCategory(@RequestParam String type) throws IOException {
        return this.categoryService.getProductsByCategory(type);
    }

    @GetMapping("/product/{id}")
    public ProductsDTO getSingleProductById(@PathVariable Long id) throws IOException {
        return this.categoryService.getProductById(id); // Placeholder return statement
    }
}
