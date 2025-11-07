package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static List<ExpressaoRPN> parse(String expressao) {
        List<ExpressaoRPN> expressoes = new ArrayList<>();
        String[] tokens = expressao.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    expressoes.add(new Soma());
                    break;
                case "-":
                    expressoes.add(new Subtracao());
                    break;
                case "*":
                    expressoes.add(new Multiplicacao());
                    break;
                case "/":
                    expressoes.add(new Divisao());
                    break;
                default:
                    expressoes.add(new Numero(Double.parseDouble(token)));
                    break;
            }
        }
        return expressoes;
    }

    public static double avaliar(String expressao) {
        Stack<Double> contexto = new Stack<>();

        List<ExpressaoRPN> expressoes = parse(expressao);

        for (ExpressaoRPN expr : expressoes) {
            expr.interpretar(contexto);
        }

        return contexto.pop();
    }

    public static void main(String[] args) {

        // Expressão: (10 + 5) * 2 = 30
        String exp1 = "10 5 + 2 *";
        System.out.println("Resultado de '" + exp1 + "': " + avaliar(exp1));

        // Expressão: (7 - (2 * 3)) = 1
        // RPN: 7 2 3 * -
        String exp2 = "7 2 3 * -";
        System.out.println("Resultado de '" + exp2 + "': " + avaliar(exp2));
    }
}
