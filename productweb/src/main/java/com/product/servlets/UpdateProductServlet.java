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

public class UpdateProductServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Integer id = Integer.parseInt(request.getParameter("id"));

    ProductBO bo = new ProductBOImpl();
    Product foundProduct = bo.findProduct(id);

    if (foundProduct == null) {
      PrintWriter out = response.getWriter();
      out.println("<html><body><h1>Product not found</h1></body></html>");
      return;
    }

    String name = request.getParameter("name");
    if (name != null && !name.isEmpty()) {
      foundProduct.setName(name);
    }

    String description = request.getParameter("description");
    if (description != null && !description.isEmpty()) {
      foundProduct.setDescription(description);
    }

    Integer price = Integer.parseInt(request.getParameter("price"));
    if (price > 0) {
      foundProduct.setPrice(price);
    }

    Product updatedProduct = bo.updateProduct(foundProduct);

    PrintWriter out = response.getWriter();
    out.println("<html><body><h1>Product created successfully</h1></body></html>");
    out.println("<p>Product ID : " + updatedProduct.getId() + "</p>");
    out.println("<p>Product Name : " + updatedProduct.getName() + "</p>");
    out.println("<p>Product Description : " + updatedProduct.getDescription() + "</p>");
    out.println("<p>Product Price : " + updatedProduct.getPrice() + "</p>");
  }
}
