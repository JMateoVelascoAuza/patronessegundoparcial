package ejercicio3;

public class Client {

    public static void main(String[] args) {

        SitioWeb sitioWeb = new SitioWeb();

        User user1 = new User("Terminalo", PreferenciaUser.IMAGEN);
        User user2 = new User("Leo", PreferenciaUser.IMAGEN);
        User user3 = new User("Sminon", PreferenciaUser.VIDEO);
        User user4 = new User("Random", PreferenciaUser.VIDEO);
        User user5 = new User("Feixo", PreferenciaUser.TODO);

        sitioWeb.attach(user1);
        sitioWeb.attach(user2);
        sitioWeb.attach(user3);
        sitioWeb.attach(user4);
        sitioWeb.attach(user5);


        Notificacion notificacion1 = new Notificacion("Nuevo video!", TipoNotificacion.VIDEO);
        Notificacion notificacion2 = new Notificacion("Nueva imagen!", TipoNotificacion.IMAGEN);

        sitioWeb.subirImagen("Imagen Conceptual del arte");

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        sitioWeb.subirVideo("Video de Dota");


    }
}
