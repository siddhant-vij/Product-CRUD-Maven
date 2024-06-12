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

public class ReadProductServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Integer id = Integer.parseInt(request.getParameter("id"));

    ProductBO bo = new ProductBOImpl();
    Product foundProduct = bo.findProduct(id);

    PrintWriter out = response.getWriter();
    out.println("<html><body><h1>Product Details</h1></body></html>");
    out.println("<p>Product ID : " + foundProduct.getId() + "</p>");
    out.println("<p>Product Name : " + foundProduct.getName() + "</p>");
    out.println("<p>Product Description : " + foundProduct.getDescription() + "</p>");
    out.println("<p>Product Price : " + foundProduct.getPrice() + "</p>");
  }
}
