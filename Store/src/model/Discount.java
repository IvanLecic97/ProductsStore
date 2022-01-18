package model;

public class Discount {
    private double subtotal ;
    private  double total ;
    private double discount ;

    public Discount(double subtotal, double total, double discount) {
        this.subtotal = subtotal;
        this.total = total;
        this.discount = discount;
    }
    public Discount()
    {
        this.subtotal = 0;
        this.total = 0;
        this.discount = 0;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void addSubtotal(double subtotal)
    {
        this.subtotal += subtotal;
    }

    public void addTotal(double total)
    {
        this.total += total;
    }

    public void addDiscount(double discount)
    {
        this.discount += discount;
    }
}
