package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Iot {
    public static void main(String[] args) {
        FactoryFlywight factory = new FactoryFlywight();
        List<LeituraSensor> mensagens = new ArrayList<>();
        Random rand = new Random();

        System.out.println("--- Simulando recebimento de 1000 mensagens de 2 dispositivos ---");

        Dispositivo sensorA = factory.getDevice("sensor-temp-001", "T-800", "Servidor-Rack-A");
        Dispositivo sensorB = factory.getDevice("sensor-umid-007", "H-1000", "Sala-Refrigeração");

        for (int i = 0; i < 500; i++) {
            double temp = 20 + rand.nextDouble() * 5;
            mensagens.add(new LeituraSensor(temp, System.currentTimeMillis(), sensorA));

            double umidade = 50 + rand.nextDouble() * 10;
            mensagens.add(new LeituraSensor(umidade, System.currentTimeMillis(), sensorB));
        }

        System.out.println("\n--- Processando as 2 primeiras mensagens ---");
        mensagens.get(0).processar();
        mensagens.get(1).processar();

        System.out.println("\n--- Estatísticas de Memória ---");
        System.out.println("Total de Mensagens (Objetos 'Cliente'): " + mensagens.size());
        System.out.println("Total de Dispositivos (Objetos 'Flyweight'): " + factory.getTotalDispositivosRegistrados());
    }
}
