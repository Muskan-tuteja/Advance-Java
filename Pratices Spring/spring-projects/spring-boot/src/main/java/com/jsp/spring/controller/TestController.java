package com.jsp.spring.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println(req.getParameter("name"));
        System.out.println(resp);
        return "index.html";

    }


}
