package com.product.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.product.dto.Product;

public class ProductDAOImplTest {

  @Test
  public void createShouldCreateAProduct() {
    ProductDAO dao = new ProductDAOImpl();
    Product product = new Product();
    product.setId(1);
    product.setName("Product 1");
    product.setDescription("Product 1 description");
    product.setPrice(100);
    Product result = dao.create(product);

    assertNotNull(result);
    assertEquals("Product 1", result.getName());
    assertEquals("Product 1 description", result.getDescription());
    assertEquals(100, result.getPrice());
  }

  @Test
  public void createReadCreateAProduct() {
    ProductDAO dao = new ProductDAOImpl();
    Product product = new Product();
    product.setId(1);
    product.setName("Product 1");
    product.setDescription("Product 1 description");
    product.setPrice(100);
    dao.create(product);

    Product result = dao.read(1);
    assertNotNull(result);
    assertEquals("Product 1", result.getName());
    assertEquals("Product 1 description", result.getDescription());
    assertEquals(100, result.getPrice());
  }
}