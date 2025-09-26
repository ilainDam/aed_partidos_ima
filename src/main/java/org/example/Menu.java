package org.example;

import MayorRacha.MayorRacha;
import opcionesMenu.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void menu() throws Exception {
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        while (!salir) {
            System.out.println("+MENU+");
            System.out.println("1. Version simplificada");
            System.out.println("2. Filtrar por pais");
            System.out.println("3. Ganados por un pais");
            System.out.println("4. Filtrar por año");
            System.out.println("5. Mayor paliza");
            System.out.println("6. Mayor Racha");
            System.out.println("0. Salir");
            opcion=leer.nextInt();
            if (opcion==0){
                salir=true;
            }else{
                procesamientoOpcionMenu(opcion);
            }
        }
    }
    public void procesamientoOpcionMenu(int opcion) throws Exception {
        ArrayList<PartidoFifa> partidos = new ExtraerCSV().csvAObjeto(new File("fifa.csv"));
        switch (opcion){
            case 1-> new Favoritos().filtrado(partidos);
            case 2->new FiltrarPais().filtrado(partidos);
            case 3->new GanadosPais().filtrado(partidos);
            case 4 ->new FiltrarAño().filtrado(partidos);
            case 5 ->new MayorPaliza().mayorPaliza(partidos);
            case 6 -> new MayorRacha().separarPaises(partidos);
            default ->System.out.println("No es una opcion valida");
        }
    }
}
