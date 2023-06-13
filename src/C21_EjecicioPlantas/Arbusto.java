package C21_EjecicioPlantas;

public class Arbusto extends Planta{
    private double anchoArbusto;
    private boolean esDomestico;
    private String variedadArbusto;
    private String colorDeHojas;
    private boolean sePoda;

    public Arbusto() {
    }

    public Arbusto(String nombe, double altoTallo, boolean tieneHojas, String climaIdeal, double anchoArbusto, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePoda) {
        super(nombe, altoTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePoda = sePoda;
    }

    @Override
    public void saludo() {

        System.out.println("Hola soy un Arbusto");
    }
}
