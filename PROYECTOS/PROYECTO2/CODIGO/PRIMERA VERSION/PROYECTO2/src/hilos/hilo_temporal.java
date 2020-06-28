/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import proyecto2.RecogeBloques;

/**
 *
 * @author USUARIO
 */
public class hilo_temporal implements Runnable  {

    @Override
    public void run() {
          while (true) {
          if(RecogeBloques.lista_rojos.choque(RecogeBloques.jugador)){
              System.out.println("almacenado en lista CIRCULAR DOBLE");
          }
  }
    }
    
}
