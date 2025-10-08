package Composite;

import java.util.ArrayList;
import java.util.List;

public class Itinerary implements Expense{
    private String nameItinerary;
    private List<Expense> expenses = new ArrayList<Expense>();

    public  Itinerary(String nameItinerary) {
        this.nameItinerary = nameItinerary;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void removeExpense(Expense expense) {
        expenses.remove(expense);
    }

    @Override
    public double calculateCost() {
        double totalCost = 0;
        System.out.println("Calculando custos para a parada em: " + nameItinerary);
        for (Expense expense : expenses) {
            totalCost += expense.calculateCost();
        }
        System.out.println("Custo total em " + nameItinerary + ": " + totalCost);
        return totalCost;
    }
}
