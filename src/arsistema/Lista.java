package arsistema;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import utilidades.Util;

public class Lista {
    public static void main(String[] args) {
        // declarar una lista de edades
        List<Integer> edades = new ArrayList<>(List.of(
                8,
                13,
                19,
                21,
                15,
                14,
                87,
                25,
                29,
                11,
                25,
                45));

        Util.linea(50);
        System.out.println("Cantidad de edades " + edades.size());
        Util.linea(50);
        System.out.println("La tercera edad es " + edades.get(2));
        Util.linea(50);
        System.out.println("La quinta edad es " + edades.get(4));
        Util.linea(50);
        System.out.println("La septima edad es " + edades.get(6));
        Util.linea(50);
        System.out.println("La septima edad es " + edades.getLast());
        Util.linea(50);
        edades.add(30);
        edades.add(33);
        edades.addAll(List.of(20, 12, 15, 78, 56));
        System.out.println(edades);
        Util.linea(50);
        System.out.println("Cantidad de edades " + edades.size());
        Util.linea(50);
        var porcionLista = edades.subList(3, 7);
        System.out.println("Ver la porción de la lista: " + porcionLista);

        Util.encabezado("leer la lista de edades (for)", 50);
        for (int i = 0; i < edades.size(); i++) {
            System.out.printf("La edad %d es %d %n", i, edades.get(i));

        }
        Util.encabezado("leer la lista de edades (forEach)", 50);
        for (Integer edad : edades) {
            System.out.println("La edad es " + edad);

        }
        Util.encabezado("Leer lista de edades (stream)", 50);
        edades.stream().forEach((edad) -> System.out.println("La edad es " + edad));

        Util.encabezado("Edades ordenadas de forma acendente ", 50);
        edades
                .stream()
                .sorted()
                .forEach((edad) -> System.out.println("La edad es " + edad));

        Util.encabezado("Edades ordenadas de forma decendente ", 50);
        edades
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach((edad) -> System.out.println("La edad es " + edad));

        Util.encabezado("Ver los mayores de edad", 50);
        edades
                .stream()
                .sorted()
                .filter((edad) -> edad >= 18)
                .forEach((edad) -> System.out.println("La edad es " + edad));

        Util.encabezado("Ver los menores de edad", 50);
        edades
                .stream()
                .sorted()
                .filter((edad) -> edad <= 18)
                .forEach((edad) -> System.out.println("La edad es " + edad));

        Util.encabezado("Ver las edades Unicas", 50);
        Set<Integer> edadesUnicas = new HashSet<>(edades);
        edadesUnicas
        .stream()
        .sorted()
        .forEach((edad) -> System.out.println("La edad es " + edad)); 
            
        

    }
}
