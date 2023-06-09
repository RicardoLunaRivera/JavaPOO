package C11_EjercicioPokemon.clases;

import C11_EjercicioPokemon.Pokemon;
import C11_EjercicioPokemon.interfaces.IElectrico;
import C11_EjercicioPokemon.interfaces.IFuego;

public class Charmander extends Pokemon implements IFuego {
    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ataca con Placaje");
    }

    @Override
    protected void atacarAranniazo() {
        System.out.println("Charmander ataca con Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Charmander ataca con Mordisco");
    }


    @Override
    public void atacarPunioFuego() {
       System.out.println("Charmander ataca con Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander ataca con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander ataca con Lanza Llamas");
    }
}
