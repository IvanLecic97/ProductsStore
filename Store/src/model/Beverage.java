package model;

import java.time.LocalDate;

public class Beverage extends Product {

    private LocalDate expDate;

    public Beverage(String name, String brand, double price, LocalDate expDate) {
        super(name, brand, price);
        this.expDate = expDate;
    }

    public Beverage(String name, String brand, double price, String expDate) {
        super(name, brand, price);
        this.expDate = LocalDate.parse(expDate);
    }

    public Beverage() {

    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
