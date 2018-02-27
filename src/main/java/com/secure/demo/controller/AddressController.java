package com.secure.demo.controller;

import com.secure.design.USAddress;
import com.secure.design.usaddress.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
class AddressController {

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public ModelAndView address() {
        return new ModelAndView("address");
    }

    @RequestMapping(value = "/saveAddress", method = RequestMethod.POST)
    public ModelAndView saveAddress(@ModelAttribute("streetAddress1") String address1,
                                    @ModelAttribute("streetAddress2") String address2,
                                    @ModelAttribute("city") String city,
                                    @ModelAttribute("state") String state,
                                    @ModelAttribute("zip5") String zip5,
                                    @ModelAttribute("zip4") String zip4) {
        ModelAndView mav = new ModelAndView();
        try {
            USAddress usAddress = new USAddress(new StreetAddress1(address1), new StreetAddress2(address2), new City(city), new State(state), new Zip5(zip5), new Zip4(zip4));
            return new ModelAndView("address");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae);
            mav.setViewName("address");
            mav.addObject("error", "invalid stuff");
            return mav;
        }
    }
}
