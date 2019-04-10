package com.gupao.delegate.mvc;

import com.gupao.delegate.mvc.controller.BusController;
import com.gupao.delegate.mvc.controller.SysController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String requestURI = req.getRequestURI();
        if ("bus".equals(requestURI)){
            new BusController().doThing();
        }else if ("sys".equals(requestURI)){
            new SysController().doThing();
        }

    }
}
