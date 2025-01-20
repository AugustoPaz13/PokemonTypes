package pokemons;

public class Menu {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();

        System.out.println("\nJuego de Pokemón\n");

        squirtle.atacarBurbuja();
        squirtle.atacarPlacaje();
        charmander.atacarLanzallamas();
        charmander.atacarMordisco();
        pikachu.atacarimpacTrueno();
        pikachu.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarHojaAfilada();
    }
}
