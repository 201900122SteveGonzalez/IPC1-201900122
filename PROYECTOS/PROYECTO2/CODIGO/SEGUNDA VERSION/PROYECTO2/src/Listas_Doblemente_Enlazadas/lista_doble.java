/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas_Doblemente_Enlazadas;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import proyecto2.RecogeBloques;

/**
 *
 * @author USUARIO
 */
public class lista_doble {
    private NodoDoble primero;
    private int encontrados =0;
    private int primerID [] = new int[100];
    
    public lista_doble() {
        this.primero=null;
    }
    
    public void generar_listas(JTextArea text){
        text.setText("");
        if(this.getPrimero()==null){
            text.setText("LISA VACIA");
        }else{
         String encabezado = "digraph G { \n";
         String cierre = "}";
                    String auxiliar="";
          NodoDoble actual =this.getPrimero();
          while(actual.getSiguiente() != null){
              auxiliar = auxiliar+((actual.getID() + " [label  = \"" + actual.getValor() +","+actual.getColor() + "\"];\n"));
              auxiliar = auxiliar+((actual.getID()  + "->" + actual.getSiguiente().getID() + "\n"));
              auxiliar = auxiliar+(( actual.getSiguiente().getID() + "->" + actual.getID()   + "\n"));
              actual = actual.getSiguiente();
          }
               auxiliar = auxiliar+((actual.getID() + " [label  = \"" + actual.getValor() +","+actual.getColor() + "\"];\n"));
           String codigo = encabezado+auxiliar+cierre;
        text.setText(codigo);
        }
    }
    
    
    
    public void reiniciar(){
        if(this.getPrimero()==null){
            System.out.println("ya se vacio la lista");
        }else{
        this.getPrimero().setSiguiente(null);
        this.getPrimero().setAnterior(null);
        this.setPrimero(null);
        RecogeBloques.azules = 0;  
        }
    }
    
      public void insertar2(int Valor, String color, int ID) {
        NodoDoble auxiliar = new NodoDoble(Valor, color, ID);
        if (getPrimero() == null) {
            this.setPrimero(auxiliar);
            primero.setAnterior(null);
            primero.setSiguiente(null);
        } else {
            NodoDoble actual;
            for (actual = getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
            auxiliar.setAnterior(actual);
            auxiliar.setSiguiente(null);
        } 
    }
    
    public void insertar(int Valor, String color, int ID) {
         boolean verificacion = existe(Valor);
     if(verificacion==false){
        NodoDoble auxiliar = new NodoDoble(Valor, color, ID);
        if (getPrimero() == null) {
            this.setPrimero(auxiliar);
            primero.setAnterior(null);
            primero.setSiguiente(null);
        } else {
            NodoDoble actual;
            for (actual = getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
            auxiliar.setAnterior(actual);
            auxiliar.setSiguiente(null);
        }
     }
    }
    
      public void eliminar(int Valor){
          boolean existencia = existe2(Valor);
          if (existencia==true){
             NodoDoble verificador;
          if(this.getPrimero()!=null){
            for (verificador = this.getPrimero(); verificador.getSiguiente() != null; verificador = verificador.getSiguiente() ) {
              if(verificador.getSiguiente().getValor()==Valor && verificador.getSiguiente().getID()==primerID[0]){
                  if(verificador.getSiguiente().getSiguiente()==null){
                      verificador.getSiguiente().setAnterior(null);
                      verificador.setSiguiente(null);
                      break;
                  }else{
                   verificador.setSiguiente(verificador.getSiguiente().getSiguiente());
                   verificador.getSiguiente().setAnterior(verificador);
                  verificador.getSiguiente().setSiguiente(null);
                  verificador.getSiguiente().setAnterior(null);
                   break;
                   }
              }
            }
          if(this.getPrimero().getValor()==Valor && this.getPrimero().getID()==primerID[0]){
              // si solo queda la cabeza 1 elemento
               if(this.getPrimero().getSiguiente()==null && this.getPrimero().getAnterior()==null){
                   this.setPrimero(null);
               }else
             //si quedan dos o mas elementos
               if(this.getPrimero().getSiguiente()!=null){
                   this.setPrimero(this.getPrimero().getSiguiente());
                   this.getPrimero().setAnterior(null);
               }
                }
            }
          encontrados = 0;
          }
    }
      
       public boolean existe2(int Valor){
        boolean repetido = false;
             NodoDoble verificador;
          if(this.getPrimero()!=null){
            for (verificador = this.getPrimero(); verificador.getSiguiente() != null; verificador = verificador.getSiguiente()) {
              if(verificador.getValor()==Valor){
                  repetido = true;
                 primerID[encontrados]=verificador.getID();
                  encontrados++;
              }
            }
            if(verificador.getValor()==Valor){
                primerID[encontrados]=verificador.getID();
                 encontrados++;
                  repetido = true;
            }
          }
        return repetido;   
    }
    
     public boolean existe(int Valor){
        boolean repetido = false;
             NodoDoble verificador;
          if(this.getPrimero()!=null){
            for (verificador = this.getPrimero(); verificador.getSiguiente() != null; verificador = verificador.getSiguiente()) {
              if(verificador.getValor()==Valor){
                 RecogeBloques.azules--;
                  repetido = true;
               //  primerID[encontrados]=verificador.getID();
                //  encontrados++;
              }
            }
            if(verificador.getValor()==Valor){
                RecogeBloques.azules--;
              //  primerID[encontrados]=verificador.getID();
                // encontrados++;
                  repetido = true;
            }
          }
        return repetido;   
    }
    
    public void imprimir(){
        System.out.println("LISTA DOBLE");
        if(this.getPrimero()==null){
            System.out.println("lista vacia");
        }else{
            NodoDoble actual = this.getPrimero();
            while(actual.getSiguiente()!=null){
           System.out.println(actual.getValor()+" "+actual.getColor()+" "+actual.getID());
           actual = actual.getSiguiente();
            }
         System.out.println(actual.getValor()+" "+actual.getColor()+" "+actual.getID());
        }
    }

    /**
     * @return the primero
     */
    public NodoDoble getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoDoble primero) {
        this.primero = primero;
    }



}
