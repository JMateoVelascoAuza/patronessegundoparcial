package ejercicio2;

public class Docente extends Jugador {
    public Docente(IChatdeJuegos chatJuegos, String alias, String nombre, String ranking) {
        super(chatJuegos, alias, nombre, ranking);
    }

    @Override
    public void send(String msg) {

        chatdeJuegos.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("INFO: El docente: " + getNombre() + ", recibe el siguiente mensaje: " + msg);

    }
}
