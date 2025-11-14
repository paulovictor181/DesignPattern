package observer;

import java.util.Random;
import observer.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer dashboard = new DashboardDisplay();
        Observer gui = new GuiInterface();

        station.attach(dashboard);
        station.attach(gui);


        Random random = new Random();
        System.out.println("\n--- INICIANDO SIMULAÇÃO DE TEMPERATURA ---");

        for(int i = 0; i < 4; i++) {
            double newTemp = 10.0 + (random.nextDouble() * 25.0);
            double roundedTemp = Math.round(newTemp * 10.0) / 10.0;

            station.setNewTemperature(roundedTemp);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("[SISTEMA]: Simulação interrompida.");
                break;
            }
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("\n--- SIMULAÇÃO FINALIZADA ---");
    }

}
