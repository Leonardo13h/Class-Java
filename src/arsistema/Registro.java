package arsistema;

import utilidades.Alumno;
import utilidades.Util;

public class Registro {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(
            "31.708.916", 
            "Leonardo",
             "Hernandez", 
             19,
              1.74,
               1266.88,
                false,
                 1);
    
                 verDatosAlumno(alumno);
    }

    private static void verDatosAlumno(Alumno alumno) {
        Util.encabezado("datos del alumno", 45);
        System.out.println("Cédula: " + alumno.getCedula());
        var nombreCompleto = alumno.getNombre() + " " + alumno.getApellido();
        System.out.println("Nombre completo: " + nombreCompleto.toUpperCase());
        System.out.printf("Edad: %d años %n", alumno.getEdad());
        System.out.printf("Altura: %.2f metros %n", alumno.getAltura());
        System.out.printf("Costo de Matricula: %.2f dólares %n", alumno.getMatricula());
        System.out.println("Sexo: " + obtenerSexo(alumno.isSexo()));
        System.out.println("turno: " + obtenerTurno(alumno.getTurno()));
        Util.linea(45);
    }

    private static String obtenerTurno(int turno) {
        String resultado = switch (turno) {
            case 1 -> "Mañana";
            case 2 -> "Tarde";
            case 3 -> "Noche";
            default -> "No tiene turno";

          
                
            
        };
        return resultado;
    }

    private static String obtenerSexo(boolean sexo) {
        if (sexo) {
            return "femenino";
        } else {
            return "Masculino";
        }
    }
}
