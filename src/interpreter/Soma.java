package interpreter;

public class Soma extends Operacao {
    @Override
    protected double calcular(double esquerda, double direita) {
        return esquerda + direita;
    }
}
