package com.testExec.controller;

import com.testExec.Entity.Order;
import com.testExec.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
        //Запускает view
    }

    @GetMapping("/orders")
    public String getAllOrders(Model model){
        model.addAttribute("orders",orderService.findAll());
        return "ordersList";
    }

    @GetMapping("/order/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("order",orderService.getById(id));
        return "showOrder";
    }

    @GetMapping("/addOrder")
    public String createOrderPage(){
        return "createOrder";
    }

    @PostMapping("/addOrder")
    public String addOrder(@ModelAttribute("order") Order order){
        try {
            orderService.save(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/orders";
    }

    @PostMapping("/updateOrder")
    public String updateOrder(@ModelAttribute("order") Order order){
        orderService.update(order);
        return "redirect:/order/"+ order.getId();
    }

    @GetMapping("delete/{id}")
    public String deleteOrder(@PathVariable("id") int id){
        orderService.delete(id);
        return "redirect:/orders";
    }

    @GetMapping("update/{id}")
    public String updateOrder(@PathVariable("id") int id, Model model){
        model.addAttribute("order",orderService.getById(id));
        return "editOrder";
    }
}
