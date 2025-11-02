package flyweight;

public class LeituraSensor {
    private final double valor;
    private final long timestamp;

    private final Dispositivo dispositivo;

    public LeituraSensor(double valor, long timestamp, Dispositivo dispositivo) {
        this.valor = valor;
        this.timestamp = timestamp;
        this.dispositivo = dispositivo;
    }

    public void processar() {
        System.out.println(String.format(
                "   Processando: [Disp: %s, Local: %s] -> Valor: %.2f (ts: %d)",
                dispositivo.deviceId, dispositivo.localizacao, valor, timestamp
        ));
    }
}
