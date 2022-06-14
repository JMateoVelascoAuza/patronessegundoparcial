package ejercicio1;

public class Client {
    public static void main(String[] args){
        Versionador versionador = new Versionador();
        AlmacenamientoArchivo almacenamientoArchivo = new AlmacenamientoArchivo();

        Texto texto = new Texto("este documento es una prueba");
        versionador.setVersion(texto);
        almacenamientoArchivo.createSave(versionador.createVersion());
        texto = new Texto(texto.getTexto()+" el exito solo depende de tu esfuerzo");
        versionador.setVersion(texto);
        almacenamientoArchivo.createSave(versionador.createVersion());
        texto = new Texto(texto.getTexto()+" prologo");
        versionador.setVersion(texto);
        almacenamientoArchivo.createSave(versionador.createVersion());
        texto = new Texto(texto.getTexto()+" este documento fye actualizado satisfactoriamente");
        versionador.setVersion(texto);
        almacenamientoArchivo.createSave(versionador.createVersion());
        System.out.println(texto.getTexto());


        texto = versionador.restoreVersion(almacenamientoArchivo.getSave("version3"));
        System.out.println(texto.getTexto());
    }

}
