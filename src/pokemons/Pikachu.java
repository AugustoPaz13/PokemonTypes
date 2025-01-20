package pokemons;

public class Pikachu extends Pokemon implements TipoElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("¡Pikachu ha utilizado Placaje!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("¡Pikachu ha utilizado Arañazo!");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("¡Pikachu ha utilizado Mordisco!");
    }

    @Override
    public void atacarimpacTrueno() {
        System.out.println("¡Pikachu ha utilizado Impact Trueno!");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("¡Pikachu ha utilizado Puño Trueno!");
    }

    @Override
    public void atacarRayo() {
        System.out.println("¡Pikachu ha utilizado Rayo!");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("¡Pikachu ha utilizado Rayo Carga!");
    }
}
