package adapter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Arrays;

public class RelatorioCientifico {
    public List<BigDecimal> gerarDadosCompletos() {
        System.out.println("Gerando relatório com precisão científica...");
        return Arrays.asList(
                new BigDecimal("3.1415926535"),
                new BigDecimal("2.7182818284"),
                new BigDecimal("1.6180339887"),
                new BigDecimal("9.8066500000")
        );
    }
}