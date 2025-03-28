package com.StockSync.sourav.StockSync.controller;

import com.StockSync.sourav.StockSync.dto.ProductDTO;
import com.StockSync.sourav.StockSync.dto.Response;
import com.StockSync.sourav.StockSync.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/products")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/all")
    public ResponseEntity<Response> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping("/add")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> saveProduct
            (
                    @RequestParam("imageFile") MultipartFile imageFile,
                    @RequestParam("name") String name,
                    @RequestParam("sku") String sku,
                    @RequestParam("price")BigDecimal price,
                    @RequestParam("stockQuantity") Integer stockQuantity,
                    @RequestParam("categoryId") Long categoryId,
                    @RequestParam(value = "description", required = false) String description
            )
    {

        ProductDTO productDTOToSave = new ProductDTO();
        productDTOToSave.setName(name);
        productDTOToSave.setSku(sku);
        productDTOToSave.setPrice(price);
        productDTOToSave.setStockQuantity(stockQuantity);
        productDTOToSave.setCategoryId(categoryId);
        productDTOToSave.setDescription(description);

        System.out.println(productDTOToSave);

        return ResponseEntity.ok(productService.saveProduct(productDTOToSave,imageFile));
    }

    @PutMapping("/update/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> updateProduct
            (
                    @RequestParam(value = "imageFile", required = false) MultipartFile imageFile,
                    @RequestParam(value = "name", required = false) String name,
                    @RequestParam(value = "sku", required = false) String sku,
                    @RequestParam(value = "price", required = false)BigDecimal price,
                    @RequestParam(value = "stockQuantity", required = false) Integer stockQuantity,
                    @RequestParam(value = "productId", required = true) Long productId,
                    @RequestParam(value = "categoryId", required = false) Long categoryId,
                    @RequestParam(value = "description", required = false) String description
            )

    {

            ProductDTO productDTOToSave = new ProductDTO();
            productDTOToSave.setName(name);
            productDTOToSave.setSku(sku);
            productDTOToSave.setPrice(price);
            productDTOToSave.setStockQuantity(stockQuantity);
            productDTOToSave.setCategoryId(categoryId);
            productDTOToSave.setProductId(productId);
            productDTOToSave.setDescription(description);

            return ResponseEntity.ok(productService.updateProduct(productDTOToSave,imageFile));
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<Response> deleteProduct(@PathVariable Long id) {
        return ResponseEntity.ok(productService.deleteProduct(id));
    }

}
