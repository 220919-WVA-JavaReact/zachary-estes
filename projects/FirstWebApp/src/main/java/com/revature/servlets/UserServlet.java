package com.revature.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.AppUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        urlPatterns = "/users",
        loadOnStartup = 2,
        initParams = {
                @WebInitParam(
                        name = "user-servlet-key",
                        value = "user-servlet-value"
                )
        }
)
public class UserServlet extends HttpServlet {

    //ObjectMapper mapper = new ObjectMapper();

    private final ObjectMapper mapper;

    public UserServlet(ObjectMapper mapper){
        this.mapper = mapper;
    }

    @Override
    public void init() throws ServletException {
        System.out.println("[LOG] - UserServlet Instantiated");
        System.out.println("[LOG] - Init param user-servlet-key: " + this.getServletConfig().getInitParameter("user-servlet-key"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        System.out.println("[LOG] - UserServlet received a request at " + LocalDateTime.now());

        AppUser someUser = new AppUser(123, "Jane", "Doe", "janedoe@gmail.com", "jd65", "janed09");

        System.out.println("[LOG] - was request filtered ? " + req.getAttribute("was-filtered"));

        String respPayload = mapper.writeValueAsString(someUser);

        resp.setStatus(200);
        resp.setContentType("application/json");
        resp.getWriter().write(respPayload);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("[LOG] - UserServlet received a request at " + LocalDateTime.now());

        // tom print from input stream
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(req.getInputStream()));
//        String line;
//        while ((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }

        AppUser newUser = mapper.readValue(req.getInputStream(), AppUser.class);
        System.out.println(newUser);

        resp.setStatus(204);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
