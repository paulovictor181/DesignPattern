package Facade;

public class SistemaDeAgenda {
    public void registrarConsulta(Consulta consulta) {
        System.out.println("[AGENDA DB] Registrando a consulta no banco de dados...");
        System.out.printf("[AGENDA DB] Consulta para '%s' com Dr(a). '%s' em %s salva com sucesso.\n",
                consulta.getNomePaciente(), consulta.getNomeMedico(), consulta.getDataHoraFormatada());
    }
}