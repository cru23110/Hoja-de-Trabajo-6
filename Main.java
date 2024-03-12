/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Juan Cruz - 23110*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartasManager cartasManager = new CartasManager();
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar una carta a la colección del usuario.");
            System.out.println("2. Mostrar el tipo de una carta específica.");
            System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta en la colección.");
            System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta en la colección, ordenadas por tipo.");
            System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del nextInt()

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la carta a agregar:");
                    String nombreCarta = scanner.nextLine();
                    cartasManager.agregarCarta(nombreCarta);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la carta:");
                    String nombre = scanner.nextLine();
                    cartasManager.mostrarTipoCarta(nombre);
                    break;
                case 3:
                    cartasManager.mostrarColeccion();
                    break;
                case 4:
                    cartasManager.mostrarColeccionOrdenada();
                    break;
                case 5:
                    cartasManager.mostrarTodasLasCartas();
                    break;
                case 6:
                    cartasManager.mostrarTodasLasCartasOrdenadas();
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
