package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Cart {

    private HashMap<Food, Double> foodMap = new HashMap<Food, Double>();
    private HashMap<Beverage, Integer> beverageMap = new HashMap<Beverage, Integer>();
    private HashMap<Clothes, Integer> clothesMap = new HashMap<Clothes, Integer>();
    private HashMap<Appliance, Integer> applianceMap = new HashMap<Appliance, Integer>();

    public Cart(HashMap<Food, Double> foodMap, HashMap<Beverage, Integer> beverageMap, HashMap<Clothes, Integer> clothesMap, HashMap<Appliance, Integer> applianceMap) {
        this.foodMap = foodMap;
        this.beverageMap = beverageMap;
        this.clothesMap = clothesMap;
        this.applianceMap = applianceMap;
    }

    public Cart() {}

    public HashMap<Food, Double> getFoodMap() {
        return foodMap;
    }

    public void setFoodMap(HashMap<Food, Double> foodMap) {
        this.foodMap = foodMap;
    }

    public HashMap<Beverage, Integer> getBeverageMap() {
        return beverageMap;
    }

    public void setBeverageMap(HashMap<Beverage, Integer> beverageMap) {
        this.beverageMap = beverageMap;
    }

    public HashMap<Clothes, Integer> getClothesMap() {
        return clothesMap;
    }

    public void setClothesMap(HashMap<Clothes, Integer> clothesMap) {
        this.clothesMap = clothesMap;
    }

    public HashMap<Appliance, Integer> getApplianceMap() {
        return applianceMap;
    }

    public void setApplianceMap(HashMap<Appliance, Integer> applianceMap) {
        this.applianceMap = applianceMap;
    }

    public void addToFood(Food food, Double quantity)
    {
        foodMap.put(food, quantity);
    }

    public void addToBeverage(Beverage beverage, int quantity)
    {
        beverageMap.put(beverage, quantity);
    }

    public void addToClothes(Clothes clothes, Integer quantity)
    {
        Size size = new Size();
        List<String> sizes = size.listSize();
        for(String s : sizes )
        {
            if(clothes.getSize().equals(s))
            {
                clothesMap.put(clothes, quantity);
            }
            else
                System.out.println("You have  chosen invalid size, available are XS, S, M, L and XL");
        }

    }

    public void addToAppliances(Appliance appliance, Integer quantity)
    {
        applianceMap.put(appliance, quantity);
    }




}
