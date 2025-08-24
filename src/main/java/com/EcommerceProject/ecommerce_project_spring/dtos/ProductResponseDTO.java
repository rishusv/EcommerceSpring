package com.EcommerceProject.ecommerce_project_spring.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponseDTO {

    private String title;
    private String image;
    private double price;
    private String description;
    private String brand;
}
