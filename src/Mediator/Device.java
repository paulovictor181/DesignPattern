package Mediator;

public abstract class Device {
    protected SmartHomeMediator mediator;
    protected String name;

    public Device(String name, SmartHomeMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
