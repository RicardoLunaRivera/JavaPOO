package C07_Polimorfismo;

public class Persona {
    int curp;
    String nombre;
    String apellido;
    String domicilio;
    String teléfono;

    public Persona() {
    }

    public Persona(int curp, String nombre, String apellido, String domicilio, String teléfono) {
        this.curp = curp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.teléfono = teléfono;
    }

    public int getCurp() {
        return curp;
    }

    public void setCurp(int curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }
}
