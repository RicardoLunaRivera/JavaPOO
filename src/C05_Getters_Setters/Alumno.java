package C05_Getters_Setters;

public class Alumno {
    //Parametros
    int id;
    String nombre;
    String apellido;

    //Constructor Vacio
    public Alumno() {}

    //Constructor con parámetos
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Creación de Métodos Setter y Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Método de clase
    public void mostrarnombre(){
        System.out.println("Hola mi nombre es: " +nombre);
    }
}
