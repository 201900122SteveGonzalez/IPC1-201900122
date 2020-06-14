/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author USUARIO
 */
public class Controlador {
 private Avion avion_de_guerra;
 private Avion avion_pasillo_unico;
 
 private Caballo caballo_Purasangre;
 private Caballo caballo_frison;
 
 private Coche deportivo;
 private Coche CocheRegular;

    public Controlador() {
        this.avion_de_guerra = new Avion(58, "rockwel", "KX215");
        this.avion_pasillo_unico  = new Avion(10, "Airbus", "A380");
        
        this.caballo_Purasangre =  new Caballo("michael", "Purasangre", 15);
        this.caballo_frison = new Caballo("Stewart", "frison", 8);
        
        this.deportivo = new Coche("ferrari", 2012, "FF.");
        this.CocheRegular = new Coche("Toyota", 2001, "Sedan");
                
    }

    /**
     * @return the avion_de_guerra
     */
    public Avion getavion_de_guerra() {
        return avion_de_guerra;
    }

    /**
     * @param avion_de_guerra
     */
    public void setavion_de_guerra(Avion avion_de_guerra) {
        this.avion_de_guerra = avion_de_guerra;
    }

    /**
     * @return the avion_pasillo_unico
     */
    public Avion getavion_pasillo_unico() {
        return avion_pasillo_unico;
    }

    /**
     * @param avion_pasillo_unico
     */
    public void setavion_pasillo_unico(Avion avion_pasillo_unico) {
        this.avion_pasillo_unico = avion_pasillo_unico;
    }

    /**
     * @return the caballro_Purasangre
     */
    public Caballo getcaballro_Purasangre() {
        return caballo_Purasangre;
    }

    /**
     * @param caballro_Purasangre
     */
    public void setcaballro_Purasangre(Caballo caballro_Purasangre) {
        this.caballo_Purasangre = caballro_Purasangre;
    }

    /**
     * @return the caballo_frison
     */
    public Caballo getcaballo_frison() {
        return caballo_frison;
    }

    /**
     * @param caballo_frison
     */
    public void setcaballo_frison(Caballo caballo_frison) {
        this.caballo_frison = caballo_frison;
    }

    /**
     * @return the deportivo
     */
    public Coche getdeportivo() {
        return deportivo;
    }

    /**
     * @param deportivo
     */
    public void setdeportivo(Coche deportivo) {
        this.deportivo = deportivo;
    }

    /**
     * @return the carroRegular
     */
    public Coche getCocheRegular() {
        return CocheRegular;
    }

    /**
     * @param CocheRegular
     */
    public void setCocheRegular(Coche CocheRegular) {
        this.CocheRegular = CocheRegular;
    }
 
}
