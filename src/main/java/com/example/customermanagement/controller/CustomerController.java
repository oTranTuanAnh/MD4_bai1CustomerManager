package com.example.customermanagement.controller;

import com.example.customermanagement.model.Customer;
import com.example.customermanagement.service.CustomerService;
import com.example.customermanagement.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
    public class CustomerController {
        private final CustomerService customerService = new CustomerServiceImpl();
//        @GetMapping("/customer")
//        public String showList(HttpServletRequest request) {
//            List<Customer> customerList = customerService.findAll();
//            request.setAttribute("customer", customerList);
//            return "customer/list.jsp";
//        }
//    @GetMapping("/customers")
//    public String showList(Model model) {
//        List<Customer> customers = customerService.findAll();
//        model.addAttribute("customer", customers);
//        return "customer/list.jsp";
//    }

//    @Autowired
//    private CustomerService customerService;
//    @GetMapping("/customer")
//    public String list(Model model){
//        List<Customer> customerList = customerService.findAll();
//        model.addAttribute("customer", customerList);
//        return "customer/list.jsp";
//
//    }
    @GetMapping("/customer")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView("customer/list.jsp");
        List<Customer> customerList = customerService.findAll();
        modelAndView.addObject("customer",customerList);
        return modelAndView;
    }
}

