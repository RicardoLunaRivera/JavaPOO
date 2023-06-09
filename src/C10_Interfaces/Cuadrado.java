package C10_Interfaces;

import C10_Interfaces.interfaces.Dibujable;
import C10_Interfaces.interfaces.Figura;

public class Cuadrado implements Figura, Dibujable {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibujó un Cuadrado");
    }
}
