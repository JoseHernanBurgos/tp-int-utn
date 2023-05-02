
package com.mycompany.tp1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Tp1 {

    public static void main(String[] args) throws FileNotFoundException {
       File pronosticos = new File("C:\\Users\\jose_\\Documents\\NetBeansProjects\\copiaTp1\\src\\main\\java\\com\\mycompany\\tp1\\Pronosticos.csv");
       File resultados = new File("C:\\Users\\jose_\\Documents\\NetBeansProjects\\copiaTp1\\src\\main\\java\\com\\mycompany\\tp1\\Resultados.csv");
       Scanner scan_pronosticos = new Scanner(pronosticos);
       Scanner scan_resultados = new Scanner(resultados);
               
while (scan_resultados.hasNextLine()) {
    int puntos = 0;
    String linea = scan_resultados .nextLine();
    String[] datos = linea.split(",");
    int goles1 = Integer.parseInt(datos[1]);
    int goles2 = Integer.parseInt(datos[2]);
    if(goles1<goles2){
    System.out.println("ArabiaSauditaGanador");
while (scan_pronosticos.hasNextLine()) {
    String linea2 = scan_pronosticos.nextLine();
    String[] datos2 = linea2.split(",");
    String equipo1p = datos2[0];
    String apuesta = datos2[1];
    if (apuesta.equals("x")) {
    } else if (apuesta.equals(equipo1p)){
        puntos++;
        System.out.println("Pronóstico correcto: Ganador - " + equipo1p);
    } else {
        System.out.println("Pronóstico incorrecto: Perdedor - " + equipo1p);
    }
}
System.out.println("Puntos totales: " + puntos);

}
}
}

    }
