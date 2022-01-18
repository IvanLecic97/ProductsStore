package service;

import model.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface IDiscountService {
    public int checkDiscountFood(Food food, LocalDate transactionDate);
    public int checkDiscountBeverage(Beverage beverage, LocalDate transactionDate);
    public int checkDiscountClothes(Clothes clothesList, LocalDate transactionDate);
    public int checkDiscountAppliances(Appliance appliance, LocalDate transactionDate);
}
