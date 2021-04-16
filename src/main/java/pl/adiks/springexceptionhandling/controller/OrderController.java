package pl.adiks.springexceptionhandling.controller;

import org.springframework.web.bind.annotation.*;
import pl.adiks.springexceptionhandling.exception.OrderServiceException;
import pl.adiks.springexceptionhandling.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/price/{productName}")
    public double getOrderPrice(@PathVariable String productName) throws OrderServiceException {
        return orderService.getPrice(productName);
    }
}
