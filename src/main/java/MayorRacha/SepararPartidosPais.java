package MayorRacha;

import org.example.PartidoFifa;

import java.util.ArrayList;

public class SepararPartidosPais {

    public void separarPartidos(ArrayList<PartidoFifa> partidos,String pais){
        ArrayList<PartidoFifa> partidosPais=new ArrayList<>();
        for (PartidoFifa partido : partidos){
            if (partido.getPais().equalsIgnoreCase(pais)){
                partidosPais.add(partido);
            }
        }
        new OrdenarFecha().BubbleSort(partidosPais,pais);
    }

}
