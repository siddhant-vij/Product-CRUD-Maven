package com.product.dao;

import com.product.dto.Product;

public interface ProductDAO {
  Product create(Product product);

  Product read(int id);

  Product update(Product product);

  Product delete(int id);
}
