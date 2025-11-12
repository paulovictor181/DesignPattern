package Mediator;

public class MotionSensor extends Device{
    public MotionSensor(String name, SmartHomeMediator mediator) {
        super(name, mediator);
    }

    public void simulateMotionDetected() {
        System.out.println(this.name + " detectou movimento!");

        this.mediator.notify(this, "motion_detected");
    }
}
