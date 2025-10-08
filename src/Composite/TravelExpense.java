package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelExpense implements Expense{
    private List<Expense> expenses = new ArrayList<>();

    public void loadExpenses(Expense... expenses) {
        this.expenses.addAll(Arrays.asList(expenses));
    }

    public void addExpense(Expense expense) {
        this.expenses.add(expense);
    }

    @Override
    public double calculateCost() {
        double totalCost = 0;
        for (Expense expense : expenses) {
            totalCost += expense.calculateCost();
        }
        return totalCost;
    }
}
