package com.homework24.homework24;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketService {
    @Autowired
    private BasketRepository basketRepository;
    public Product add(int id) {
        Product product = new Product(id);
        basketRepository.getBasket().getProducts().add(product);
        return product;
    }

    public Basket get() {
        return basketRepository.getBasket();
    }
}
