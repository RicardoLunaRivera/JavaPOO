package C05_Herencia;

public class Empleado extends Persona{
    int numeroDeEmpleado;
    String cargo;
    double sueldo;

    public Empleado() {
    }

    //en una clase que era de otra, al generar el constructor podemos observar por la palabra reservada "super"
    //que también tenemos acceso a los atributos de la calse padre (Persona)
    public Empleado(int curp, String nombre, String apellido, String domicilio, String teléfono, int numeroDeEmpleado, String cargo, double sueldo) {
        super(curp, nombre, apellido, domicilio, teléfono);
        this.numeroDeEmpleado = numeroDeEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumeroDeEmpleado() {
        return numeroDeEmpleado;
    }

    public void setNumeroDeEmpleado(int numeroDeEmpleado) {
        this.numeroDeEmpleado = numeroDeEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

