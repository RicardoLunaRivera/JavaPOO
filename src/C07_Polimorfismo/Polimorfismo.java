package C07_Polimorfismo;

import java.util.Vector;

public class Polimorfismo {
    public static void main(String[] args) {
        //no se puede mesclar tipos de datos
        //String vector [] = new String[3];
        //vector[0] = 1; //error java: incompatible types: int cannot be converted to java.lang.String

        /*
        Se aplica el polimorfismo ya que Empleado, consultor, jede, son formas de de Persona
         */
        Persona vector [] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();
        //vector [4] = "holamundo"

        Persona persona = new Persona();
        Consultor consultor = new Consultor();
        persona = consultor;
        //consultor = persona;
    }
}
