package C08_Encapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        //Objeto sin parámetros
        Alumno alumno1 = new Alumno();

        //Objeto con parámetos
        Alumno alumno2 = new Alumno(2, "Ricardo", "Luna");

        //Utilizando método get para obtner los datos del objeto "Alumno 2"
        System.out.println("El ID del alumno2 es: "+ alumno2.getId());
        System.out.println("El Nombre del alumno2 es: "+ alumno2.getNombre());
        System.out.println("El Apellido del alumno2 es: "+ alumno2.getApellido());

        //Utilizamos set para asignarle valores al alumno 1
        alumno1.setId(1);
        alumno1.setNombre("Chat");
        alumno1.setApellido("GPT3");

        //traemos lo valores de alumno 1
        System.out.println("______________________________________________________");
        System.out.println("El ID del alumno1 es: "+ alumno1.getId());
        System.out.println("El Nombre del alumno1 es: "+ alumno1.getNombre());
        System.out.println("El Apellido del alumno1 es: "+ alumno1.getApellido());

        //Utilizamos set para cmabiar el valor de ID del alumno 2
        alumno2.setId(22);

        //mostramos el cambio de id del alumno 2
        System.out.println("______________________________________________________");
        System.out.println("El ID del alumno2 es: "+ alumno2.getId()); //Cambiará el valor de ID de 2 a -> 22
        System.out.println("El Nombre del alumno2 es: "+ alumno2.getNombre());
        System.out.println("El Apellido del alumno2 es: "+ alumno2.getApellido());
    }
}
