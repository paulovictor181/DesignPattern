package interpreter;

import java.util.Stack;

abstract class Operacao implements ExpressaoRPN {

    @Override
    public void interpretar(Stack<Double> contexto) {
        double direita = contexto.pop();
        double esquerda = contexto.pop();
        double resultado = calcular(esquerda, direita);
        contexto.push(resultado);
    }

    protected abstract double calcular(double esquerda, double direita);
}