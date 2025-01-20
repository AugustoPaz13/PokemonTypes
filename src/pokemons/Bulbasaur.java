package pokemons;

public class Bulbasaur extends Pokemon implements TipoPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("¡Bulbasaur ha utilizado Placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("¡Bulbasaur ha utilizado Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("¡Mordisco ha utilizado Mordisco!");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("¡Mordisco ha utilizado Paralizar!");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("¡Mordisco ha utilizado Drenaje!");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("¡Mordisco ha utilizado Hoja Afilada!");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("¡Mordisco ha utilizado Latigo Cepa!");
    }
}
