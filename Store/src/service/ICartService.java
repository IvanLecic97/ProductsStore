package service;

import model.*;

import java.time.LocalDate;
import java.util.HashMap;

public interface ICartService {

    void printFoodCart(HashMap<Food, Double> foodMap, LocalDate transactionDate, Discount discount);
    void printBeverageCart(HashMap<Beverage, Integer> beverageMap, LocalDate transactionDate, Discount discount);
    void printClothesCart(HashMap<Clothes, Integer> clothesMap, LocalDate transactionDate, Discount discount);
    void printAppliancesCart(HashMap<Appliance, Integer> applianceMap, LocalDate transactionDate, Discount discount);
}
