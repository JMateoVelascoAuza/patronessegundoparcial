package ejercicio5;

import java.util.Arrays;

public class Reset implements IEstadoComputadora{
    @Override
    public void setStateComputadora(Computadora computadora) {

        System.out.println("Reiniciando...");

        computadora.setConsumoRam(0);
        computadora.setConsumoCPU(0);
        Arrays.fill(computadora.getProgramasAbiertos(), null);

        System.out.println("REINICIADO!");

    }
}
