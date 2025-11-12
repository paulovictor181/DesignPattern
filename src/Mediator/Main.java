package Mediator;

public class Main {
    public static void main(String[] args) {
        HubCentral hub = new HubCentral();

        System.out.println("--- Início da Simulação de Casa Inteligente ---");

        System.out.println("\n[SIMULAÇÃO] Está esquentando...");
        hub.getSensorQuarto().simulateNewTemperature(28);

        System.out.println("---");

        System.out.println("\n[SIMULAÇÃO] Alguém entrou na sala...");
        hub.getSensorSala().simulateMotionDetected();

        System.out.println("---");

        System.out.println("\n[SIMULAÇÃO] A temperatura se normalizou...");
        hub.getSensorQuarto().simulateNewTemperature(21);

        System.out.println("\n--- Fim da Simulação ---");

    }
}
