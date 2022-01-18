package service.ServiceImpl;

import model.*;
import service.ICartService;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import java.math.*;


public class CartService implements ICartService {

    public CartService() {}

    DiscountService discountService = new DiscountService();

    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public void printFoodCart(HashMap<Food, Double> foodMap, LocalDate transactionDate, Discount discount) {
        for(Map.Entry m : foodMap.entrySet() )
        {
            Food f = (Food) m.getKey();
            int discountAmount = discountService.checkDiscountFood(f, transactionDate);
            double initialPrice = ((double)m.getValue() * f.getPrice());
            double discountedPrice = ((double)m.getValue() * f.getPrice() * discountAmount / 100)  ;
            double finalPrice =  initialPrice - discountedPrice ;

            discount.addDiscount(discountedPrice);
            discount.addSubtotal(initialPrice);
            discount.addTotal(finalPrice);

            System.out.println(f.getName() + "-" + f.getBrand());
            System.out.println("");
            System.out.println(m.getValue() + " x " + "$"+ df.format(f.getPrice()) + " = " + "$"+df.format(initialPrice) );
            System.out.println("");
            if(discountAmount != 0)
            {
                System.out.println("#discount " + discountAmount + "% " + "-" + df.format(discountedPrice) );
            }
        }
    }

    @Override
    public void printBeverageCart(HashMap<Beverage, Integer> beverageMap, LocalDate transactionDate, Discount discount)
    {
        for(Map.Entry m : beverageMap.entrySet())
        {
            Beverage b = (Beverage) m.getKey();
            int discountAmount = discountService.checkDiscountBeverage(b, transactionDate);
            double initialPrice = ((int)m.getValue() * b.getPrice());
            double discountedPrice = ((int)m.getValue() * b.getPrice() * discountAmount / 100)  ;
            double finalPrice =  initialPrice - discountedPrice ;

            discount.addDiscount(discountedPrice);
            discount.addSubtotal(initialPrice);
            discount.addTotal(finalPrice);

            System.out.println(b.getName() + " " + b.getBrand());
            System.out.println(m.getValue() + " x " + "$" + df.format(b.getPrice()) + " = $" + df.format(initialPrice));
            if(discountAmount != 0)
            {
                System.out.println("#discount " + discountAmount + "% " + "-" + df.format(discountedPrice));
            }
        }

    }

    @Override
    public void printClothesCart(HashMap<Clothes, Integer> clothesMap, LocalDate transactionDate, Discount discount)
    {
        for(Map.Entry m : clothesMap.entrySet())
        {
            Clothes c = (Clothes) m.getKey();
            int discountAmount = discountService.checkDiscountClothes(c, transactionDate);
            double initialPrice = ((int)m.getValue() * c.getPrice());
            double discountedPrice = ((int)m.getValue() * c.getPrice() * discountAmount / 100)  ;
            double finalPrice =  initialPrice - discountedPrice ;

            discount.addDiscount(discountedPrice);
            discount.addSubtotal(initialPrice);
            discount.addTotal(finalPrice);

            System.out.println(c.getName() + " " + c.getBrand() + " " + c.getSize() + " " + c.getColor());
            System.out.println(m.getValue() + " x " + "$" + df.format(c.getPrice()) + " = $" + df.format(initialPrice) );
            if(discountAmount != 0)
            {
                System.out.println("#discount " + discountAmount + "% " + "-" + df.format(discountedPrice ));
            }
        }

    }

    @Override
    public void printAppliancesCart(HashMap<Appliance, Integer> applianceMap, LocalDate transactionDate, Discount discount)
    {
        for(Map.Entry m : applianceMap.entrySet())
        {
            Appliance a = (Appliance) m.getKey();
            int discountAmount = discountService.checkDiscountAppliances(a, transactionDate);
            double initialPrice = ((int)m.getValue() * a.getPrice());
            double discountedPrice = ((int)m.getValue() * a.getPrice() * discountAmount / 100)  ;
            double finalPrice =  initialPrice - discountedPrice ;

            discount.addDiscount(discountedPrice);
            discount.addSubtotal(initialPrice);
            discount.addTotal(finalPrice);

            if(discountAmount != 0)
            {
                System.out.println("#discount " + discountAmount + "% " + "-" + discountedPrice );
            }

            System.out.println(a.getName() + " " + a.getBrand() + " " + a.getModel());
            System.out.println(m.getValue() + " x " + "$" + df.format(a.getPrice()) + " = $" + df.format(initialPrice) );

        }
    }

}
