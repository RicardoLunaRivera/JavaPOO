package C20_Casteo;

public class Casteo {
    public static void main(String[] args) {
        double num = 1.68;

        //Casteo a int
        int numInt = (int) num;

        //Casteo a long
        long numLong = (long) num;

        System.out.println(num + " " + numInt + " " +numLong);


        //Casteo String
        String precio = "8.99";
        String cantidad = "5";

        double precioDouble = Double.parseDouble(precio);
        int cantidadInt = Integer.parseInt(cantidad);
        System.out.println("El calculo de precio + cantidad = " + (precio+cantidad));
        System.out.println("El calculo de precio + cantidad = " + (precioDouble * cantidadInt));


        //casteo de primitivo a string
        int edad = 28;
        double estatura = 1.72;

        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);

        System.out.println("Edad: "+ edadString + " Estatura: " +estaturaString);
        System.out.println("Edad: "+ edad + " Estatura: " +estatura);
    }
}
