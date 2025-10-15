package Facade;

public class AgendamentoServiceFacade {
    private SistemaDeAgenda sistemaDeAgenda;
    private ServicoWhatsapp servicoWhatsapp;
    private ServicoEmail servicoEmail;

    public AgendamentoServiceFacade() {
        this.sistemaDeAgenda = new SistemaDeAgenda();
        this.servicoWhatsapp = new ServicoWhatsapp();
        this.servicoEmail = new ServicoEmail();
    }

    public void agendarConsulta(Consulta consulta) {
        System.out.println(">>> Iniciando processo de agendamento via Facade <<<");

        sistemaDeAgenda.registrarConsulta(consulta);

        servicoWhatsapp.enviarMensagem(consulta);

        servicoEmail.enviarEmailConfirmacao(consulta);

        System.out.println(">>> Processo de agendamento finalizado com sucesso! <<<");
    }
}
