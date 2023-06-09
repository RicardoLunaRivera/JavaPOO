package C09_ClasesAbstractas;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double x, double Y, double lado) {
        super(x, Y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
