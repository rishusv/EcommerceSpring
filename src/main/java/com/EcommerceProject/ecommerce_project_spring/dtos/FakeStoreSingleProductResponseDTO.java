package com.EcommerceProject.ecommerce_project_spring.dtos;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FakeStoreSingleProductResponseDTO {
    private String status;
    private String message;
    private ProductsDTO product;
}
