package utilidades;

public class Alumno {
    private String cedula;
    private String nombre;
    private String Apellido;
    private int edad;
    private double altura;
    private double matricula;
    private boolean sexo; // true = Femenino, false = Masculino
    private int turno; // 1 = Mañana, 2 = Tarde, 3 = Noche
    public Object getTurno;
    public Alumno(String cedula, String nombre, String apellido, int edad, double altura, double matricula,
            boolean sexo, int turno) {
        this.cedula = cedula;
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.matricula = matricula;
        this.sexo = sexo;
        this.turno = turno;
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public int getEdad() {
        return edad;
    }
    public double getAltura() {
        return altura;
    }
    public double getMatricula() {
        return matricula;
    }
    public boolean isSexo() {
        return sexo;
    }
    public int getTurno() {
        return turno;
    }
    
}
