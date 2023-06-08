package C04_Metodos_Objetos;

public class Alumno {
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

    public void mostrarnombre(){
        System.out.println("Hola mi nombre es: " +nombre);
    }
}
