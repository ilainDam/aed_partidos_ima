package opcionesMenu;

import org.example.PartidoFifa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GanadosPais {
    public void filtrado(ArrayList<PartidoFifa> partidos) throws IOException {
        Scanner leer = new Scanner(System.in);
        ArrayList<PartidoFifa> partidosFiltrados = new ArrayList<>();
        String pais;
        System.out.println("Por que pais quieres filtrar");
        pais = leer.nextLine();
        for (PartidoFifa partido : partidos) {
            if ((partido.getEquipoLocal().equalsIgnoreCase(pais) && partido.getGolesLocal()> partido.getGolesVisitante())
                    ||
                    (partido.getEquipoVisitante().equalsIgnoreCase(pais) && partido.getGolesLocal()< partido.getGolesVisitante())){
                partidosFiltrados.add(partido);
            }
        }
        new GuardarFichero().exportarFichero(partidosFiltrados,"wonBy"+pais);
    }
}
