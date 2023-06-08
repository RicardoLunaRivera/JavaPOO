package C02_Clases;
/*
En el siguiente ejemplo se declara la clase "Ejemplo", con los atributos xy a. Esta clase también contiene los métodos
hacerAlgo(), suma() e imprimir().
 */
public class Ejemplo {
    public int x;
    public int a;

    public void haceralgo(){
        x = 1 + a * 3;
    }

    public int suma(){
        return x + a;
    }

    public void imprimir(){
        System.out.println(" x= " + x + "a= " + a + "\n");
    }

}
