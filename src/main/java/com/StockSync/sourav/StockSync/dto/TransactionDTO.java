package com.StockSync.sourav.StockSync.dto;

import com.StockSync.sourav.StockSync.enums.TransactionStatus;
import com.StockSync.sourav.StockSync.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDTO {


    private Long id;

    private Integer totalProducts;

    private BigDecimal totalPrice;

    private TransactionType transactionType;

    private TransactionStatus transactionStatus;

    private String description;

    private LocalDateTime updatedAt;

    private LocalDateTime createdAt;

    private UserDTO user;

    private SupplierDTO supplier;

    private ProductDTO product;



}
