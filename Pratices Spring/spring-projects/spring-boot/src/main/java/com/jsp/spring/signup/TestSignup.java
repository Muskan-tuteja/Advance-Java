package com.jsp.spring.signup;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestSignup {
    @RequestMapping("/Signup")
    public String Signup(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println(req);
        System.out.println(resp);
        return "Signup.html";

    }
}
