package com.example.fstore_practical.controller.product;

import com.example.fstore_practical.entity.tbProducts;
import com.example.fstore_practical.model.ProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetListProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductModel model = new ProductModel();
        List<tbProducts> listObj = model.findAll();
        req.setAttribute("listObj",listObj);
        req.getRequestDispatcher("/products/ListProduct.jsp").forward(req,resp);
    }
}
