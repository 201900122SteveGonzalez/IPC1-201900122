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
public class Tablero {
  public int contador_de_barcos;
  public String [][] tablero;
 // public int filas = 10;
 // public int columnas = 10;

    public Tablero() {
        this.tablero = new String [10][10];
    }
    
    public void Limpiar_tablero(){
     for(int filas = 0; filas<10; filas++){
       for(int columnas = 0; columnas<10; columnas++){
          this.tablero[filas][columnas] = " ";
          System.out.println(filas + "," + columnas +" = " + "vacia" );
       }
     }
    }
    
    public void Insertar_barco(int X, int Y){
        for(int filas = 0; filas<10; filas++){
       for(int columnas = 0; columnas<10; columnas++){
           if(filas==X && columnas==Y){  
          this.tablero[X][Y] = "O";
           }
       }
        }
    }
    
    public void Imprimir_tablero(){
     System.out.println("[ ] ->[0][1][2][3][4][5][6][7][8][9]");
     for(int num = 0; num<10; num++){ 
       for(int filas = 0; filas<10; filas++){ 
       for(int columnas = 0; columnas<10; columnas++){ 
          //       
           if (this.tablero[filas][columnas] ==null){
           this.tablero[filas][columnas] = " ";
           }
            if (filas==0 && columnas==0){
             num=0;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==1 && columnas==0){
             num=1;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==2 && columnas==0){
             num=2;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==3 && columnas==0){
             num=3;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==4 && columnas==0){
             num=4;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==5 && columnas==0){
             num=5;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==6 && columnas==0){
             num=6;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==7 && columnas==0){
             num=7;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==8 && columnas==0){
             num=8;
             System.out.print("[" + num + "] ->");
             }else
            if (filas==9 && columnas==0){
             num=9;
             System.out.print("[" + num + "] ->");
             }
             
           System.out.print("[" + this.tablero[filas][columnas] + "]");
           //"[" + num + "] ->" + 
          // 
        }
       System.out.println("");
      }   
           }
    }
    
    public int barcos_en_tablero(){
        for(int filas = 0; filas<10; filas++){ 
       for(int columnas = 0; columnas<10; columnas++){ 
           if("O".equals(this.tablero[filas][columnas])){
               contador_de_barcos = contador_de_barcos+1;
           }
       }
       }
      return contador_de_barcos;
    }
}
