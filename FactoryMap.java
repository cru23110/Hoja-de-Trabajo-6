import java.util.Map;

public class FactoryMap {
    public static Map<String, Integer> getMap(int opcion) {
        switch (opcion) {
            case 1:
                return new HashMap<>();
            case 2:
                return new TreeMap<>();
            case 3:
                return new LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("Opción de mapa no válida");
        }
    }
}

