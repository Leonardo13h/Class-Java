package arsistema;

import java.util.Arrays;

import utilidades.Util;

public class Sumar {
    public static void main(String[] args) throws Exception {
        // Definir variables
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int suma = 0;
        String respuesta = "";

        while (true)
             { Util.encabezado("sumar numeros", 36);
        
        numero1 = Util.leerNumeroEntero("Ingresa primer numero") ;
        numero2 = Util.leerNumeroEntero("Ingresa segundo numero") ;
        numero3 = Util.leerNumeroEntero("Ingresa segundo numero") ;
        numero4 = Util.leerNumeroEntero("Ingresa segundo numero") ;

        suma = calcularSuma(numero1, numero2, numero3, numero4) ;
        
        Util.linea(36);
        System.out.println("la suma es " + suma);
        Util.linea(36);
         respuesta = Util.leerTexto("Desea continuar si o no");

         if (respuesta.equalsIgnoreCase("no")){
            break;
         }
            
        }
    }
    public static int calcularSuma(int... numeros) {

        return Arrays.stream(numeros).sum();

    }

}
