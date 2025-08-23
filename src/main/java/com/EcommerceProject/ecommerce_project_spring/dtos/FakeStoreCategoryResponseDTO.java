package com.EcommerceProject.ecommerce_project_spring.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreCategoryResponseDTO {

    private String status;
    private String message;
    private List<String> categories;
}
