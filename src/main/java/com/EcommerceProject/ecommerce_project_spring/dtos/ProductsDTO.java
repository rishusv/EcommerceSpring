package com.EcommerceProject.ecommerce_project_spring.dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductsDTO {
    private String title;
    private String image;
    private double price;
    private String description;
    private String brand;
}
