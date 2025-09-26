package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExtraerCSV {

    public ArrayList<PartidoFifa> csvAObjeto(File csv) throws FileNotFoundException {
        Scanner leer = new Scanner(csv);
        ArrayList<PartidoFifa> partidos = new ArrayList<>();
        String[] lineaSeparada;
        String linea;
        leer.nextLine();
        while (leer.hasNext()){
            linea = leer.nextLine();
            lineaSeparada=linea.split(",");
            PartidoFifa partido = new PartidoFifa(lineaSeparada[0],lineaSeparada[1],
                    lineaSeparada[2],Integer.parseInt(lineaSeparada[9]),
                    Integer.parseInt(lineaSeparada[10]),lineaSeparada[12],lineaSeparada[11],lineaSeparada[13]);
            partidos.add(partido);
        }
        return partidos;
    }

}
