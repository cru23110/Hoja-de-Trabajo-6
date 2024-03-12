/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Juan Cruz - 23110*/

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Selección del tipo de mapa por parte del usuario
        System.out.println("Seleccione el tipo de mapa a utilizar:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        int tipoMapa = Integer.parseInt(scanner.nextLine());

        // Instanciación del gestor de cartas con el tipo de mapa seleccionado
        CartasManager cartasManager = new CartasManager(tipoMapa);

        // Carga inicial de cartas desde el archivo
        String nombreArchivo = "cards_desc.txt"; // Asegúrate de que este archivo esté correctamente ubicado
        try {
            List<Carta> cartas = LecturaArchivo.leerCartas(nombreArchivo);
            for (Carta carta : cartas) {
                cartasManager.cargarCarta(carta.getNombre(), carta.getTipo());
            }
            System.out.println("Cartas cargadas correctamente del archivo.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de cartas: " + e.getMessage());
            return;
        }

        // Menú principal para interactuar con el usuario
        int opcion;
        do {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Agregar carta a la colección del usuario.");
            System.out.println("2. Mostrar el tipo de una carta.");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la carta a agregar:");
                    String nombreCarta = scanner.nextLine();
                    cartasManager.agregarCartaUsuario(nombreCarta);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la carta para mostrar su tipo:");
                    String nombre = scanner.nextLine();
                    cartasManager.mostrarTipoCarta(nombre);
                    break;
                case 0:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}