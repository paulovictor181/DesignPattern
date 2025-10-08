package Composite;

abstract class BaseExpense implements Expense {
    public double cost;
    public String name;

    BaseExpense(String name,double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double calculateCost() {
        System.out.println("  - Despesa: " + name + " - Custo: " + cost);
        return cost;
    }
}

