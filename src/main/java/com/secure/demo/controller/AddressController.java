package com.secure.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddressController {

    @RequestMapping("/address")
    public ModelAndView address() {
        return new ModelAndView("address");
    }

    @RequestMapping("/saveAddress")
    public ModelAndView saveAddress() {
        String message = "Hello World";
        return new ModelAndView("address", "message", message);
    }
}
