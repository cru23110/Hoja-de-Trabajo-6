import java.util.Map;

public class ColeccionCartas {
    private Map<String, Integer> cartas;

    public ColeccionCartas(Map<String, Integer> mapa) {
        this.cartas = mapa;
    }

    public void agregarCarta(String nombreCarta) {
        cartas.put(nombreCarta, cartas.getOrDefault(nombreCarta, 0) + 1);
    }

    public void mostrarColeccion() {
        for (Map.Entry<String, Integer> entry : cartas.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }

    public void mostrarColeccionOrdenada() {
        Map<String, Integer> cartasOrdenadas = new TreeMap<>(cartas);
        for (Map.Entry<String, Integer> entry : cartasOrdenadas.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }

    public void mostrarTipoCarta(String nombreCarta) {
        Integer cantidad = cartas.get(nombreCarta);
        if (cantidad != null) {
            System.out.println("Tipo de " + nombreCarta + ": " + cantidad);
        } else {
            System.out.println("La carta no se encuentra en la colección.");
        }
    }

    public void mostrarTodasLasCartas() {
        for (Map.Entry<String, Integer> entry : cartas.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }

    public void mostrarTodasLasCartasOrdenadas() {
        Map<String, Integer> cartasOrdenadas = new TreeMap<>(cartas);
        for (Map.Entry<String, Integer> entry : cartasOrdenadas.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Cantidad: " + entry.getValue());
        }
    }
}
