package com.homework24.homework24;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

@Repository
@SessionScope
public class BasketRepository {
    private final Basket basket = new Basket();

    public Basket getBasket() {
        return basket;
    }
}
