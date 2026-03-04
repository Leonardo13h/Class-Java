package arsistema;

import java.util.HashMap;
import java.util.Map;

import utilidades.Util;

public class Empleado {
    public static void main(String[] args) {
        // declarar un mapa de empleado
        Map<String, Object> empleado = new HashMap<>();

        empleado.put("cedula", "31.708.916");
        empleado.put("Nombre", "Leonardo");
        empleado.put("Apellido", "Hernandez");
        empleado.put("Edad", 19);
        empleado.put("Altura", 1.74);
        empleado.put("Salario", 1225.65);
        
        Util.linea(50);
        Util.encabezado("Ver satos de empleado", 46);

        for (Map.Entry<String, Object> entrada : empleado.entrySet()) {

            System.out.println(entrada.getKey().toUpperCase() + ": " + entrada.getValue());
            

            Util.linea(50);
        }

    }

}
