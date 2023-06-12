package C17_Excepciones;

public class Excepciones {
    public static void main(String[] args) {
        //Ejemplo

        try{
            int resultado = 3/0;
        } catch (Exception e){
            System.out.println("no se puede dividir entre 0, error: " + e.getMessage());
        }

        // ejemplo 2
        int edades [] = {15, 12, 3};

        try {
            System.out.println("La edad en la posición 3 es: "+ edades[3]);
        }catch (Exception e){
            System.out.println("Se produjo un error, no existe el indice " + e.getMessage());
        }
    }
}
