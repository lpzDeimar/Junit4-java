package com.platzi.javaTests.doscounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0.0;

    public double getTotal() {
        double result = 0;
        // Iter
        for (double price:prices) {
            result += price;
        }
        if(discount == 0.0){
            return result;
        }else {
            return (result * discount) / 100;
        }
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
