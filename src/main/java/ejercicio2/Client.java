package ejercicio2;

public class Client {public static void main(String[] args) {

    ChatEquipo chatEquipo = new ChatEquipo();
    ChatEquipo2 chatEquipo2 = new ChatEquipo2();

    Estudiante estudiante1 = new Estudiante(chatEquipo, "Messa", "Fernadno", "4");
    Estudiante estudiante2 = new Estudiante(chatEquipo, "Barca", "Fer", "1");
    Estudiante estudiante3 = new Estudiante(chatEquipo, "Matiu", "Lucho", "4");
    Estudiante estudiante4 = new Estudiante(chatEquipo, "Marix", "Massa", "5");

    Docente docente1 = new Docente(chatEquipo, "Taca", "Josue", "4");
    Docente docente2 = new Docente(chatEquipo, "Plai", "Simon", "5");
    Docente docente3 = new Docente(chatEquipo, "Josap", "Julio", "6");
    Docente docente4 = new Docente(chatEquipo, "Varguis", "Ale", "2");

    chatEquipo.addJugador(estudiante1).addJugador(estudiante2).addJugador(estudiante3).addJugador(estudiante4)
            .addJugador(docente1).addJugador(docente2).addJugador(docente3).addJugador(docente4);


    estudiante1.send("Hola a todos!!!");
    System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
    docente2.send("Hola a mis amigops decentes!!!!");



    estudiante1.setChatJuegos(chatEquipo2);
    estudiante2.setChatJuegos(chatEquipo2);
    estudiante3.setChatJuegos(chatEquipo2);
    estudiante4.setChatJuegos(chatEquipo2);

    docente1.setChatJuegos(chatEquipo2);
    docente2.setChatJuegos(chatEquipo2);
    docente3.setChatJuegos(chatEquipo2);
    docente4.setChatJuegos(chatEquipo2);


    chatEquipo2.addJugador(estudiante1).addJugador(estudiante2).addJugador(estudiante3).addJugador(estudiante4)
            .addJugador(docente1).addJugador(docente2).addJugador(docente3).addJugador(docente4);

    System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

    docente1.send("Hola a todos!!!");
    System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
    estudiante4.send("Hola a todos!!!");




}

}
