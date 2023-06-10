package C13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        //Creación de un ArrayList
        List<Persona> personas = new ArrayList<Persona>();

        //Agregar una persona a la lista
        personas.add(new Persona(1,"Ricardo",28));

        personas.add(new Persona(2,"Oak",50));
        personas.add(new Persona(3,"Ash",10));
        personas.add(new Persona(4,"Misty",10));
        personas.add(new Persona(5,"Brock",15));

        //Recorrer un ArrayList
        System.out.println("********* FOR *********");
        for (int i = 0; i < personas.size() ; i++) {
            System.out.println("Nombre: " + personas.get(i).getNombre());
        }

        System.out.println("\n ********* FOREACH *********");
        for(Persona persona:personas){
            System.out.println("Nombre: "+ persona.getNombre());
        }
    }
}
