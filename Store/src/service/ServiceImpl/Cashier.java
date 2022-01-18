package service.ServiceImpl;

import model.*;
import service.ICashier;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;

public class Cashier implements ICashier {


    public Cashier() {}

     Discount discount = new Discount();
     private static final DecimalFormat df = new DecimalFormat("0.00");



    @Override
    public void printCart(Cart cart) {

        HashMap<Food, Double> foodMap = cart.getFoodMap();
        HashMap<Beverage, Integer> beverageMap = cart.getBeverageMap();
        HashMap<Clothes, Integer> clothesMap = cart.getClothesMap();
        HashMap<Appliance, Integer> applianceMap = cart.getApplianceMap();

        CartService cartService = new CartService();

        System.out.println("Date: " + LocalDate.now() + " " + LocalTime.now().withNano(0));
        System.out.println(" ");
        System.out.println("---Products---");
        System.out.println(" ");
        System.out.println(" ");
        cartService.printFoodCart(foodMap, LocalDate.now(), discount);
        System.out.println(" ");
        System.out.println(" ");
        cartService.printBeverageCart(beverageMap, LocalDate.now(), discount);
        System.out.println(" ");
        System.out.println(" ");
        cartService.printClothesCart(clothesMap, LocalDate.now(), discount);
        System.out.println(" ");
        System.out.println(" ");
        cartService.printAppliancesCart(applianceMap, LocalDate.now(), discount);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("SUBTOTAL: $" + df.format(discount.getSubtotal()));
        System.out.println("DISCOUNT: -$" + df.format(discount.getDiscount()));
        System.out.println(" ");
        System.out.println("TOTAL: $" + df.format(discount.getTotal()));



    }
}
