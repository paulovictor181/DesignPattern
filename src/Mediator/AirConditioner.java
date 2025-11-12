package Mediator;

public class AirConditioner extends Device{
    public AirConditioner(String name, SmartHomeMediator mediator) {
        super(name, mediator);
    }

    public void turnOn() {
        System.out.println(">> " + this.name + ": Ligando o Ar Condicionado.");
    }

    public void turnOff() {
        System.out.println(">> " + this.name + ": Desligando o Ar Condicionado.");
    }
}
