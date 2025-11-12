package Mediator;

public class Light extends Device {
    public Light(String name, SmartHomeMediator mediator) {
        super(name, mediator);
    }

    public void turnOn() {
        System.out.println(">> " + this.name + ": Acendendo a luz.");
    }

    public void turnOff() {
        System.out.println(">> " + this.name + ": Apagando a luz.");
    }
}
