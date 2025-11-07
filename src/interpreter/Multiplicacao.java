package interpreter;

public class Multiplicacao extends Operacao {
    @Override
    protected double calcular(double esquerda, double direita) {
        return esquerda * direita;
    }
}
