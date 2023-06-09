package C11_EjercicioPokemon.clases;

import C11_EjercicioPokemon.Pokemon;
import C11_EjercicioPokemon.interfaces.IElectrico;

public class Pikachu extends Pokemon implements IElectrico {
    @Override
    public void atacarPlacaje() {
        System.out.println("Pikachu ataca con Placaje");
    }

    @Override
    protected void atacarAranniazo() {
        System.out.println("Pikachu ataca con Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu ataca con Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu ataca con Impactrueno");
    }

    @Override
    public void datacarPunioTrueno() {
        System.out.println("Pikachu ataca con Puño Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu ataca con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu ataca con Rayo Carga");
    }
}
