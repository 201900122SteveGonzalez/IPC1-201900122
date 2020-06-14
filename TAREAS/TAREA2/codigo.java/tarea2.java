package tarea2;
/**
 *
 * @author Steve Gonzalez
 */
public class tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Controlador inicio = new Controlador();
         
         inicio.getcaballro_Purasangre().avanzar();
         inicio.getcaballro_Purasangre().frenar();
         
         inicio.getcaballo_frison().avanzar();
         inicio.getcaballo_frison().frenar();
         
         inicio.getdeportivo().avanzar();
         inicio.getdeportivo().frenar();
         
         inicio.getCocheRegular().avanzar();
         inicio.getCocheRegular().frenar();
         
         inicio.getavion_de_guerra().avanzar();
         inicio.getavion_de_guerra().frenar();
         
         inicio.getavion_pasillo_unico().avanzar();
         inicio.getavion_pasillo_unico().frenar();
         
    }
    
}
