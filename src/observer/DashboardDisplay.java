package observer;

public class DashboardDisplay implements Observer {
    @Override
    public void update(double temperature) {
        System.out.println("  [DASHBOARD]: A temperatura atualizada é: " + temperature + "°C");
    }
}
