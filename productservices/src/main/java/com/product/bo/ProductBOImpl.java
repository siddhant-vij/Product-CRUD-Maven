package com.product.bo;

import com.product.dao.ProductDAO;
import com.product.dao.ProductDAOImpl;
import com.product.dto.Product;

public class ProductBOImpl implements ProductBO {
  private static ProductDAO dao = new ProductDAOImpl();

  @Override
  public Product createProduct(Product product) {
    return dao.create(product);
  }

  @Override
  public Product findProduct(int id) {
    return dao.read(id);
  }

  @Override
  public Product updateProduct(Product product) {
    return dao.update(product);
  }

  @Override
  public Product deleteProduct(int id) {
    return dao.delete(id);
  }
}
