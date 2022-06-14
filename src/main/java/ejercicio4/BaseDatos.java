package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {

    private List<Estudiante> almacenamientoEstudiantes = new ArrayList<>();
    private ISorteo sorting = new SorteoNombre();

    public List<Estudiante> getAlmacenamientoEstudiantes() {
        return almacenamientoEstudiantes;
    }

    public void setAlmacenamientoEstudiantes(List<Estudiante> almacenamientoEstudiantes) {
        this.almacenamientoEstudiantes = almacenamientoEstudiantes;
    }

    public ISorteo getSorting() {
        return sorting;
    }

    public void setSorting(ISorteo sorting) {
        this.sorting = sorting;
    }

    public BaseDatos(ISorteo sorting) {

        this.sorting = sorting;

    }

    public void addEstudiantes(Estudiante estudiante) {

        almacenamientoEstudiantes.add(estudiante);

    }

    public void sortListaEstudiantes() {

        sorting.sort(almacenamientoEstudiantes);

    }



}

