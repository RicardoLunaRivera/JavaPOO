package C16_Stacks;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Stack<Integer> pila = new  Stack<Integer>();

        System.out.println("Pila vacia: " + pila);
        System.out.println("¿La pila está vacia? "+ pila.isEmpty());

        //Aregar alementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //Recorrer los valores
        for (Integer pilas : pila){
            System.out.println(pilas);
        }

        //Verifiacar si la pila tiene elementos
        System.out.println("Pila: " + pila);
        System.out.println("¿La pila está vacia? "+ pila.isEmpty());

        //pop elimina el último registro que entro
        pila.pop();
        System.out.println(pila);

        //search, busca si un elemento existe dentro de la pila
        System.out.println("¿Está el número 2 en la pila? " + pila.search(2));

        //SAber cuál es último elemento que fue agregado
        System.out.println("Último valor agregado: " + pila.peek());

    }
}
