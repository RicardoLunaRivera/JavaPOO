package C15_ArrayLinked_Lists;;

import C14_LinkedList.LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraryVsLinkedLists {

    public static void main(String[] args) {

        // se crea el ArrayList
        List<Persona> listArray = new ArrayList<Persona>();

        listArray.add(new Persona(1,"Ricardo",28));
        listArray.add(new Persona(2,"Oak",50));
        listArray.add(new Persona(3,"Ash",10));
        listArray.add(new Persona(4,"Misty",10));
        listArray.add(new Persona(5,"Brock",15));

        // se crea el LinkedList
        LinkedList listaLinked = new LinkedList<Persona>();

        listaLinked.add(new Persona(1,"Ricardo",28));
        listaLinked.add(new Persona(2,"Oak",50));
        listaLinked.add(new Persona(3,"Ash",10));
        listaLinked.add(new Persona(4,"Misty",10));
        listaLinked.add(new Persona(5,"Brock",15));


        //MÉTODOS MAS UTILIZADOS EN LISTAS

        //remove ArrayList
        listArray.remove(1); //Se utiliza el metodo remove junto con el índice

        //Remove LinkedList
        String removeName = "Ash";
/*        for (Persona nombrePersona : listaLinked){
            if (nombrePersona.getNombre().equals(removeName));
            listaLinked.remove(nombrePersona);
            break; //rompemos el ciclo for
        }*/

        //Tamaño de la lista
        System.out.println("## TAMAÑO DE LA LISTA ##");
        System.out.println("ArrayList: " + listArray.size());
        System.out.println("LinkedList: " + listaLinked.size());

        //Obtener el primer y el último elemento de una linkedlist
        System.out.println("\n primer elemento LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("último elemento de LinkedList: " + listaLinked.getLast().toString());


        //Borrar todos los elementos de una lista
        System.out.println("\n ## BORRAR LISTA ##");
        listArray.clear();
        listaLinked.clear();

        //Comprobar si una lista está vacia

        System.out.println("\n ¿LISTA VACIA?");
        System.out.println("ArrayList: "+listArray.isEmpty());
        System.out.println("Linkedlist: "+ listaLinked.isEmpty());
    }
}
