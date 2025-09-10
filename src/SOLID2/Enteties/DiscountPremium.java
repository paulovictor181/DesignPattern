package SOLID2.Enteties;

import SOLID2.Interface.Discount;

public class DiscountPremium implements Discount{

    @Override
    public double calculate(double amount) {
        return amount * 0.2;
    }
}
