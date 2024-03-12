/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Juan Cruz - 23110*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecturaArchivo {
    public static List<Carta> leerCartas(String nombreArchivo) throws IOException {
        List<Carta> cartas = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split("\\|");
            String nombre = partes[0].trim();
            String tipo = partes[1].trim();
            cartas.add(new Carta(nombre, tipo));
        }

        br.close();
        return cartas;
    }
}

