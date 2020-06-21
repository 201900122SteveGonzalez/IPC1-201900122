package practica2;

import hilos.hilo_misil;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class navegacion{
 JButton nave;
 JTextField poder;
JPanel fondo;
    public navegacion(JButton nave, JTextField poder, JPanel fondo) {
        this.nave = nave;
        this.poder = poder;
        this.fondo = fondo;
    }

    public void acciones() {
//             nave.addKeyListener(new KeyListener() {
//                 @Override
//                 public void keyTyped(KeyEvent ke) {
//                     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                 }
//
//                 @Override
//                 public void keyPressed(KeyEvent ke) {
//                     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                 }
//
//                 @Override
//                 public void keyReleased(KeyEvent ke) {
//                     switch(ke.getKeyCode()){
//                         case 37://izquierda
//                             if(nave.getX()>=20){
//                                 nave.setBounds(nave.getX()-64, nave.getY(), nave.getWidth(), nave.getHeight());
//                             }
//                             break;
//                            case 39://derecha
//                             if(nave.getX()<=276){             
//                                 nave.setBounds(nave.getX()+64, nave.getY(), nave.getWidth(), nave.getHeight());
//                             }
//                             break;
//                             case 40://abajo
//                             int contador = Integer.parseInt(poder.getText());
//                             if(contador>0){
//                             //hilo de hacerse invisible durante 6 segundos
//                             nave.setBackground(Color.BLACK);
//                             }
//                             break;
//                             case 32://derecha
//                                int x = nave.getX();
//                                int y = nave.getY();
//                                JButton misil = new JButton();
//                                misil.setBounds(x, y, 64, 64);
//                                misil.setBackground(Color.ORANGE);
//                                fondo.add(misil);
//                                hilo_misil destructor = new hilo_misil(misil);
//                                Thread genear_misil = new Thread(destructor);
//                                genear_misil.start();
//                                //crear misil en esa posicion
//                                //hilo para mover misil hacia arriba
//                             break;
//                     }
//                 }
//             });
         }
    }
 

