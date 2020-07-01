package Listas_Simples;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import proyecto2.RecogeBloques;

/**
 *
 * @author Steve González
 */
public class lista_simple {
    private Nodo primero;
    private int encontrados =0;
    private int primerID [] = new int[100];
    
    
     public void generar_listas(JTextArea text){
        text.setText("");
        if(this.getPrimero()==null){
            text.setText("LISA VACIA");
        }else{
         String encabezado = "digraph G { \n";
         String cierre = "}";
                    String auxiliar="";
          Nodo actual =this.getPrimero();
          while(actual.getSiguiente() != null){
              auxiliar = auxiliar+((actual.getID() + " [label  = \"" + actual.getValor() +","+actual.getColor() + "\"];\n"));
              auxiliar = auxiliar+((actual.getID()  + "->" + actual.getSiguiente().getID() + "\n"));
              actual = actual.getSiguiente();
          }
               auxiliar = auxiliar+((actual.getID() + " [label  = \"" + actual.getValor() +","+actual.getColor() + "\"];\n"));
           String codigo = encabezado+auxiliar+cierre;
        text.setText(codigo);
        }
    }
    
//    public void eliminar(int valor, String color){
//        boolean existe = existe(valor, color);
//        if (existe==true){
//            if(this.getPrimero().getValor()==valor && this.getPrimero().getColor().equalsIgnoreCase(color)){
//              this.setPrimero(this.getPrimero().getSiguiente());
//            }
//             else  {   
//             Nodo actual = this.getPrimero();
//            while(actual.getSiguiente()!=null){     
//             if (actual.getSiguiente().getValor() == valor && actual.getSiguiente().getColor().equalsIgnoreCase(color)) {
//                 if(actual.getSiguiente().getSiguiente()==null){
//                     actual.setSiguiente(null);
//                     break;
//                 }else{
//               actual.setSiguiente(actual.getSiguiente().getSiguiente());
//                 break;
//                 }
//             }
//                actual = actual.getSiguiente(); 
//           }
//            }
//        }
//    }

      public void eliminar(int valor, String color){
        boolean existe = existe(valor, color);
        if (existe==true){
            if(this.getPrimero().getValor()==valor && this.getPrimero().getColor().equalsIgnoreCase(color) && this.getPrimero().getID()==primerID[0]){
              this.setPrimero(this.getPrimero().getSiguiente());
            }
             else  {   
             Nodo actual = this.getPrimero();
            while(actual.getSiguiente()!=null){     
             if (actual.getSiguiente().getValor() == valor && actual.getSiguiente().getColor().equalsIgnoreCase(color) && actual.getSiguiente().getID()==primerID[0]) {
                 if(actual.getSiguiente().getSiguiente()==null){
                     actual.setSiguiente(null);
                     break;
                 }else{
               actual.setSiguiente(actual.getSiguiente().getSiguiente());
                 break;
                 }
             }
                actual = actual.getSiguiente(); 
           }
            }
            encontrados = 0;
        }
    }
    
    public void insertar2(int Valor, String color, int ID) {
        Nodo auxiliar = new Nodo(Valor, color , ID);
        if (getPrimero() == null) {
            this.setPrimero(auxiliar);
        } else {
            Nodo actual;
            for (actual = getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
        }
    }
    
    
    
    public void insertar(int Valor, Color color, int ID) {
        boolean verificacion = existe(Valor);
     if(verificacion==false){
        String tempera = null;
        int tono = 0;
          if(color==Color.RED){
              tono=1;
          }
          if(color==Color.BLUE){
              tono=2;
          }
          if(color==Color.YELLOW){
              tono=3;
          }
          if(color==Color.GREEN){
              tono=4;
          }
        switch(tono){
            case 1:
             tempera = "ROJO";
             break;
             case 2:
             tempera = "AZUL";
             break;
            case 3:
             tempera = "AMARILLO";
             break;
             case 4:
             tempera = "VERDE";
             break;
        }
        Nodo auxiliar = new Nodo(Valor, tempera, ID);
        if (getPrimero() == null) {
            this.setPrimero(auxiliar);
        } else {
            Nodo actual;
            for (actual = getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
        }
     }
    }
    
      public boolean existe(int Valor, String color){
        boolean repetido = false;
             Nodo verificador;
          if(this.getPrimero()!=null){
            for (verificador = this.getPrimero(); verificador.getSiguiente() != null; verificador = verificador.getSiguiente()) {
              if(verificador.getValor()==Valor && verificador.getColor().equalsIgnoreCase(color)){
                  repetido = true;
                  primerID[encontrados]=verificador.getID();
                  encontrados++;
              }
            }
            if(verificador.getValor()==Valor && verificador.getColor().equalsIgnoreCase(color)){
                  repetido = true;
                  primerID[encontrados]=verificador.getID();
                  encontrados++;
            }
          }
        return repetido;   
    }
      
         public boolean existe(int Valor){
        boolean repetido = false;
             Nodo verificador;
          if(this.getPrimero()!=null){
            for (verificador = this.getPrimero(); verificador.getSiguiente() != null; verificador = verificador.getSiguiente()) {
              if(verificador.getValor()==Valor){
                  repetido = true;
              }
            }
            if(verificador.getValor()==Valor){
                  repetido = true;
            }
          }
        return repetido;   
    }
    
    
    public void reinicio(){  
         RecogeBloques.contador_botones=0;
        if(this.getPrimero()==null){
            System.out.println("la lista ya se vacio");
        }else{
            this.getPrimero().setSiguiente(null);
            this.setPrimero(null);
        }
       
    }
    
        public void imprimir_lista() {
            System.out.println("LISTA SIMPLE");
        Nodo auxiliar;
        if(this.getPrimero()==null){
            System.out.println("lista vacia");
        }else{
        for (auxiliar = getPrimero(); auxiliar.getSiguiente() != null; auxiliar = auxiliar.getSiguiente()) {
            System.out.println(auxiliar.getValor() + " " + auxiliar.getColor());
        }
            System.out.println(auxiliar.getValor() + " " + auxiliar.getColor());
        }
    }
        
//        public void llenar_tablero(){
//         Nodo auxiliar;
//        if(this.getPrimero()==null){
//            System.out.println("lista vacia");
//        }else{
//        for (auxiliar = getPrimero(); auxiliar.getSiguiente() != null; auxiliar = auxiliar.getSiguiente()) {
//          JButton boton = CrearBoton(auxiliar.getColumna(), auxiliar.getFila(), auxiliar.getValor(), auxiliar.getColor());
//          int tono = 0;
//          if(auxiliar.getColor()==Color.RED){
//              tono=1;
//          }
//          if(auxiliar.getColor()==Color.BLUE){
//              tono=2;
//          }
//          if(auxiliar.getColor()==Color.YELLOW){
//              tono=3;
//          }
//          if(auxiliar.getColor()==Color.GREEN){
//              tono=4;
//          }
//           switch(tono){
//               case 1:
//                   RecogeBloques.lista_rojos.agregar(boton);
//                   break;
//               case 2:
//                   RecogeBloques.lista_azules.agregar(boton);
//                   break;
//               case 3:
//                   RecogeBloques.lista_amarillos.agregar(boton);
//                   break;
//               case 4:
//                   RecogeBloques.lista_verdes.agregar(boton);
//                   break;
//            }
//           RecogeBloques.MENU.add(boton);
//            
//        }
//     JButton boton = CrearBoton(auxiliar.getColumna(), auxiliar.getFila(), auxiliar.getValor(), auxiliar.getColor());
//          int tono = 0;
//          if(auxiliar.getColor()==Color.RED){
//              tono=1;
//          }
//          if(auxiliar.getColor()==Color.BLUE){
//              tono=2;
//          }
//          if(auxiliar.getColor()==Color.YELLOW){
//              tono=3;
//          }
//          if(auxiliar.getColor()==Color.GREEN){
//              tono=4;
//          }
//           switch(tono){
//               case 1:
//                   RecogeBloques.lista_rojos.agregar(boton);
//                   break;
//               case 2:
//                   RecogeBloques.lista_azules.agregar(boton);
//                   break;
//               case 3:
//                   RecogeBloques.lista_amarillos.agregar(boton);
//                   break;
//               case 4:
//                   RecogeBloques.lista_verdes.agregar(boton);
//                   break;
//            }
//            RecogeBloques.MENU.add(boton);
//        }
//        }
//        
//        private JButton CrearBoton(int fila, int columna,int valor,  Color color) {
//        JButton boton = new JButton();
//        boton.setBounds(20+(fila*75), 100+(columna*75), 75, 75);
//        boton.setBackground(color);
//        boton.setText(String.valueOf(valor));
//        return boton;
//    }
//        
        

//    public void eliminar(String Nombre, String Apellido, int Edad) {
//        if (this.getPrimero() == null) {
//            System.out.println("no hay nada para eliminar. LISTA VACIA");
//    }else
//      {
//          Nodo actual = this.getPrimero();
//       if(this.getPrimero().getNombre().equals(Nombre) && this.getPrimero().getApellido().equals(Apellido) && this.getPrimero().getEdad()==Edad){
//              this.setPrimero(this.getPrimero().getSiguiente());
//            }
//       else
//         {        
//            while(actual.getSiguiente()!=null){     
//             if (actual.getSiguiente().getNombre().equals(Nombre) && actual.getSiguiente().getApellido().equals(Apellido) && actual.getSiguiente().getEdad() == Edad) {
//               actual.setSiguiente(actual.getSiguiente().getSiguiente());
//               break;
//             }
//             actual = actual.getSiguiente();
//           }
//        }      
//      }
//    }
    
    



    /**
     * @return the primero
     */
    public Nodo getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
}
