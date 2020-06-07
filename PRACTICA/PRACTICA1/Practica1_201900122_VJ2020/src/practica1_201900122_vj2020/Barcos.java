
package practica1_201900122_vj2020;

public class Barcos {
public int fila_inicio;
public int fila_fin;
public int columna_inicio;
public int columna_fin;
public int fila;
public int columna;
Tablero tablero = new Tablero();
//Menu menu = new Menu();
    
     public void Obtener_coordenadas(String ubicacion){
         if(ubicacion.length() == 11){
         int posicion = 0;
         for(int i = 0; i<11; i++){
         posicion = posicion + ubicacion.charAt(i);
         if(posicion==1){
             this.fila_inicio =  ubicacion.charAt(1);
         }
         if(posicion==3){
             this.columna_inicio =  ubicacion.charAt(3);
         }
         if(posicion==7){
             this.fila_fin =  ubicacion.charAt(7);
         }
         if(posicion==9){
             this.columna_fin =  ubicacion.charAt(9);
         }
         }
         }
     }
     
      public void Obtener_coordenadas_simples(String ubicacion){
         if(ubicacion.length() == 5){
         int posicion = 0;
         for(int i = 0; i<5; i++){
         posicion = posicion + ubicacion.charAt(i);
         if(posicion==1){
             this.fila =  ubicacion.charAt(1);
         }
         if(posicion==3){
             this.columna =  ubicacion.charAt(3);
         }       
         }
         }
     }
     
     public void Portaaviones( ){
         if(this.fila_fin - this.fila_inicio == 0 && this.columna_fin - this.columna_inicio == 3){
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio);
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio+1);
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio+2);
             tablero.Insertar_barco(this.fila_fin, this.columna_fin);
         }
         if(this.fila_fin - this.fila_inicio == 3 && this.columna_fin - this.columna_inicio == 0){
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio);
             tablero.Insertar_barco(this.fila_inicio+1, this.columna_inicio);
             tablero.Insertar_barco(this.fila_inicio+2, this.columna_inicio);
             tablero.Insertar_barco(this.fila_fin, this.columna_fin);
         }
         if(this.fila_inicio<0 || this.fila_fin>9 || this.columna_inicio<0 || this.columna_fin>9){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
         }
         }
     
    public void Submarino(){
         if(this.fila_fin - this.fila_inicio == 0 && this.columna_fin - this.columna_inicio == 2){
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio);
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio+1);
             tablero.Insertar_barco(this.fila_fin, this.columna_fin);
         }
         if(this.fila_fin - this.fila_inicio == 2 && this.columna_fin - this.columna_inicio == 0){
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio);
             tablero.Insertar_barco(this.fila_inicio+1, this.columna_inicio);
             tablero.Insertar_barco(this.fila_fin, this.columna_fin);
         }  
        if(this.fila_inicio<0 || this.fila_fin>9 || this.columna_inicio<0 || this.columna_fin>9){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
         }
     }
    
     public void Destructores(){
          if(this.fila_fin - this.fila_inicio == 0 && this.columna_fin - this.columna_inicio == 1){
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio);
             tablero.Insertar_barco(this.fila_fin, this.columna_fin);
         }
         if(this.fila_fin - this.fila_inicio == 1 && this.columna_fin - this.columna_inicio == 0){
             tablero.Insertar_barco(this.fila_inicio, this.columna_inicio);
             tablero.Insertar_barco(this.fila_fin, this.columna_fin);
         }
         if(this.fila_inicio<0 || this.fila_fin>9 || this.columna_inicio<0 || this.columna_fin>9){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
         }
     }
     
     public void Fragatas(){
         tablero.Insertar_barco(this.fila, this.columna);
         if(this.fila<0 || this.fila>9 || this.columna<0 || this.columna>9){
             System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
         }  
     }

}
