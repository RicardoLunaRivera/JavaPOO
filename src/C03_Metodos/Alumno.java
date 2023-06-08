package C03_Metodos;

public class Alumno {
    int id;
    String nombre = "Ricardo";
    String apellido;

    /*
        Creación de los métodos mostrarNombre() y aprobado()
    */

    public void mostrarNombre(){
        System.out.println("Soy un alumno y mi nombre es: "+ nombre);
    }
    public void aprobado(double calificacion){
        if(calificacion >= 6){
            System.out.println("Pasé");
        }else {
            System.out.println("No pasé");
        }
    }
}
