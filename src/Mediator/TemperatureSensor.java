package Mediator;

public class TemperatureSensor extends Device {
    private int currentTemperature;

    public TemperatureSensor(String name, SmartHomeMediator mediator) {
        super(name, mediator);
    }

    public void simulateNewTemperature(int temp) {
        this.currentTemperature = temp;
        System.out.println(this.name + " reporta nova temperatura: " + temp + "°C");

        this.mediator.notify(this, "temperature_change");
    }

    public int getTemperature() {
        return this.currentTemperature;
    }
}
