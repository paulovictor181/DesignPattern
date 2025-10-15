package Facade;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private String nomePaciente;
    private String nomeMedico;
    private LocalDateTime dataHora;

    public Consulta(String nomePaciente, String nomeMedico, LocalDateTime dataHora) {
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
        this.dataHora = dataHora;
    }

    public String getNomePaciente() { return nomePaciente; }
    public String getNomeMedico() { return nomeMedico; }
    public LocalDateTime getDataHora() { return dataHora; }

    public String getDataHoraFormatada() {
        return dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm"));
    }
}