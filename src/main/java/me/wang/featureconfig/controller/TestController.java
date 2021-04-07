package me.wang.featureconfig.controller;


import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public String Hello(HttpServletRequest request, @RequestParam(value = "name", required = false, defaultValue = "wangpengtai") String name) {
        request.setAttribute("name", name);
        return "hello";
    }
}
