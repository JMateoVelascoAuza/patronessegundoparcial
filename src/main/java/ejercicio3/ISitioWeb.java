package ejercicio3;

public interface ISitioWeb {

        void attach(IUser user);
        void dettach(IUser user);
        void notify(String msg, Notificacion notificacion);

    }

