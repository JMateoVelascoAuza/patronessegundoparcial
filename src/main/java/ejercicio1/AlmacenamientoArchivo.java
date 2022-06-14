package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoArchivo {
    private Map<String,Memento> versiones= new HashMap<>();
    private int index = 1;
    private int sizeAnterior = 0;


    public void createSave(Memento m){
        if(m.getTexto().getTexto().split(" ").length - sizeAnterior >= 5){
            versiones.put("version"+index,m);
            index++;
            sizeAnterior = m.getTexto().getTexto().split(" ").length;
        }
    }

    public Memento getSave(String formato){
        return versiones.get(formato);
    }
}
