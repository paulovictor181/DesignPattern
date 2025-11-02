package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryFlywight {
    private Map<String, Dispositivo> pool = new HashMap<>();

    public Dispositivo getDevice(String deviceId, String modelo, String localizacao) {
        if (!pool.containsKey(deviceId)) {
            System.out.println("-> [FACTORY] Novo dispositivo registrado: " + deviceId);
            pool.put(deviceId, new Dispositivo(deviceId, modelo, localizacao));
        }

        return pool.get(deviceId);
    }

    public int getTotalDispositivosRegistrados() {
        return pool.size();
    }
}
