package com.bootcamp.helper;

public class DiscountCalculator {
    public double calculateDiscount(
            double price,
            double discountPercentage) {

        double discount = price * discountPercentage / 100;
        return price - discount;
    }
}
