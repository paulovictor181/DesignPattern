package abstratctTFactory;

public class ModernSofa implements Sofa {

    @Override
    public String getStyle() {
        return "Rectangular";
    }

    @Override
    public int numberOfSeats() {
        return 0;
    }
}
