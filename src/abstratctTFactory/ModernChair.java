package abstratctTFactory;

public class ModernChair implements Chair{

    boolean occupied = false;

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public String sitOn() {
        String status = "The Chair";

        if(!occupied){
            occupied = true;
            status += "is occupied!";
        } else {
            occupied = false;
            status += "is already occupied!";
        }
        return status;
    }
}
