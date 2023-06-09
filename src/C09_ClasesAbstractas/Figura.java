package C09_ClasesAbstractas;

//Convetimos la clase en abstracta
public abstract class Figura {
    protected double x;
    protected double y;

    protected Figura() {
    }

    protected Figura(double x, double Y){
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();



}
