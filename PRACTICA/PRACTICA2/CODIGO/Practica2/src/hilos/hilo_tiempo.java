package hilos;
import estructuras.Nodo;
import estructuras.lista_objetos;
import static java.awt.Color.BLUE;
import java.awt.geom.Area;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import practica2.GALAGA;
import practica2.Interfaz_grafica;

public class hilo_tiempo implements Runnable {
    public boolean ciclo;

    public hilo_tiempo() {
        this.ciclo = true;
    }

    @Override
    public void run() {

        while (this.ciclo = true) {
            if (GALAGA.tiempo > 0 && GALAGA.contador_vidas > 0) {
                    GALAGA.tiempo--;
                    GALAGA.tiempo_restante.setText(String.valueOf(GALAGA.tiempo));           
            }  
           // if(GALAGA.galaga.getBackground()==BLUE){
            if(GALAGA.lista_asteroide1.choque(GALAGA.nave)){//nave con asteroide
                     GALAGA.contador_vidas--;
                     GALAGA.vidas.setText(String.valueOf(GALAGA.contador_vidas));
                   //  break;
          //  }  
        }
//            if(GALAGA.lista_vidas1.choque(GALAGA.nave)){//nave con corazon
//                     GALAGA.contador_vidas++;
//                     if(GALAGA.contador_vidas>=3){
//                     GALAGA.contador_vidas=3;
//                     }
//                     GALAGA.vidas.setText(String.valueOf(GALAGA.contador_vidas));
//                   //  break;     
//                   }   
             if(GALAGA.lista_caracoles.choque(GALAGA.nave)){//nave con corazon
                     GALAGA.rapidez--;
                     if(GALAGA.rapidez<1){
                     GALAGA.rapidez=1;
                     }
                     GALAGA.velocidad.setText(String.valueOf(GALAGA.rapidez));
                   }
               if(GALAGA.lista_rayos.choque(GALAGA.nave)){//nave con corazon
                    GALAGA.rapidez++;
                     if(GALAGA.rapidez>5){
                     GALAGA.rapidez=5;
                     }
                     GALAGA.velocidad.setText(String.valueOf(GALAGA.rapidez));
                   }
                if(GALAGA.lista_invisibles.choque(GALAGA.nave)){//nave con corazon
                     GALAGA.contador_ojos++;
                      GALAGA.poder.setText(String.valueOf(GALAGA.contador_ojos));
                   }
              
             
            if (GALAGA.tiempo <= 0 || GALAGA.contador_vidas <= 0) {
                ciclo = false;
                JOptionPane.showMessageDialog(null, "★★★GAME OVER★★★\n jugador: "+GALAGA.nickname.getText()+"\n puntuacion obtenida: "+GALAGA.punteo.getText());
                
                Interfaz_grafica regreso = new Interfaz_grafica();
                regreso.Menu_principal.setVisible(true);
                regreso.Menu_principal.repaint();
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
