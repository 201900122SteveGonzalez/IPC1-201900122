package Listas_Simples;

import java.awt.Color;
import javax.swing.JTextArea;
import proyecto2.RecogeBloques;

/**
 *
 * @author Steve Gónzalez
 */
public class Pila {
    private Nodo cabeza;

    public Pila() {
        this.cabeza = null;
    }
    
    public void generar_listas(JTextArea text){
        text.setText("");
        if(this.getCabeza()==null){
            text.setText("LISA VACIA");
        }else{
         String encabezado = "digraph G { \n";
         String tope = "0[label=\"TOPE\"] \n";
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
               String codigo = encabezado+tope+auxiliar+cierre;
        text.setText(codigo);
        }
    }
    
    public void reiniciar(){
        if(this.getCabeza()==null){
            System.out.println("ya se reinicio o esta vacia");
        }else{
        this.getCabeza().setSiguiente(null);
        this.setCabeza(null);
        RecogeBloques.amarillos = 0;
        }
    }
    
    public void push(int Valor, String color, int ID) {
        //la cabeza va a ser el siguiente del elemento que vamos a insertar
         boolean verificacion = existe(Valor);
     if(verificacion==false){
        Nodo nuevo = new Nodo(Valor, color, ID);
        if(this.getCabeza()==null){
            this.setCabeza(nuevo);
        }else{
            nuevo.setSiguiente(this.getCabeza());
            this.setCabeza(nuevo);
        }
     }
    }
    
    public Nodo pop(){
        //se eliminar el ultimo nodo que se inserto con el push    
        if(this.getCabeza()==null){
            System.out.println("lista vacia");
        }//else{
        Nodo retorno = this.getCabeza();
       // }
        this.setCabeza(this.getCabeza().getSiguiente());
        return retorno;
    }
    
      public boolean existe(int Valor){
        boolean repetido = false;
             Nodo verificador;
          if(this.getCabeza()!=null){
            for (verificador = this.getCabeza(); verificador.getSiguiente() != null; verificador = verificador.getSiguiente()) {
              if(verificador.getValor()==Valor){
                  RecogeBloques.amarillos--;
                  repetido = true;
              }
            }
            if(verificador.getValor()==Valor){
                  RecogeBloques.amarillos--;
                  repetido = true;
            }
          }
        return repetido;   
    }
    
   public void imprimir_lista() {
       System.out.println("PILA");
        if (this.getCabeza() == null) {
            System.out.println("pila vacia");
        } else {
            Nodo auxiliar = this.getCabeza();
            while(auxiliar.getSiguiente() != null ) {
                        System.out.println(auxiliar.getValor() + " " + auxiliar.getColor() + " " + auxiliar.getID());
            auxiliar = auxiliar.getSiguiente();
        }
             System.out.println(auxiliar.getValor() + " " + auxiliar.getColor() + " " + auxiliar.getID());
        }
    }

//      public void imprimir_lista() {
//       System.out.println("PILA");
//        if (this.getCabeza() == null) {
//            System.out.println("pila vacia");
//        } else {
//            Nodo auxiliar ;
//            for (auxiliar = this.getCabeza(); auxiliar.getSiguiente() != null; auxiliar = auxiliar.getSiguiente()) {
//                        System.out.println(auxiliar.getValor() + " " + auxiliar.getColor() + " " + auxiliar.getID());
//       }
//                    System.out.println(auxiliar.getValor() + " " + auxiliar.getColor() + " " + auxiliar.getID());
//        }
//    }
    

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
