package C21_EjecicioPlantas;

public class Flor extends Planta{

    private String colorDePetalos;
    private double cantidadPromedioDePetalos;
    private String colorDelPistilo;
    private String colorDeLosPetalos;
    private String variedadDeFlor;
    private String estacionQueFlorece;

    public Flor() {
    }

    public Flor(String nombe, double altoTallo, boolean tieneHojas, String climaIdeal, String colorDePetalos, double cantidadPromedioDePetalos, String colorDelPistilo, String colorDeLosPetalos, String variedadDeFlor, String estacionQueFlorece) {
        super(nombe, altoTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
        this.colorDelPistilo = colorDelPistilo;
        this.colorDeLosPetalos = colorDeLosPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public double getCantidadPromedioDePetalos() {
        return cantidadPromedioDePetalos;
    }

    public void setCantidadPromedioDePetalos(double cantidadPromedioDePetalos) {
        this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
    }

    public String getColorDelPistilo() {
        return colorDelPistilo;
    }

    public void setColorDelPistilo(String colorDelPistilo) {
        this.colorDelPistilo = colorDelPistilo;
    }

    public String getColorDeLosPetalos() {
        return colorDeLosPetalos;
    }

    public void setColorDeLosPetalos(String colorDeLosPetalos) {
        this.colorDeLosPetalos = colorDeLosPetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    @Override
    public void saludo() {
        System.out.println("Hola soy una Flor");
    }
}
