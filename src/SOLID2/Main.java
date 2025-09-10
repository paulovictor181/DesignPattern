package SOLID2;

import SOLID2.Enteties.DiscountPremium;
import SOLID2.Enteties.DiscountRegular;
import SOLID2.Interface.Discount;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculadora = new DiscountCalculator();
        Discount discountRegular = new DiscountRegular();
        Discount discountPremium = new DiscountPremium();

        double regularDiscount = calculadora.calculateDiscount(discountRegular,100);
        double premiumDiscount = calculadora.calculateDiscount(discountPremium,100);

        System.out.println("Regular Discount : " + regularDiscount);
        System.out.println("Premium Discount : " + premiumDiscount);

    }
}
