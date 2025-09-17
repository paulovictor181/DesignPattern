package prototype;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Vantagens
        // -- Acomplamento, ai modificar a classe principal uma vez, precisa mexer em todos os locais.
        // -- Precisar escrever todos os Set novamente.
        // -- Mantem a logica interna na classe

        // Desvantagens
        // -- Dependencia Ciclica

        Email modeloEmail = new Email(
                "Newsletter da Semana",
                "noticias@exemplo.com",
                "Confira as últimas novidades!"
        );

        List<String> destinatarios = Arrays.asList(
                "joao@exemplo.com",
                "maria@exemplo.com",
                "pedro@exemplo.com"
        );

        System.out.println("--- Enviando e-mail para vários destinatários ---");

        for (String destinatario : destinatarios) {

            Email emailClonado = (Email) modeloEmail.clone();

            emailClonado.setDestinatario(destinatario);

            System.out.println("Enviando: " + emailClonado);
        }

        System.out.println("\n--- Modelo Original ---");
        System.out.println(modeloEmail);
    }
}