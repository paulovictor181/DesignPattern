package SOLID2;

import SOLID2.Interface.Discount;

public class DiscountCalculator {
    public double calculateDiscount(Discount discount, double amount) {
        return discount.calculate(amount);
    }
}
