package opcionesMenu;

import org.example.PartidoFifa;

import java.util.ArrayList;

public class MayorPaliza {
    public void mayorPaliza(ArrayList<PartidoFifa> partidos){
        int maximoActual=0;
        int diferencia;
        for (PartidoFifa partido : partidos) {
            diferencia = (Math.abs(partido.getGolesLocal()- partido.getGolesVisitante()));
            if (maximoActual < diferencia){
                maximoActual = diferencia;
            }
        }
        for (PartidoFifa partido :partidos){
            diferencia = (Math.abs(partido.getGolesLocal()- partido.getGolesVisitante()));
            if (diferencia==maximoActual){
                System.out.println(partido.toCSV());
            }
        }
    }
}
