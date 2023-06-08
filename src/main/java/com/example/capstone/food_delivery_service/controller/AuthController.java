package com.example.capstone.food_delivery_service.controller;


import com.example.capstone.food_delivery_service.model.Customer;

import com.example.capstone.food_delivery_service.model.OrderCart;
import com.example.capstone.food_delivery_service.model.OrderDetails;
import com.example.capstone.food_delivery_service.service.AccountService;
import com.example.capstone.food_delivery_service.service.DatabaseService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

@org.springframework.stereotype.Controller
@SessionScope
@RequestMapping("/")
public class AuthController {
    Logger logger = LoggerFactory.getLogger(AuthController.class);
    private final AccountService accountService;
    private final DatabaseService databaseService;
    private final Customer customer;
    private final OrderCart orderCart;
    private final OrderDetails orderDetails;


    public AuthController(AccountService accountService, DatabaseService databaseService, Customer customer, OrderCart orderCart, OrderDetails orderDetails) {
        this.accountService = accountService;
        this.databaseService = databaseService;
        this.customer = customer;
        this.orderCart = orderCart;
        this.orderDetails = orderDetails;
    }

    @PostMapping(value = "/signup")
    public String signUpNewUser(@Valid @ModelAttribute(value = "customer") Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors() || (databaseService.checkNewCustomerUsername(customer.getUsername()))) {
            logger.error("*************Sign up form ERROR********************");
            if (databaseService.checkNewCustomerUsername(customer.getUsername())) {
                model.addAttribute("errorUsername", "Username exist");
            }
            model.addAttribute("customer", customer);
            addDefaultAttributes(model);
            return "signup";
        }
        addDefaultAttributes(model);
        accountService.registerNewCustomer(customer);
        logger.info("************* New user signed up ********************");
        return "redirect:/";
    }

    @GetMapping(value = "/login")
    public String getLogin(Model model) {
        addDefaultAttributes(model);
        return "login";
    }

    @GetMapping(value = "/signup")
    public String getSignup(Model model) {
        model.addAttribute("customer", customer);
        addDefaultAttributes(model);
        return "signup";
    }

    public void addDefaultAttributes(Model model) {
        model.addAttribute("orderCart", orderCart);
        model.addAttribute("orderDetails", orderDetails);
        model.addAttribute("dishes", orderCart.getDishesList());
    }

}
