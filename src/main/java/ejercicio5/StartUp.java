package ejercicio5;

import java.util.Arrays;
import java.util.Random;

public class StartUp implements IEstadoComputadora{
    @Override
    public void setStateComputadora(Computadora computadora) {

        int programasAbiertos = new Random().nextInt(10);

        for(int i = 0; i< programasAbiertos; i++) {

            computadora.getProgramasAbiertos()[i] = "Programa " + (i+1);

        }

        System.out.println("Se han abierto: " + programasAbiertos + " programas");
        System.out.println("Entonces los recursos aimentan : " + 5*programasAbiertos + "% ");

        computadora.setConsumoCPU(computadora.getConsumoCPU() + 5*programasAbiertos);
        computadora.setConsumoRam(computadora.getConsumoRam() + 5*programasAbiertos);

    }
}
