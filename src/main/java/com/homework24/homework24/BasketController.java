package com.homework24.homework24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    private final BasketService basketService;
    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping( "/add")
    public Product add(@RequestParam int id) {
        return basketService.add(id);
    }

    @GetMapping( "/get")
    public Basket get() {
        return basketService.get();
    }
}
