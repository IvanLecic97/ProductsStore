package service.ServiceImpl;

import model.*;
import service.IDiscountService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

public class DiscountService implements IDiscountService {



    public DiscountService() {}

    @Override
    public int checkDiscountFood(Food food, LocalDate transactionDate) {
        int retVal = 0;

            if(transactionDate.compareTo(food.getExpDate()) <= 5 && transactionDate.compareTo(food.getExpDate()) > 0 )
            {
                retVal = 10;
            }
            else
                if (transactionDate.compareTo(food.getExpDate()) == 0)
                {
                    retVal = 50;
                }

    return retVal;

    }

    @Override
    public int checkDiscountBeverage(Beverage beverage, LocalDate transactionDate) {
        int retVal = 0;

        if(transactionDate.compareTo(beverage.getExpDate()) <= 5 && transactionDate.compareTo(beverage.getExpDate()) > 0 )
        {
            retVal = 10;
        }
        else
        if (transactionDate.compareTo(beverage.getExpDate()) == 0)
        {
            retVal = 50;
        }

        return retVal;

    }

    @Override
    public int checkDiscountClothes(Clothes clothes, LocalDate transactionDate) {
        int retVal = 0;
        String day = transactionDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        Days d = new Days();
        for(String s : d.daysList())
        {
            if(s.equals(day))
            {
                retVal = 10;
            }
        }


        return retVal;

    }

    @Override
    public int checkDiscountAppliances(Appliance appliance, LocalDate transactionDate) {
        int retVal = 0;
        String day = transactionDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        Days d = new Days();
        for(String s : d.weekendList())
        {
            if(s.equals(day) && appliance.getPrice() > 999)
            {
                retVal = 5;
            }
        }
        return retVal;
    }
}
