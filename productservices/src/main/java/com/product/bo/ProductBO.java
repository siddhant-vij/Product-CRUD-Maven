package com.product.bo;

import com.product.dto.Product;

public interface ProductBO {
  Product createProduct(Product product);

  Product findProduct(int id);

  Product updateProduct(Product product);

  Product deleteProduct(int id);
}
