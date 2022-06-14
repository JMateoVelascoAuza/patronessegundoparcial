package ejercicio3;

public class User implements IUser{

    private String userName;
    private PreferenciaUser preferenciaUser;

    public User(String userName, PreferenciaUser preferenciaUsuario) {
        this.userName = userName;
        this.preferenciaUser = preferenciaUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PreferenciaUser getPreferenciaUsuario() {
        return preferenciaUser;
    }

    public void setPreferenciaUsuario(PreferenciaUser preferenciaUser) {
        this.preferenciaUser = preferenciaUser;
    }

    @Override
    public void update(String msg, Notificacion notificacion) {

        System.out.println("El usuario " + userName + ", recibe la notificacion: " + notificacion.getContenido() + " junto con el mensaje: " + msg);

    }


}
