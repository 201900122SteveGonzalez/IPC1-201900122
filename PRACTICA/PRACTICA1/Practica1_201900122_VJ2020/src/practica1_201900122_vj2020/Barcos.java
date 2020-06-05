/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201900122_vj2020;

/**
 *
 * @author USUARIO
 */
public class Barcos {
public int fila_inicio;
public int fila_fin;
public int columna_inicio;
public int columna_fin;
public int fila;
public int columna;
Tablero tablero = new Tablero();
Menu menu = new Menu();
    public Barcos() {
    }
    
     public void Obtener_coordenadas(String ubicacion){
         String[] posicion = ubicacion.split("\\(\\,\\)\\-");
         this.fila_inicio = Integer.parseInt(posicion[0]);
         this.columna_inicio = Integer.parseInt(posicion[1]);
         this.fila_fin = Integer.parseInt(posicion[3]);
         this.columna_fin = Integer.parseInt(posicion[4]);
     }
     
      public void Obtener_coordenadas_simples(String ubicacion){
         String[] posicion = ubicacion.split("\\(\\,\\)");
         this.fila = Integer.parseInt(posicion[0]);
         this.columna = Integer.parseInt(posicion[1]);
     }
     
     public void Portaaviones( ){
         if(fila_fin - fila_inicio == 3 || columna_fin - columna_inicio == 3){
             tablero.Insertar_barco(fila_inicio, columna_inicio);
             tablero.Insertar_barco(fila_inicio+1, columna_inicio+1);
             tablero.Insertar_barco(fila_inicio+2, columna_inicio+2);
             tablero.Insertar_barco(fila_fin, columna_fin);
         }else
         if(fila_inicio == fila_fin || columna_inicio == columna_fin){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tipo de barco.");
             menu.INSERTAR_PORTAAVIONES();
         }  if(fila_inicio<0 || fila_fin>9 || columna_inicio<0 || columna_fin>9){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
             menu.INSERTAR_PORTAAVIONES();
         }else{
           System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tipo de barco");  
            menu.INSERTAR_PORTAAVIONES();
         }  
         }
     
     public void Submarino(){
         if(fila_fin - fila_inicio == 2 || columna_fin - columna_inicio == 2){
             tablero.Insertar_barco(fila_inicio, columna_inicio);
             tablero.Insertar_barco(fila_inicio+1, columna_inicio+1);
             tablero.Insertar_barco(fila_fin, columna_fin);
         }else
         if(fila_inicio == fila_fin || columna_inicio == columna_fin){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tipo de barco.");
             menu.INSERTAR_SUBMARINOS();
         }  if(fila_inicio<0 || fila_fin>9 || columna_inicio<0 || columna_fin>9){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
             menu.INSERTAR_SUBMARINOS();
         }else{
           System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tipo de barco");  
            menu.INSERTAR_SUBMARINOS();
         }  
     }
     public void Destructores(){
            if(fila_fin - fila_inicio == 1 || columna_fin - columna_inicio == 1){
             tablero.Insertar_barco(fila_inicio, columna_inicio);
             tablero.Insertar_barco(fila_fin, columna_fin);
         }else
         if(fila_inicio == fila_fin || columna_inicio == columna_fin){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tipo de barco.");
             menu.INSERTAR_DESTRUCTORES();
         }  if(fila_inicio<0 || fila_fin>9 || columna_inicio<0 || columna_fin>9){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
             menu.INSERTAR_DESTRUCTORES();
         }else{
           System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tipo de barco");  
            menu.INSERTAR_DESTRUCTORES();
         }  
     }
     public void Fragatas(){
         tablero.Insertar_barco(fila, columna);
         if(fila<0 || fila>9 || columna<0 || columna>9){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
             menu.INSERTAR_FRAGATAS();
         }  
     }
}
