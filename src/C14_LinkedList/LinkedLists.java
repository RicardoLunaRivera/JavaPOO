package C14_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {

        //Creación de un ArrayList
        List<Persona> personas = new LinkedList<Persona>();

        //Agregar una persona al final o al principio de la lista
        personas.add(new Persona(1,"Ricardo",28));
        personas.add(new Persona(2,"Oak",50));
        personas.add(new Persona(3,"Ash",10));
        personas.add(new Persona(4,"Misty",10));


        //Agregar una persona al principio de la lista
        personas.add(0, new Persona(5,"Brock",15));

        System.out.println("\n ********* FOREACH *********");
        for(Persona persona:personas){
            System.out.println("Nombre: "+ persona.getNombre());
        }
    }
}
