package C10_Interfaces;

import C10_Interfaces.interfaces.Dibujable;
import C10_Interfaces.interfaces.Figura;
import C10_Interfaces.interfaces.Rotable;

public class Circulo implements Figura, Dibujable, Rotable {
    private double PI = 3.1416;
    private double radio;

    public Circulo() {
    }

    public Circulo(double PI, double radio) {
        this.PI = PI;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado = PI *(radio * radio);
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibujó un Círculo");
    }

    @Override
    public void rotar() {
        System.out.println("El Círculo rotó");
    }
}
