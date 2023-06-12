package C18_RelacionClases;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1L, "Nisan", "Nisan 2023");

        List<Propietario> propietarioList = new ArrayList<Propietario>();

        Propietario propietario1 = new Propietario(1L,"Ricardo", "Luna" );
        Propietario propietario2 = new Propietario(2L,"Oak", "Takeshi" );

        propietarioList.add(propietario1);
        propietarioList.add(propietario2);

        auto1.setPropietarioList(propietarioList);

        System.out.println("El auto con ID "+ auto1.getId() + " tiene como dueños a "+ auto1.getPropietarioList().toString());
    }
}
