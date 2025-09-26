package opcionesMenu;

import org.example.PartidoFifa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GuardarFichero {

    public void exportarFichero(ArrayList<PartidoFifa> partidos,String nombreFichero) throws IOException {
        FileWriter fw = new FileWriter(nombreFichero+".csv");
        BufferedWriter escribir = new BufferedWriter(fw);
        escribir.write(partidos.getFirst().primerLineaCsv());
        escribir.newLine();
        for (PartidoFifa partido : partidos) {
            escribir.write(partido.toCSV());
            escribir.newLine();
        }
        escribir.close();
    }
    public void exportarFichero(PartidoFifa partido,String nombreFichero) throws IOException {
        FileWriter fw = new FileWriter(nombreFichero+".csv");
        BufferedWriter escribir = new BufferedWriter(fw);
        escribir.append(partido.toCSV());
        escribir.newLine();
        escribir.close();
    }

}
