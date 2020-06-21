package practica2;
import hilos.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GALAGA {
FondoPanel fondo;
JFrame galaga;
JButton game;
int posicion_nave;
int tiempo;//tiempo de reloj
int rapidez;// para el tiempo de los objetos en caer
JTextField nickname;
JTextField poder;
JTextField vidas;
int contador_vidas;
JTextField velocidad;
JTextField punteo;
JTextField tiempo_restante;
JButton nave;
private int clicks;

    public GALAGA() {
        JButton titulo = new JButton("★★★★★★★★ BIENVENIDO A GALAGA ★★★★★★★★");
        titulo.setBounds(20, 20, 425, 50);
        titulo.setForeground(Color.WHITE);
        titulo.setBackground(Color.BLACK);
        titulo.enable(false);
        rapidez=0;//este lo agregue 
        clicks=0;
        tiempo=10;
        contador_vidas=3;
        JLabel label1 = new JLabel("Vidas:");
        label1.setBounds(316, 134, 100, 30);
        label1.setBackground(Color.BLACK);
        label1.setForeground(Color.WHITE);
        JLabel label2 = new JLabel("Poder:");
        label2.setBounds(316, 184, 100, 30);
        label2.setBackground(Color.BLACK);
        label2.setForeground(Color.WHITE);
        JLabel label3 = new JLabel("Velocidad:");
        label3.setBounds(316, 234, 100, 30);
        label3.setBackground(Color.BLACK);
        label3.setForeground(Color.WHITE);
        JLabel label4 = new JLabel("Punteo:");
        label4.setBounds(316, 284, 100, 30);
        label4.setBackground(Color.BLACK);
        label4.setForeground(Color.WHITE);
        JTextArea area = new JTextArea("   TIEMPO RESTANTE \n                 (seg)");
        area.setBounds(316, 354, 128, 40);
        area.setBackground(Color.BLACK);
        area.setForeground(Color.WHITE);
        tiempo_restante = new JTextField(String.valueOf(tiempo));
        tiempo_restante.setBounds(341, 404, 80, 20);
        tiempo_restante.setBackground(Color.BLACK);
        tiempo_restante.enable(false);  
        
        JPanel soporte = new JPanel();
        soporte.setBounds(301, 74, 158, 420);
        soporte.setBackground(Color.BLACK);
  
        nickname = new JTextField("USUARIO");
        nickname.setBounds(316, 94, 128, 30); 
        nickname.setBackground(Color.BLACK);
        nickname.enable(false);
        vidas = new JTextField(String.valueOf(contador_vidas));
        vidas.setBounds(380, 164, 64, 20); 
        vidas.setBackground(Color.BLACK);
        vidas.enable(false);
        poder = new JTextField("0");
        poder.setBounds(380, 214, 64, 20);
        poder.setBackground(Color.BLACK);
        poder.enable(false);
        velocidad = new JTextField("0");
        velocidad.setBounds(380, 264, 64, 20);
        velocidad.setBackground(Color.BLACK);
        velocidad.enable(false);       
        punteo = new JTextField("0");
        punteo.setBounds(380, 314, 64, 20);
        punteo.setBackground(Color.BLACK);
        punteo.enable(false);
        this.posicion_nave=148;
        fondo = new FondoPanel();
     //   fondo2 = new FondoPanel2();
        galaga = new JFrame("VIDEOJUEGO GALAGA");
        galaga.setLayout(null);
        galaga.setBounds(435, 85, 500, 570);
        galaga.setVisible(true);   
        //galaga.setDefaultCloseOperation(1);
        galaga.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fondo.setLayout(null);
       // fondo.add(tablero);
        galaga.setContentPane(fondo);
         nave = new JButton();
        nave.setBounds(this.posicion_nave, 414, 64, 64);
        nave.setBackground(Color.BLUE);
//        JButton cambio = new JButton("alentar");
//        cambio.setBounds(400, 414, 64, 64); 
//        cambio.setBackground(Color.ORANGE);
//        JButton reducir = new JButton("acelerar");
//        reducir.setBounds(400, 340, 64, 64); 
//        reducir.setBackground(Color.CYAN);
        game = new JButton("¡¡¡DESPEGAR!!!");
        game.setBounds(320, 440, 120, 35); 
        game.setBackground(Color.CYAN);
        
        galaga.add(titulo);
        galaga.add(tiempo_restante);
        galaga.add(area);
        galaga.add(label4);
        galaga.add(punteo);
        galaga.add(label3);
        galaga.add(velocidad);
        galaga.add(label2);
        galaga.add(poder);
        galaga.add(label1);
        galaga.add(nickname);
        galaga.add(nave);
        galaga.add(game);
        galaga.add(vidas);
        galaga.add(soporte);
         
         galaga.repaint(); 
         
        game.addActionListener((ActionEvent ae) -> {
        if(this.clicks==0){
        hilo_corazon vida = new hilo_corazon(this.fondo, this.rapidez, Integer.parseInt(vidas.getText()), Integer.parseInt(tiempo_restante.getText()));
        Thread generar_vida = new Thread(vida);
        generar_vida.start();
        hilo_rayo rayo = new hilo_rayo(this.fondo, this.rapidez);
        Thread generar_rayo = new Thread(rayo);
        generar_rayo.start();
        hilo_caracol gary = new hilo_caracol(this.fondo, this.rapidez);
        Thread generar_caracol = new Thread(gary);
        generar_caracol.start();
        hilo_ojo ojo = new hilo_ojo(this.fondo, this.rapidez);
        Thread generar_ojo = new Thread(ojo);
        generar_ojo.start();
        hilo_asteroide asteroide = new hilo_asteroide(this.fondo, this.rapidez);
        Thread generar_asteroide = new Thread(asteroide);
        generar_asteroide.start();
        hilo_tiempo temporal = new hilo_tiempo(tiempo, tiempo_restante, contador_vidas);
        Thread correr_tiempo = new Thread(temporal);
        correr_tiempo.start();
         this.clicks++;
        }else{
//            int clock = Integer.parseInt(tiempo_restante.getText());
//            int life = Integer.parseInt(vidas.getText());
//            if(clock<=0 || life<=0){
//                  
//            }
            System.out.println("JUEGO INICIADO ");
        }
         });
       
      game.addKeyListener(new KeyListener() {
                 
          @Override
                 public void keyTyped(KeyEvent ke) {
               }

                 @Override
                 public void keyPressed(KeyEvent ke) {
                }

                 @Override
                 public void keyReleased(KeyEvent ke) {
                     switch(ke.getKeyCode()){
                         case 37://izquierda
                             if(nave.getX()>20){
                                 nave.setBounds(nave.getX()-64, nave.getY(), nave.getWidth(), nave.getHeight());
                             }
                             break;
                            case 39://derecha
                             if(nave.getX()<212){             
                                 nave.setBounds(nave.getX()+64, nave.getY(), nave.getWidth(), nave.getHeight());
                             }
                             break;
                             case 40://abajo
                             int contador = Integer.parseInt(poder.getText());
                             if(contador>0){
                             //hilo de hacerse invisible durante 6 segundos
                             nave.setBackground(Color.BLACK);
                             }
                             break;
                             case 32://derecha
                                int x = nave.getX();
                                int y = nave.getY();
                                JButton misil = new JButton();
                                misil.setBounds(x, y, 64, 64);
                                misil.setBackground(Color.ORANGE);
                                fondo.add(misil);
                                hilo_misil destructor = new hilo_misil(misil);
                                Thread genear_misil = new Thread(destructor);
                                genear_misil.start();
                             break;
                     }
                 }
             });
        
    } 
//        cambio.addActionListener((ActionEvent ae1) -> {
//       //     if(this.tiempo>300){
//               this.tiempo = this.tiempo-300; 
//        //    }
//             });
//        reducir.addActionListener((ActionEvent ae2) -> {
//               this.tiempo = this.tiempo+300;      
//             });
//        }
    
    public static JButton CrearBoton(int ancho, int alto, int x, int y, Color color){
        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
        return boton;
    }
    

    class FondoPanel extends JPanel {
        private Image imagen;
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo4.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }   

    

    
    //esto tambien va en el cosntructor
    //        galaga.add(cambio);
//        galaga.add(reducir);
}
