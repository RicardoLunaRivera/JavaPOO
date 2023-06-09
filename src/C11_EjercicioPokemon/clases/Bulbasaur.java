package C11_EjercicioPokemon.clases;

import C11_EjercicioPokemon.Pokemon;
import C11_EjercicioPokemon.interfaces.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur ataca con Placaje");
    }

    @Override
    public void atacarAranniazo() {
        System.out.println("Bulbasaur ataca con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur ataca con Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur ataca con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur ataca con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur ataca con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur ataca con Latigo Cepa");
    }
}
