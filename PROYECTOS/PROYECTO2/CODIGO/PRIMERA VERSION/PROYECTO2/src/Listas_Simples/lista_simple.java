package Listas_Simples;

import java.awt.Color;
import javax.swing.JButton;
import proyecto2.RecogeBloques;

/**
 *
 * @author Steve González
 */
public class lista_simple {
    private Nodo primero;

    public void insertar(int Fila, int Columna, int Valor, Color color) {
        Nodo auxiliar = new Nodo(Fila, Columna, Valor, color);
        if (getPrimero() == null) {
            this.setPrimero(auxiliar);
        } else {
            Nodo actual;
            for (actual = getPrimero(); actual.getSiguiente() != null; actual = actual.getSiguiente()) {
            }
            actual.setSiguiente(auxiliar);
        }
    }
    
    
    
    public void reinicio(){  
        if(this.getPrimero()==null){
            System.out.println("la lista ya se vacio");
        }else{
            this.getPrimero().setSiguiente(null);
            this.setPrimero(null);
        }
    }
    
        public void imprimir_lista() {
        Nodo auxiliar;
        if(this.getPrimero()==null){
            System.out.println("lista vacia");
        }else{
        for (auxiliar = getPrimero(); auxiliar.getSiguiente() != null; auxiliar = auxiliar.getSiguiente()) {
            System.out.println(auxiliar.getFila() + " " + auxiliar.getColumna() + " " + auxiliar.getValor() + " " + auxiliar.getColor());
        }
            System.out.println(auxiliar.getFila() + " " + auxiliar.getColumna() + " " + auxiliar.getValor() + " " + auxiliar.getColor());
        }
    }
        
        public void llenar_tablero(){
         Nodo auxiliar;
        if(this.getPrimero()==null){
            System.out.println("losta vacia");
        }else{
        for (auxiliar = getPrimero(); auxiliar.getSiguiente() != null; auxiliar = auxiliar.getSiguiente()) {
           JButton boton = CrearBoton(auxiliar.getColumna(), auxiliar.getFila(), auxiliar.getValor(), auxiliar.getColor());
          int tono = 0;
          if(auxiliar.getColor()==Color.RED){
              tono=1;
          }
          if(auxiliar.getColor()==Color.BLUE){
              tono=2;
          }
          if(auxiliar.getColor()==Color.YELLOW){
              tono=3;
          }
          if(auxiliar.getColor()==Color.GREEN){
              tono=4;
          }
           switch(tono){
               case 1:
                   RecogeBloques.lista_rojos.agregar(boton);
                   break;
               case 2:
                   RecogeBloques.lista_azules.agregar(boton);
                   break;
               case 3:
                   RecogeBloques.lista_amarillos.agregar(boton);
                   break;
               case 4:
                   RecogeBloques.lista_verdes.agregar(boton);
                   break;
            }
           RecogeBloques.MENU.add(boton);
            
        }
            JButton boton = CrearBoton(auxiliar.getColumna(), auxiliar.getFila(), auxiliar.getValor(), auxiliar.getColor());
          int tono = 0;
          if(auxiliar.getColor()==Color.RED){
              tono=1;
          }
          if(auxiliar.getColor()==Color.BLUE){
              tono=2;
          }
          if(auxiliar.getColor()==Color.YELLOW){
              tono=3;
          }
          if(auxiliar.getColor()==Color.GREEN){
              tono=4;
          }
           switch(tono){
               case 1:
                   RecogeBloques.lista_rojos.agregar(boton);
                   break;
               case 2:
                   RecogeBloques.lista_azules.agregar(boton);
                   break;
               case 3:
                   RecogeBloques.lista_amarillos.agregar(boton);
                   break;
               case 4:
                   RecogeBloques.lista_verdes.agregar(boton);
                   break;
            }
            RecogeBloques.MENU.add(boton);
        }
        }
        
        private JButton CrearBoton(int fila, int columna,int valor,  Color color) {
        JButton boton = new JButton();
        boton.setBounds(20+(fila*75), 100+(columna*75), 75, 75);
        boton.setBackground(color);
        boton.setText(String.valueOf(valor));
        return boton;
    }
        
        

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
