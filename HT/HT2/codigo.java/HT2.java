
package ht2;

public class HT2 {
    public static void main(String[] args) {
        avion_de_guerra avion1 = new avion_de_guerra();
        avion1.avanzar();
        avion1.frenar();
        avion_pasillo_unico avion2= new avion_pasillo_unico();
        avion2.avanzar();
        avion2.frenar();
        caballo_Purasangre caballo1 = new caballo_Purasangre();
        caballo1.avanzar();
        caballo1.frenar();
        caballo_frison caballo2 = new caballo_frison();
        caballo2.avanzar();
        caballo2.frenar();
        coche_deportivo coche1 = new coche_deportivo();
        coche1.avanzar();
        coche1.frenar();
        coche_regular coche2 = new coche_regular();
        coche2.avanzar();
        coche2.frenar();
    }
    
}
