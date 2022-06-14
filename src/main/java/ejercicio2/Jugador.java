package ejercicio2;

public abstract class Jugador {

    protected IChatdeJuegos chatdeJuegos;

    private String alias;
    private String nombre;
    private String ranking;

    public Jugador(IChatdeJuegos chatdeJuegos, String alias, String nombre, String ranking) {
        this.chatdeJuegos= chatdeJuegos;
        this.alias = alias;
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public IChatdeJuegos getChatJuegos() {
        return chatdeJuegos;
    }

    public void setChatJuegos(IChatdeJuegos chatJuegos) {
        this.chatdeJuegos = chatJuegos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);

}
