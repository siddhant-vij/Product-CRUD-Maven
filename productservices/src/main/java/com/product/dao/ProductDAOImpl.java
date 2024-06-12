package com.product.dao;

import java.util.Map;
import java.util.HashMap;

import com.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {
  private Map<Integer, Product> products = new HashMap<>();

  @Override
  public Product create(Product product) {
    products.put(product.getId(), product);
    return product;
  }

  @Override
  public Product read(int id) {
    return products.get(id);
  }

  @Override
  public Product update(Product product) {
    products.put(product.getId(), product);
    return product;
  }

  @Override
  public Product delete(int id) {
    return products.remove(id);
  }
}
