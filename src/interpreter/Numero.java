package interpreter;

import java.util.Stack;

public class Numero implements ExpressaoRPN {
    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public void interpretar(Stack<Double> contexto) {
        contexto.push(this.valor);
    }
}
