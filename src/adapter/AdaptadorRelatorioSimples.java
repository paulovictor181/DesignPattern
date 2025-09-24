package adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

public class AdaptadorRelatorioSimples implements RelatorioSimples {

    private RelatorioCientifico relatorioCientifico;

    public AdaptadorRelatorioSimples(RelatorioCientifico relatorioCientifico) {
        this.relatorioCientifico = relatorioCientifico;
    }

    @Override
    public List<BigDecimal> gerarRelatorioVisual() {

        List<BigDecimal> dadosCientificos = relatorioCientifico.gerarDadosCompletos();

        return dadosCientificos.stream()
                .map(numero -> numero.setScale(2, RoundingMode.HALF_UP))
                .collect(Collectors.toList());
    }
}