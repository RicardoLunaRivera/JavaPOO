package C05_Herencia;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.getCurp();
        empleado1.getNombre();

        Consultor consultor = new Consultor();
        consultor.getNumConsultora();
        consultor.getTeléfono();
    }
}
