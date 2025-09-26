package opcionesMenu;

import org.example.PartidoFifa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FiltrarAño {
    public void filtrado(ArrayList<PartidoFifa> partidos) throws IOException {
        Scanner leer = new Scanner(System.in);
        ArrayList<PartidoFifa> partidosFiltrados = new ArrayList<>();
        int año;
        System.out.println("Por que año quieres filtrar");
        año = leer.nextInt();
        if (año<1993 || año>2022){
            System.out.println("No existen partidos en ese año");
        }else{
            for (PartidoFifa partido : partidos) {
                if (partido.getFechaFormateada().getYear()==(año)){
                    partidosFiltrados.add(partido);
                }
            }
            new GuardarFichero().exportarFichero(partidosFiltrados,"gamesOf"+año);
        }

    }
}
