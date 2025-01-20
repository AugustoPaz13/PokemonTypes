package pokemons;

public class Squirtle extends Pokemon implements TipoAgua {

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("¡Squirtle ha utilizado Placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("¡Squirtle ha utilizado Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("¡Squirtle ha utilizado Mordisco!");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("¡Squirtle ha utilizado Hidro Bomba!");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("¡Squirtle ha utilizado Pistola de Agua!");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("¡Squirtle ha utilizado Burbuja!");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("¡Squirtle ha utilizado Hidro Pulso!");
    }
}
