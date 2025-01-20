package pokemons;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int tempAparicion;
    protected String tipoPokemon;

    public Pokemon() {
        //Constructor vacio
    }

    public Pokemon(int numPokedex, String nombrePokemon, String sexo, double pesoPokemon, int tempAparicion, String tipoPokemon) {
        this.numPokedex = numPokedex;
        this.nombrePokemon = nombrePokemon;
        this.sexo = sexo;
        this.pesoPokemon = pesoPokemon;
        this.tempAparicion = tempAparicion;
        this.tipoPokemon = tipoPokemon;
    }

    //Getters and Setters de cada variable
    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTempAparicion() {
        return tempAparicion;
    }

    public void setTempAparicion(int tempAparicion) {
        this.tempAparicion = tempAparicion;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    //Ataques básicos de cada Pokemón
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
