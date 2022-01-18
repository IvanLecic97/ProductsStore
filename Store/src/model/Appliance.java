package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Appliance extends Product {
    private String model;
    private LocalDate prodDate;
    private double weight;

    public Appliance(String name, String brand, double price, String model, LocalDate prodDate, double weight) {
        super(name, brand, price);
        this.model = model;
        this.prodDate = prodDate;
        this.weight = weight;
    }

    public Appliance(String name, String brand, double price, String model, String prodDate, double weight) {
        super(name, brand, price);
        this.model = model;
        this.prodDate = LocalDate.parse(prodDate);
        this.weight = weight;
    }

    public Appliance() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getProdDate() {
        return prodDate;
    }

    public void setProdDate(LocalDate prodDate) {
        this.prodDate = prodDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
