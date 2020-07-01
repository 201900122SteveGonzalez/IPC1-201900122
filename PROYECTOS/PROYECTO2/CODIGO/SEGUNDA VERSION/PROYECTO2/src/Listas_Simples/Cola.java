package Listas_Simples;

import java.awt.Color;
import javax.swing.JTextArea;
import proyecto2.RecogeBloques;

/**
 *
 * @author Steve González
 */
public class Cola {
    private Nodo cabeza;
    
    
     public void generar_listas(JTextArea text){
        text.setText("");
        if(this.getCabeza()==null){
            text.setText("LISA VACIA");
        }else{
         String encabezado = "digraph G { \n";
         String cabezera ="0[label=\"INICIO\"] \n";
         String cierre = "}";
                    String auxiliar="";
          Nodo actual =this.getCabeza();
          int anterior = 0;
          while(actual.getSiguiente() != null){
              if(actual == this.getCabeza()){
                auxiliar = auxiliar+((actual.getID() + " [label  = \"" + actual.getValor() +","+actual.getColor() + "\"];\n"));
              auxiliar = auxiliar+((0  + "->" + actual.getID() + "\n"));
              }else{
              auxiliar = auxiliar+((actual.getID() + " [label  = \"" + actual.getValor() +","+actual.getColor() + "\"];\n"));
              auxiliar = auxiliar+((anterior  + "->" + actual.getID() + "\n"));
              }
              anterior = actual.getID();
              actual = actual.getSiguiente();
          }
           if(actual == this.getCabeza()){
                auxiliar = auxiliar+((actual.getID() + " [label  = \"" + actual.getValor() +","+actual.getColor() + "\"];\n"));
              auxiliar = auxiliar+((0  + "->" + actual.getID() + "\n"));
              }else{
              auxiliar = auxiliar+((actual.getID() + " [label  = \"" + actual.getValor() +","+actual.getColor() + "\"];\n"));
              auxiliar = auxiliar+((anterior  + "->" + actual.getID() + "\n"));
           }
           String codigo = encabezado+cabezera+auxiliar+cierre;
        text.setText(codigo);
        }
    }
    
    public void reiniciar(){
        if(this.getCabeza()==null){
            System.out.println("ya se reinicio o esta vacia");
        }else{
            
        this.getCabeza().setSiguiente(null);
        this.setCabeza(null);
        RecogeBloques.verdes = 0;
        }
    }

    public void encolar(int Valor, String color, int ID) {
        //inserta el nodo al final de la lista
        boolean verificacion = existe(Valor);
     if(verificacion==false){
      Nodo auxiliar = new Nodo(Valor, color, ID);
        if (getCabeza() == null) {
            setCabeza(auxiliar);
        } else {
            Nodo actual;
            for (actual = getCabeza(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
        }   
     }
    }
    
    public boolean existe(int Valor){
        boolean repetido = false;
             Nodo verificador;
          if(this.getCabeza()!=null){
            for (verificador = this.getCabeza(); verificador.getSiguiente() != null; verificador = verificador.getSiguiente()) {
              if(verificador.getValor()==Valor){
                  RecogeBloques.verdes--;
                  repetido = true;
              }
            }
            if(verificador.getValor()==Valor){
                  RecogeBloques.verdes--;
                  repetido = true;
            }
          }
        return repetido;   
    }

    public Nodo desencolar() {
        //elimina el primer nodo de la lista
        if(this.getCabeza()==null){
            System.out.println("la lista ya esta vacia");
        }
        Nodo retorno = null;
        if (this.getCabeza() != null) {
            retorno = this.getCabeza();
            if (this.getCabeza().getSiguiente() != null) {
                this.setCabeza(retorno.getSiguiente());
            } else {
                this.setCabeza(null);
            }
        }

        return retorno;
    }

    public void imprimir_lista() {
        System.out.println("COLA");
        if (this.getCabeza() == null) {
            System.out.println("cola vacia");
        } else {
            Nodo auxiliar;
            for (auxiliar = this.getCabeza(); auxiliar.getSiguiente() != null; auxiliar = auxiliar.getSiguiente()) {
                    System.out.println(auxiliar.getValor() + " " + auxiliar.getColor() + " " + auxiliar.getID());
            }           
                         System.out.println(auxiliar.getValor() + " " + auxiliar.getColor() + " " + auxiliar.getID());
        }
    }

    /**
     * @return the cabeza
     */
    public Nodo getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
}
