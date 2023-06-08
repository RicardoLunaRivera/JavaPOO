package C07_Polimorfismo;

public class Jefe  extends Persona{
    int idJefe;
    String departamentoJefe;

    public Jefe() {
    }

    public Jefe(int curp, String nombre, String apellido, String domicilio, String teléfono, int idJefe, String departamentoJefe) {
        super(curp, nombre, apellido, domicilio, teléfono);
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }
}
