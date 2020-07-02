package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto2.RecogeBloques;

/**
 *
 * @author STEVE GONZÁLEZ
 */
public class hilo_temporal implements Runnable {

    @Override
    public void run() {
        while (true) {
            RecogeBloques.lista_rojos.choque(RecogeBloques.jugador);
            RecogeBloques.lista_azules.choque(RecogeBloques.jugador);
            RecogeBloques.lista_amarillos.choque(RecogeBloques.jugador);
            RecogeBloques.lista_verdes.choque(RecogeBloques.jugador);
        }
    }

}
