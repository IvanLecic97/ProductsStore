package com.store;

import model.*;
import service.ServiceImpl.CartService;
import service.ServiceImpl.Cashier;
import service.ServiceImpl.DiscountService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {
	// write your code here

        Product p = new Product("Nesto", "brend", 12);
        Food Apple = new Food("apples", "BrandA", 1.50, "2022-01-20");
        Beverage Milk = new Beverage("milk", "BrandM", 0.99, "2022-01-31");
        Clothes Tshirt = new Clothes("T-shirt", "BrandT", 15.99, "M", "violet");
        Appliance Laptop = new Appliance("laptop", "BrandL", 2345, "ModeIL", "2021-03-03", 1.125);
       // Clothes Jeans = new Clothes("Jeans", "BrandJ", 12.99, "XXL", "blue");

        CartService cartService = new CartService();

        Cart cart = new Cart();
        cart.addToFood(Apple, 2.45);
        cart.addToBeverage(Milk, 3);
        cart.addToClothes(Tshirt, 2);
        cart.addToAppliances(Laptop, 1);
      //  cart.addToClothes(Jeans, 1);


        Cashier cashier = new Cashier();
        cashier.printCart(cart);


        LocalDate t = LocalDate.now();
        LocalTime time = LocalTime.now().withNano(0);
        LocalDate date = LocalDate.parse("2022-01-18");






    }
}
