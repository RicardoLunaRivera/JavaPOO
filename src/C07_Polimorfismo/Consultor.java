package C07_Polimorfismo;

public class Consultor extends Persona {
    String nombreConsultora;
    int numConsultora;

    public Consultor() {
    }

    public Consultor(int curp, String nombre, String apellido, String domicilio, String teléfono, String nombreConsultora, int numConsultora) {
        super(curp, nombre, apellido, domicilio, teléfono);
        this.nombreConsultora = nombreConsultora;
        this.numConsultora = numConsultora;
    }

    public String getNombreConsultora() {
        return nombreConsultora;
    }

    public void setNombreConsultora(String nombreConsultora) {
        this.nombreConsultora = nombreConsultora;
    }

    public int getNumConsultora() {
        return numConsultora;
    }

    public void setNumConsultora(int numConsultora) {
        this.numConsultora = numConsultora;
    }
}
