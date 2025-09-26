package MayorRacha;

import org.example.PartidoFifa;

import java.util.ArrayList;

public class MayorRacha {

    public void separarPaises(ArrayList<PartidoFifa> partidos){
        ArrayList<PartidoFifa> paisesDivididos = new ArrayList<>();
        for (int i = 0; i < partidos.size(); i++) {
            if (i==0){
                paisesDivididos.add(partidos.getFirst());
            }
            if (!estaElPais(paisesDivididos,partidos.get(i).getPais())){
                paisesDivididos.add(partidos.get(i));
            }
        }
        for (int i = 0; i < paisesDivididos.size(); i++) {
            new SepararPartidosPais().separarPartidos(partidos,paisesDivididos.get(i).getPais());
        }
    }
    public boolean estaElPais(ArrayList<PartidoFifa> partidos,String pais){
        boolean esta=false;
        for (PartidoFifa partido : partidos) {
            if (partido.getPais().equalsIgnoreCase(pais)){
                esta=true;
                break;
            }
        }
        return esta;
    }
}
