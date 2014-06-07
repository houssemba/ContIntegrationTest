package com.belhadjahmed.integtest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by houssem on 07/06/14.
 */
@Controller
@RequestMapping("/")
public class TestController {
    @RequestMapping(method = RequestMethod.GET)
    public String indexPage(Model model){
        model.addAttribute("test", "OMFG ! it works !");
        return "test";
    }
}
