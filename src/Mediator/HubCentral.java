package Mediator;

public class HubCentral implements SmartHomeMediator {

    private TemperatureSensor sensorQuarto;
    private MotionSensor sensorSala;
    private AirConditioner acQuarto;
    private Light lampadaSala;

    public HubCentral() {
        this.sensorQuarto = new TemperatureSensor("Sensor do Quarto", this);
        this.sensorSala = new MotionSensor("Sensor da Sala", this);
        this.acQuarto = new AirConditioner("AC do Quarto", this);
        this.lampadaSala = new Light("Luz da Sala", this);
    }

    @Override
    public void notify(Device device, String event) {
        System.out.println("[HUB] Recebeu notificação de: " + device.name + ", Evento: " + event);


        if (device == sensorQuarto && event.equals("temperature_change")) {
            int temp = sensorQuarto.getTemperature();
            if (temp > 25) {
                acQuarto.turnOn();
            } else if (temp < 22) {
                acQuarto.turnOff();
            }
        }

        if (device == sensorSala && event.equals("motion_detected")) {
            lampadaSala.turnOn();
        }
    }

    public TemperatureSensor getSensorQuarto() { return sensorQuarto; }
    public MotionSensor getSensorSala() { return sensorSala; }
}
