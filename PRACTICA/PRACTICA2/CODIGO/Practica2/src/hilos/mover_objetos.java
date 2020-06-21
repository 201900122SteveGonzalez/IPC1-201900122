/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;


import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class mover_objetos implements Runnable {
    JButton objeto;
    int tiempo;
    public boolean condicion;

    public mover_objetos(JButton objeto, int tiempo) {
        this.objeto = objeto;
        this.tiempo = tiempo;
        this.condicion=true;
    }
    
    @Override
    public void run() {
        while(this.condicion=true){
            objeto.setBounds(objeto.getX(), objeto.getY()+64, objeto.getWidth(), objeto.getHeight());
                if(objeto.getY()>=468){
                    objeto.setVisible(false);
                }
            try {
                Thread.sleep(2000+300*tiempo);
            } catch (InterruptedException ex) {
            Logger.getLogger(mover_objetos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
