package hilos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import practica2.GALAGA;

public class mover_objetos implements Runnable {
    JButton objeto;

    public mover_objetos(JButton objeto) {
        this.objeto = objeto;
    }
    
    @Override
    public void run() {
        while(GALAGA.tiempo > 0 && GALAGA.contador_vidas > 0){
            objeto.setBounds(objeto.getX(), objeto.getY()+64, objeto.getWidth(), objeto.getHeight());
                if(objeto.getY()>=468){
                    objeto.setVisible(false);
                }
            try {
            //    int valor = Integer.parseInt(GALAGA.velocidad.getText());
                Thread.sleep(2800-(400*GALAGA.rapidez));
            } catch (InterruptedException ex) {
            Logger.getLogger(mover_objetos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
