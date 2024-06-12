package com.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.product.bo.ProductBO;
import com.product.bo.ProductBOImpl;
import com.product.dto.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreateProductServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Integer id = Integer.parseInt(request.getParameter("id"));
    String name = request.getParameter("name");
    String description = request.getParameter("description");
    Integer price = Integer.parseInt(request.getParameter("price"));

    Product product = new Product();
    product.setId(id);
    product.setName(name);
    product.setDescription(description);
    product.setPrice(price);

    ProductBO bo = new ProductBOImpl();
    Product createdProduct = bo.createProduct(product);

    PrintWriter out = response.getWriter();
    out.println("<html><body><h1>Product created successfully</h1></body></html>");
    out.println("<p>Product ID : " + createdProduct.getId() + "</p>");
    out.println("<p>Product Name : " + createdProduct.getName() + "</p>");
    out.println("<p>Product Description : " + createdProduct.getDescription() + "</p>");
    out.println("<p>Product Price : " + createdProduct.getPrice() + "</p>");
  }
}
