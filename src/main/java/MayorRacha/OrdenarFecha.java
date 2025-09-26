package MayorRacha;

import org.example.PartidoFifa;

import java.util.ArrayList;
import java.util.Arrays;

public class OrdenarFecha {

    public ArrayList<PartidoFifa> BubbleSort(ArrayList<PartidoFifa> partidos,String pais) {
        PartidoFifa temp;
        boolean swapped;
        PartidoFifa[] partidoArray = partidos.toArray(new PartidoFifa[0]);
        for (int i = 0; i < partidoArray.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < partidoArray.length - i - 1; j++) {
                if (comprobarFecha(partidoArray[j], partidoArray[j + 1])) {
                    temp = partidoArray[j];
                    partidoArray[j] = partidoArray[j + 1];
                    partidoArray[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
        ArrayList<PartidoFifa> partidosOrdenados = new ArrayList<>(Arrays.asList(partidoArray));
        for (PartidoFifa partido : partidosOrdenados) {
            System.out.println(partido.toCSV());
        }
        new ComprobarRacha().racha(partidosOrdenados,pais);
        return partidosOrdenados;
    }

    public boolean comprobarFecha(PartidoFifa mayor, PartidoFifa menor) {
        boolean esMayor = false;
        if (mayor.getFechaFormateada().getYear() > menor.getFechaFormateada().getYear()) {
            esMayor = true;
        }
        if (mayor.getFechaFormateada().getYear() == menor.getFechaFormateada().getYear()) {
            if (mayor.getFechaFormateada().getDayOfYear() > menor.getFechaFormateada().getDayOfYear()) {
                esMayor = true;
            }
        }
        return esMayor;
    }
}
