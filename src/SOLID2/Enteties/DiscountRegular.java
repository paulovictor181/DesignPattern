package SOLID2.Enteties;

import SOLID2.Interface.Discount;

public class DiscountRegular implements Discount {

    @Override
    public double calculate(double amount) {
        return amount * 0.1;
    }
}
