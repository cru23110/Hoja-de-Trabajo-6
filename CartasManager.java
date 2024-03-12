/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Juan Cruz - 23110*/

import java.util.HashMap;
import java.util.Map;

public class CartasManager {
    private Map<String, String> cartasDisponibles; // Mapa de nombre de carta a tipo.
    private Map<String, Integer> coleccionUsuario; // Mapa de nombre de carta a cantidad en la colección del usuario.

    public CartasManager(int opcion) {
        this.cartasDisponibles = FactoryMap.getMap(opcion);
        this.coleccionUsuario = new HashMap<>();
    }

    public void cargarCarta(String nombre, String tipo) {
        cartasDisponibles.put(nombre, tipo);
    }

    public void agregarCartaUsuario(String nombreCarta) {
        if (!cartasDisponibles.containsKey(nombreCarta)) {
            System.out.println("La carta \"" + nombreCarta + "\" no existe en las cartas disponibles.");
            return;
        }
        coleccionUsuario.put(nombreCarta, coleccionUsuario.getOrDefault(nombreCarta, 0) + 1);
        System.out.println("Carta \"" + nombreCarta + "\" agregada a la colección del usuario.");
    }

    public void mostrarTipoCarta(String nombreCarta) {
        String tipo = cartasDisponibles.get(nombreCarta);
        if (tipo != null) {
            System.out.println("La carta \"" + nombreCarta + "\" es de tipo " + tipo + ".");
        } else {
            System.out.println("La carta \"" + nombreCarta + "\" no existe.");
        }
    }

    // Implementa métodos adicionales según sea necesario...
}
