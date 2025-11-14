package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();

    private double temperature;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("[SISTEMA]: Observer (" + observer.getClass().getSimpleName() + ") registrado.");
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("[SISTEMA]: Observer (" + observer.getClass().getSimpleName() + ") removido.");
    }

    @Override
    public void notifyObservers() {
        System.out.println("[ESTAÇÃO]: Notificando " + observers.size() + " observers...");

        for (Observer observer : observers) {
            observer.update(this.temperature);
        }
    }


    public void setNewTemperature(double newTemperature) {
        this.temperature = newTemperature;

        System.out.println("\n-------------------------------------------");
        System.out.println("[ESTAÇÃO]: Nova temperatura registrada: " + this.temperature + "°C");

        notifyObservers();
    }
}
