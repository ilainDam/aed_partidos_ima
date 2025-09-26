package opcionesMenu;

import org.example.PartidoFifa;


import java.util.ArrayList;
import java.util.Scanner;

public class Favoritos {
    public void filtrado(ArrayList<PartidoFifa> partidos) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el indice del partido que quieres mostrar");
        new GuardarFichero().exportarFichero(partidos.get(leer.nextInt()),"myFavourites");
    }
}
