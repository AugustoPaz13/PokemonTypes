package pokemons;

public class Charmander extends Pokemon implements TipoFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("¡Charmander ha utilizado Placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("¡Charmander ha utilizado Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("¡Charmander ha utilizado Mordisco!");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("¡Charmander ha utilizado Puño de Fuego!");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("¡Charmander ha utilizado Ascuas!");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("¡Charmander ha utilizado Lanza Llamas!");
    }
}
