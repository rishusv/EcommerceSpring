package com.EcommerceProject.ecommerce_project_spring.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FakeStoreProductsByCategoryResponseDTO {
    private String status;
    private String message;
    private List<ProductResponseDTO> products;
}
