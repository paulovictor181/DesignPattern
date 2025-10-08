package adapter;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RelatorioCientifico motorCientifico = new RelatorioCientifico();

        System.out.println("\n--- DADOS BRUTOS (Relatório Bruto) ---");
        motorCientifico.gerarDadosCompletos().forEach(System.out::println);

        RelatorioSimples relatorioParaPainel = new AdaptadorRelatorioSimples(motorCientifico);

        List<BigDecimal> dadosVisuais = relatorioParaPainel.gerarRelatorioVisual();

        System.out.println("\n--- DADOS ADAPTADOS (Relatório Simples para Painel) ---");
        dadosVisuais.forEach(System.out::println);

    }
}