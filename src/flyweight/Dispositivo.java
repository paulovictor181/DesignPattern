package flyweight;

public class Dispositivo {
    final String deviceId;
    final String modelo;
    final String localizacao;

    public Dispositivo(String deviceId, String modelo, String localizacao) {
        this.deviceId = deviceId;
        this.modelo = modelo;
        this.localizacao = localizacao;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getModelo() {
        return modelo;
    }
}
