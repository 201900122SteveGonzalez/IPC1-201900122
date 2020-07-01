/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto2.RecogeBloques;

/**
 *
 * @author USUARIO
 */
public class hilo_temporal implements Runnable  {

    @Override
    public void run() {
          while (true) {
//              if(RecogeBloques.lista_rojos.choque(RecogeBloques.jugador)==true){
//                  System.out.println("choque con rojo");
//                  break;
//              }
//            
//            if(RecogeBloques.lista_azules.choque(RecogeBloques.jugador)==true){
//                System.out.println("choque con azul");
//                break;
//          }
//            if( RecogeBloques.lista_amarillos.choque(RecogeBloques.jugador)==true){
//                System.out.println("choque con amarillo");
//                break;
//            }
//           if( RecogeBloques.lista_verdes.choque(RecogeBloques.jugador)==true){
//               System.out.println("choque con verde");
//               break;
//           }
                RecogeBloques.lista_rojos.choque(RecogeBloques.jugador);
                RecogeBloques.lista_azules.choque(RecogeBloques.jugador);
                RecogeBloques.lista_amarillos.choque(RecogeBloques.jugador);
                RecogeBloques.lista_verdes.choque(RecogeBloques.jugador);
//              try {
//                  Thread.sleep(200);
//              } catch (InterruptedException ex) {
//                  Logger.getLogger(hilo_temporal.class.getName()).log(Level.SEVERE, null, ex);
//              }
  }
    }
    
}
