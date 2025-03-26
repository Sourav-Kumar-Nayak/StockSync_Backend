package com.StockSync.sourav.StockSync.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    private int status;
    private String message;

    //login
    private String token;
    private String role;
    private String expirationTime;

    //pagination
    private Integer totalPages;
    private Long totalElements;

    //data output optional
    private UserDTO user;
    private List<UserDTO> users;

    private SupplierDTO supplier;
    private List<SupplierDTO> suppliers;

    private CategoryDTO category;
    private List<CategoryDTO> categories;

    private ProductDTO product;
    private List<ProductDTO> products;

    private TransactionDTO transaction;
    private List<TransactionDTO> transactions;

    private final LocalDateTime timestamp = LocalDateTime.now();
}

