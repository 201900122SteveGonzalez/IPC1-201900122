/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201900122_vj2020;
import java.util.Scanner;
/**
 *
 * @author Steve Gonzalez
 */
public class Menu {
Scanner teclado = new Scanner(System.in);
Barcos barco = new Barcos();
public  boolean salir;
public  boolean salir2;
public  boolean salir3;
public String coordenadas;
Tablero tablero = new Tablero();
    public void MENU_PRINCIPAL(){
    int opcion;  
        do{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("############## MENU PRINCIPAL ##############");
            System.out.println("## 1) CREAR TABLERO ##");
            System.out.println("## 2) REPORTE COMPLETO ##");
            System.out.println("## 3) REPORTE VICTORIAS ##");
            System.out.println("## 4) SALIR ##");    
            System.out.print("escriba el numero de opcion a la que desea ingresar: \n");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    MENU_TABLERO();
                    break;
                case 2:
                    REPORTE_COMPLETO();
                    break;
                case 3:
                    REPORTE_VICTORIAS();
                    break;
                case 4:
                    salir = true;
                    System.exit(0);
                    break;            
                default : 
                    System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 4");
                    salir = false;
            }
        } while(salir==false);
        }
    
    public void REPORTE_COMPLETO() {
        // muestra listado de los usuarios y el estado de la partida. Si ganó, perdió o abandonó la partida.
    }
    public void REPORTE_VICTORIAS() {
    }
      // con ordenamiento de burbuja muestra el listado de los usuarios que ganaron
   // su partida, serán ordenados de menor a mayor según la cantidad de intentos que
    // necesitaron para ganar la partida.
    public void MENU_TABLERO() {
        //el tablero por defecto es de 10x10
        int opcion2;  
        do{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("############## MENU TABLERO ##############");
            System.out.println("## 1) INGRESAR BARCOS ##");
            System.out.println("## 2) CAMBIAR CANTIDAD DE INTENTOS ##");
            System.out.println("## 3) INICIAR JUEGO ##");
            System.out.println("## 4) VISUALIZAR EL TABLERO  ##");    
            System.out.println("## 5) REINICIAR TABLERO ##");    
            System.out.println("## 6) REGRESAR AL MENU PRINCIPAL ##");    
            System.out.print("escriba el numero de opcion a la que desea ingresar: \n");
            opcion2 = teclado.nextInt();
            switch (opcion2){
                case 1:
                    MENU_BARCOS();
                    break;
                case 2:
                    CAMBIAR_CANTIDAD_DE_INTENTOS();
                    break;
                case 3:
                    INICIAR_JUEGO();
                    break;
                case 4:
                    VISUALIZAR_EL_TABLERO();
                    break;            
                case 5:
                    REINICIAR_TABLERO();
                    break;   
                case 6:
                    MENU_PRINCIPAL();
                    break;   
                default : 
                    System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 6");
                    salir2 = false;
            }
        } while(salir2 == false);
    }
    
     public void CAMBIAR_CANTIDAD_DE_INTENTOS() {
    }
     
     public void INICIAR_JUEGO() {
    }
     
     public void VISUALIZAR_EL_TABLERO() {
         tablero.Imprimir_tablero();
    }
     
     public void REINICIAR_TABLERO(){
         tablero.Limpiar_tablero();
     }
    
     public void MENU_BARCOS() {
          int opcion3;  
        do{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("############## MENU BARCOS #############");
            System.out.println("## 1) INSERTAR PORTAAVIONES ##");
            System.out.println("## 2) INSERTAR SUBMARINOS ##");
            System.out.println("## 3) INSERTAR DESTRUCTORES ##");
            System.out.println("## 4) INSERTAR FRAGATAS ##");    
            System.out.println("## 5) INSERTAR EASTER EGG ##");    
            System.out.print("escriba el numero de opcion a la que desea ingresar: \n");
            opcion3 = teclado.nextInt();
            switch (opcion3){
                case 1:
                    INSERTAR_PORTAAVIONES();
                    break;
                case 2:
                    INSERTAR_SUBMARINOS();
                    break;
                case 3:
                    INSERTAR_DESTRUCTORES();
                    break;
                case 4:
                    INSERTAR_FRAGATAS();
                    break;            
                case 5:
                    INSERTAR_EASTER_EGG();
                    break;   
                default : 
                    System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 5");
                    salir3 = false;
            }
        } while(salir3 == false);
    }
     
     public void INSERTAR_PORTAAVIONES(){
         System.out.println("Ingrese las coordenadas del PORTAAVIONES con el siguiente formato: '(FilaInicio,ColumnaInicio)- (FilaFin,ColumnaFin)' ");
         coordenadas = teclado.nextLine();
         barco.Obtener_coordenadas(coordenadas);
         barco.Portaaviones();
         MENU_BARCOS();
         tablero.barcos_en_tablero();
         if (tablero.barcos_en_tablero()==21){
             tablero.Imprimir_tablero();
         }
     }
     public void INSERTAR_SUBMARINOS(){
         System.out.println("Ingrese las coordenadas de los 3 SUBMARINOS con el siguiente formato: '(FilaInicio,ColumnaInicio)- (FilaFin,ColumnaFin)' ");
         for (int i=1; i<5; i++){
         coordenadas = teclado.nextLine();
         barco.Obtener_coordenadas(coordenadas);
         barco.Submarino();
         if(i>=4){
             System.out.println("ERROR, ya ingreso 3 barcos");
             MENU_BARCOS();
         }
        tablero.barcos_en_tablero();
         if (tablero.barcos_en_tablero()==21){
             tablero.Imprimir_tablero();
         }
        }
     }
     public void  INSERTAR_DESTRUCTORES(){
         System.out.println("Ingrese las coordenadas de los 3 DESTRUCTORES con el siguiente formato: '(FilaInicio,ColumnaInicio)- (FilaFin,ColumnaFin)' ");
         for (int i=1; i<5; i++){
         coordenadas = teclado.nextLine();
         barco.Obtener_coordenadas(coordenadas);
         barco.Destructores();
         if(i>=4){
             System.out.println("ERROR, ya ingreso 3 barcos");
             MENU_BARCOS();
         }
         tablero.barcos_en_tablero();
         if (tablero.barcos_en_tablero()==21){
             tablero.Imprimir_tablero();
         }
        }
     }
     public void INSERTAR_FRAGATAS(){
          System.out.println("Ingrese las coordenadas de las 2 FRAGATAS con el siguiente formato: '(Fila,Columna)' ");
         for (int i=1; i<4; i++){
         coordenadas = teclado.nextLine();
         barco.Obtener_coordenadas_simples(coordenadas);
         barco.Fragatas();
         if(i>=3){
             System.out.println("ERROR, ya ingreso 2 barcos");
             MENU_BARCOS();
         }
         tablero.barcos_en_tablero();
         if (tablero.barcos_en_tablero()==21){
             tablero.Imprimir_tablero();
         }
        }
     }
     public void INSERTAR_EASTER_EGG(){
     }

    }

