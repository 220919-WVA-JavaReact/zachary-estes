package com.revature.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class SanityServlet extends HttpServlet {

    public void init() throws ServletException {
        System.out.println("[LOG] - SanityServlet Instantiated");
        System.out.println("[LOG] - Init parameter test-init-key: " + this.getServletConfig().getInitParameter("test-init-value"));
        System.out.println("[LOG] - Init parameter test-init-key: " +
    }

    public void destroy(){
        System.out.println("[LOG] - SanityServlet Destroyed");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("[LOG] - SanityServlet received a request at " + LocalDateTime.now());
        System.out.println("[LOG] - Request URI: " + req.getRequestURI());
        System.out.println("[LOG] - Request Method " + req.getMethod());
        System.out.println("[LOG] - Request Header, example: " + req.getHeader("example"));

        resp.setStatus(200);
        resp.setHeader("Content-type", "text/plain");
        resp.setHeader("example-response-header", "some-example-value");
        resp.getWriter().write("This is the response payload");
    }
}
