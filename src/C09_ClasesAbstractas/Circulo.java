package C09_ClasesAbstractas;

public class Circulo extends Figura{
    private double PI = 3.1416;
    private double radio;

    public Circulo() {
    }

    public Circulo(double x, double Y, double PI, double radio) {
        super(x, Y);
        this.PI = PI;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado = PI *(radio * radio);
        return resultado;
    }
}
