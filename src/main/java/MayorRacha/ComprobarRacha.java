package MayorRacha;

import org.example.PartidoFifa;

import java.util.ArrayList;

public class ComprobarRacha {

public void racha(ArrayList<PartidoFifa> partidos,String pais){
    int racha=0;
    int rachaMaxima=0;
    for (PartidoFifa partido : partidos) {
        if ((partido.getEquipoLocal().equalsIgnoreCase(pais) && partido.getGolesLocal()> partido.getGolesVisitante())
                ||
                (partido.getEquipoVisitante().equalsIgnoreCase(pais) && partido.getGolesLocal()< partido.getGolesVisitante())){
            racha++;
            if (racha>rachaMaxima){
                rachaMaxima=racha;
            }
        }else{
            racha=0;
        }
    }
    System.out.println("Racha maxima de "+pais+": "+rachaMaxima);
}

}
