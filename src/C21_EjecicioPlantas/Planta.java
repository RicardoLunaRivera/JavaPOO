package C21_EjecicioPlantas;

public abstract class Planta {


    private String nombe;
    private double altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nombe, double altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombe = nombe;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "nombe='" + nombe + '\'' +
                ", altoTallo=" + altoTallo +
                ", tieneHojas=" + tieneHojas +
                ", climaIdeal='" + climaIdeal + '\'' +
                '}';
    }

    protected  abstract void saludo();
}
