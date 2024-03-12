/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Juan Cruz - 23110*/

import java.util.Map;

public class CartasManager {
    private ColeccionCartas coleccionCartas;

    public CartasManager(int opcion) {
        Map<String, Integer> mapa = FactoryMap.getMap(opcion);
        this.coleccionCartas = new ColeccionCartas(mapa);
    }

    public void agregarCarta(String nombreCarta) {
        coleccionCartas.agregarCarta(nombreCarta);
    }

    public void mostrarColeccion() {
        coleccionCartas.mostrarColeccion();
    }

    public void mostrarColeccionOrdenada() {
        coleccionCartas.mostrarColeccionOrdenada();
    }

    public void mostrarTipoCarta(String nombreCarta) {
        coleccionCartas.mostrarTipoCarta(nombreCarta);
    }

    public void mostrarTodasLasCartas() {
        coleccionCartas.mostrarTodasLasCartas();
    }

    public void mostrarTodasLasCartasOrdenadas() {
        coleccionCartas.mostrarTodasLasCartasOrdenadas();
    }
}
