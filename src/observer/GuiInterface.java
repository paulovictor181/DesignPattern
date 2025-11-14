package observer;

public class GuiInterface implements Observer {
    @Override
    public void update(double temperature) {
        String alert = "";
        if (temperature > 30.0) {
            alert = " (ALERTA: QUENTE! Cor do display: VERMELHO)";
        } else if (temperature < 15.0) {
            alert = " (ALERTA: FRIO! Cor do display: AZUL)";
        }

        System.out.println("  [INTERFACE_GUI]: Atualizando display do usuário. Valor: " + temperature + "°C" + alert);
    }
}
