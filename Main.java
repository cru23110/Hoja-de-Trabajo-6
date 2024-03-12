/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Juan Cruz - 23110*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de mapa a utilizar:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        int tipoMapa = scanner.nextInt();

        
        if (tipoMapa < 1 || tipoMapa > 3) {
            System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 3.");
            scanner.close();
            return;
        }

        CartasManager cartasManager = new CartasManager(tipoMapa);
        int opcion;

        do {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Agregar una carta a la colección del usuario.");
            System.out.println("2. Mostrar el tipo de una carta específica.");
            System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta en la colección.");
            System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta en la colección, ordenadas por tipo.");
            System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
            System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); 


        } while (opcion != 0);

        scanner.close();
    }
}