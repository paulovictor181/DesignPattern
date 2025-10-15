package Facade;

public class ServicoWhatsapp {
    public void enviarMensagem(Consulta consulta) {
        System.out.println("[WHATSAPP API] Conectando ao serviço de mensagens...");
        String mensagem = String.format("Olá, %s! Sua consulta com Dr(a). %s foi confirmada para %s.",
                consulta.getNomePaciente(), consulta.getNomeMedico(), consulta.getDataHoraFormatada());
        System.out.println("[WHATSAPP API] Enviando mensagem: \"" + mensagem + "\"");
    }
}
