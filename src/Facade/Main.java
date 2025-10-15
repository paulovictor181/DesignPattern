package Facade;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Consulta novaConsulta = new Consulta(
                "Carlos Silva",
                "Ana Rodrigues",
                LocalDateTime.of(2025, 10, 28, 14, 30)
        );

        SistemaDeAgenda sistemaDeAgenda = new SistemaDeAgenda();
        ServicoWhatsapp servicoWhatsapp = new ServicoWhatsapp();
        ServicoEmail servicoEmail = new ServicoEmail();


        sistemaDeAgenda.registrarConsulta(novaConsulta);

        servicoWhatsapp.enviarMensagem(novaConsulta);

        servicoEmail.enviarEmailConfirmacao(novaConsulta);

    }
}
