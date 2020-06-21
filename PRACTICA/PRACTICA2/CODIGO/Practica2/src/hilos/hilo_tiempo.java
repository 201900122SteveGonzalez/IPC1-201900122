/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class hilo_tiempo implements Runnable  {
public int tiempo_inicial;
public int contador_vidas;
JTextField text;
public boolean ciclo;

    public hilo_tiempo(int tiempo_inicial, JTextField text, int contador_vidas) {
        this.tiempo_inicial = tiempo_inicial;
        this.text = text;
        this.contador_vidas = contador_vidas;
        this.ciclo=true;
    }
        
    @Override
    public void run() {
         
        while (this.ciclo=true) {
                    if(this.tiempo_inicial>0 && this.contador_vidas>0){
                        this.tiempo_inicial--;
                        this.text.setText(String.valueOf(this.tiempo_inicial));
                    }
                    else {
                        ciclo = false;
                       JOptionPane.showMessageDialog(null, "★★★GAME OVER★★★");
                        break; 
                    }
            try {
                //tiempo de creacion
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
   }
    
}
