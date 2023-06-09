package C11_EjercicioPokemon.clases;

import C11_EjercicioPokemon.Pokemon;
import C11_EjercicioPokemon.interfaces.IAgua;

public class Squirtle extends Pokemon implements IAgua {
    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle ataca con Placaje");
    }

    @Override
    public void atacarAranniazo() {
        System.out.println("Squirtle ataca con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ataca con Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataca con Hidro Bomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con Pistola de Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle ataca con Hidropulso");
    }
}
