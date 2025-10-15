package Facade;

public class ServicoEmail {
    public void enviarEmailConfirmacao(Consulta consulta) {
        System.out.println("[EMAIL API] Preparando para enviar e-mail de confirmação...");
        String assunto = "Confirmação de Consulta";
        String corpo = String.format("Prezado(a) %s,\n\nSua consulta com Dr(a). %s está confirmada para o dia %s.\n\nAtenciosamente,\nClínica Saúde Plena",
                consulta.getNomePaciente(), consulta.getNomeMedico(), consulta.getDataHoraFormatada());

        System.out.printf("[EMAIL API] E-mail enviado com sucesso! Assunto: '%s'\n", assunto);
        System.out.printf("[EMAIL API] E-mail enviado com sucesso! Corpo: '%s'\n", corpo);

    }
}
