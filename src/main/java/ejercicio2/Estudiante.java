package ejercicio2;

public class Estudiante extends Jugador{
    public Estudiante(IChatdeJuegos chatdeJuegos, String alias, String nombre, String ranking) {
        super(chatdeJuegos, alias, nombre, ranking);
    }

    @Override
    public void send(String msg) {

        chatdeJuegos.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("INFO: El estudiante: " + getNombre() + ", recibe el siguiente mensaje: " + msg);

    }
}
