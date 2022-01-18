package model;

import java.time.LocalDate;

public class Perishable extends Product {

    private LocalDate expDate;

    public Perishable(String name, String brand, double price, LocalDate expDate) {
        super(name, brand, price);
        this.expDate = expDate;
    }

    public Perishable() {}

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }



}
