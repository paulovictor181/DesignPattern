package interpreter;

public class Subtracao extends Operacao {
    @Override
    protected double calcular(double esquerda, double direita) {
        return esquerda - direita;
    }
}
