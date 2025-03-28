package com.StockSync.sourav.StockSync.service;

import com.StockSync.sourav.StockSync.dto.ProductDTO;
import com.StockSync.sourav.StockSync.dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {

    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response updateProduct(ProductDTO productDTO,MultipartFile imageFile);

    Response getAllProducts();

    Response getProductById(Long id);

    Response deleteProduct(Long id);

}
