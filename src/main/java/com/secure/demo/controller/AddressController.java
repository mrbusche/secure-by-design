package com.secure.demo.controller;

import com.secure.design.USAddress;
import com.secure.design.usaddress.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddressController {

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public ModelAndView address() {
        return new ModelAndView("address");
    }

    @RequestMapping(value = "/saveAddress", method = RequestMethod.POST)
    public ModelAndView saveAddress(@ModelAttribute("streetAddress1") StreetAddress1 streetAddress1,
                                    @ModelAttribute("streetAddress2") StreetAddress2 streetAddress2,
                                    @ModelAttribute("city") City city,
                                    @ModelAttribute("state") State state,
                                    @ModelAttribute("zip5") Zip5 zip5,
                                    @ModelAttribute("zip4") Zip4 zip4) {
        try {
            USAddress usAddress = new USAddress(streetAddress1, streetAddress2, city, state, zip5, zip4);
            return new ModelAndView("address");
        } catch (NullPointerException npe) {
            System.out.println(npe);
            return new ModelAndView("address");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae);
            return new ModelAndView("address");
        }
    }
}
