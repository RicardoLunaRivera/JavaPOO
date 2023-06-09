package C11_EjercicioPokemon;

import C11_EjercicioPokemon.clases.Bulbasaur;
import C11_EjercicioPokemon.clases.Charmander;
import C11_EjercicioPokemon.clases.Pikachu;
import C11_EjercicioPokemon.clases.Squirtle;

public class Main {
    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();

        System.out.println("\n ###Squietle###");
        squirtle.atacarBurbuja();
        squirtle.atacarAranniazo();

        System.out.println("\n ###Bulbasaur###");
        bulbasaur.atacarAranniazo();
        bulbasaur.atacarHojaAfilada();

        System.out.println("\n ###Charmander###");
        charmander.atacarMordisco();
        charmander.atacarLanzallamas();

        System.out.println("\n ###Pikachu###");
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();

    }
}
