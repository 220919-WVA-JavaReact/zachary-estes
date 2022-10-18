package com.revature.servlets;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Flashcard;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(
//        urlPatterns = "/flashcard",
//        loadOnStartup = 2,
//        initParams = {
//                @WebInitParam(name = "flashcard-servlet-key", value = "flashcard-servlet-value"),
//                @WebInitParam(name = "another-param", value = "another-value")
//        }
//)
public class FlashcardServlet extends HttpServlet {

    private final ObjectMapper mapper;

    public FlashcardServlet(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void init() throws ServletException {
        System.out.println("[LOG] - FlashcardServlet Instantiated");
        System.out.println("[LOG] - Init param flashcard-servlet-key: " + this.getServletConfig().getInitParameter("flashcard-servlet-key"));
        System.out.println("[LOG] Init param test-init-key: " + this.getServletConfig().getInitParameter("test-init-key"));
        System.out.println("[LOG] - Context param test-init-key: " + this.getServletConfig().getInitParameter("test-context-key"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Flashcard card = new Flashcard(123, "What does OOP stand for", "example");
        String respPayload = mapper.writeValueAsString(card);
        resp.setContentType("application/json");
        resp.getWriter().write(respPayload);
    }
}
