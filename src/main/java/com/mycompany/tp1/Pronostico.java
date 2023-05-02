
package com.mycompany.tp1;

public class Pronostico {

   private String equipo1;
   private String equipo2;
   private String apuesta;
 
   public Pronostico(String equipo1, String apuesta, String equipo2) {
       this.equipo1 = equipo1;
       this.equipo2 = equipo2;
       this.apuesta = apuesta;
   }

   public Pronostico(){};
   
   public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getApuesta() {
        return apuesta;
    }

    public void setApuesta(String apuesta) {
        this.apuesta = apuesta;
    }
}
