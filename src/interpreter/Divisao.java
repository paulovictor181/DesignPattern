package interpreter;

public class Divisao extends Operacao {
    @Override
    protected double calcular(double esquerda, double direita) {
        if (direita == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return esquerda / direita;
    }
}
