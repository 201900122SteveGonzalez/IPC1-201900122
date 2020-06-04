/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201900122_vj2020;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Menu {
    int opcionMP;
    public void Menuprincipal(){
         String palabra;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
            System.out.println("############## MENU PRINCIPAL ##############");
            System.out.println("## 1) CREAR TABLERO ##");
            System.out.println("## 2) REPORTE COMPLETO ##");
            System.out.println("## 3) REPORTE VICTORIAS ##");
            System.out.println("## 4) SALIR ##");    
            System.out.print("escriba el n[umero de opcion a la que desea ingresar: \n");
            palabra = teclado.nextLine();
            switch (opcionMP){
                case 1:
                    CREAR_TABLERO ();
                    break;
                case 2:
                    REPORTE_COMPLETO();
                    break;
                case 3:
                    REPORTE_VICTORIAS();
                    break;
                case 4:
                    System.exit(0);
                    break; // recursividad, se llama al metodo para que se ejecute otra vez, lo regresa al menu anterior               
                default : System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 7");

            }
        }

    private void CREAR_TABLERO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void REPORTE_COMPLETO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void REPORTE_VICTORIAS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    }

