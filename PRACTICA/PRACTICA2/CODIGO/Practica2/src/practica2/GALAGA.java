package practica2;
import estructuras.Nodo;
import estructuras.lista_objetos;
import hilos.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class GALAGA {
    public static lista_objetos lista_asteroide1 = new lista_objetos(); ;// para ver choque con na
    public static lista_objetos lista_vidas1 = new lista_objetos(); // para ver choque con na
    public static lista_objetos lista_misiles = new lista_objetos();
    public static lista_objetos lista_caracoles = new lista_objetos();
    public static lista_objetos lista_invisibles = new lista_objetos();
    public static lista_objetos lista_rayos = new lista_objetos();
    FondoPanel fondo;
    public static JFrame galaga;
    JButton game;
    public static int tiempo;//tiempo de reloj
    public static int rapidez;// para el tiempo de los objetos en caer
    public static JTextField nickname;
    public static JTextField poder;//invisibilidad ojo
    public static int contador_ojos;
    public static JTextField vidas;//corazon asteroide
    public static int contador_vidas;//corazon, asteroide
    public static JTextField velocidad;//todos
    public static int contador_punteo;
    public static JTextField punteo;
    public static JTextField tiempo_restante;//todos los objetos lo manejan
    public static JButton nave = new JButton();//todos los objetos lo manejan
    private int clicks;
    public static int contador_corazones;//para listas enlazadas


    public GALAGA(String nombre_nickname) {
        JButton titulo = new JButton("★★★★★★★★ BIENVENIDO A GALAGA ★★★★★★★★");
        nave.setBounds(84, 414, 64, 64);
        nave.setBackground(Color.BLUE);
        titulo.setBounds(20, 20, 425, 50);
        titulo.setForeground(Color.WHITE);
        titulo.setBackground(Color.BLACK);
        titulo.enable(false);
        rapidez = 0;//este es para medir la velocidad
        clicks = 0;
        contador_punteo = 0;
        tiempo = 240;
        contador_vidas = 0;
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

        nickname = new JTextField(nombre_nickname);
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
        fondo = new FondoPanel();
        galaga = new JFrame("VIDEOJUEGO GALAGA");
        galaga.setLayout(null);
        galaga.setBounds(435, 85, 500, 570);
        galaga.setVisible(true);
        galaga.setDefaultCloseOperation(1);
     //   galaga.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fondo.setLayout(null);
        galaga.setContentPane(fondo);
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
        galaga.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        game.addActionListener((ActionEvent ae) -> {
            if (this.clicks == 0) {
                tiempo = 240;
                tiempo_restante.setText(String.valueOf(tiempo));
                contador_vidas = 3;
                vidas.setText(String.valueOf(contador_vidas));
                rapidez = 1;
                velocidad.setText(String.valueOf(rapidez));
                contador_ojos = 0;
                poder.setText(String.valueOf(contador_ojos));
                hilo_corazon plus = new hilo_corazon();
                Thread generar_vida = new Thread(plus);
                generar_vida.start();
                hilo_rayo rayo = new hilo_rayo();
                Thread generar_rayo = new Thread(rayo);
                generar_rayo.start();
                hilo_caracol gary = new hilo_caracol();
                Thread generar_caracol = new Thread(gary);
                generar_caracol.start();
                hilo_ojo ojo = new hilo_ojo();
                Thread generar_ojo = new Thread(ojo);
                generar_ojo.start();
                hilo_asteroide asteroide = new hilo_asteroide();
                Thread generar_asteroide = new Thread(asteroide);
                generar_asteroide.start();
                hilo_tiempo temporal = new hilo_tiempo();
                Thread correr_tiempo = new Thread(temporal);
                correr_tiempo.start();
                this.clicks++;
            } else {
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
                switch (ke.getKeyCode()) {
                    case 37://izquierda
                        if (nave.getX() > 20) {
                            nave.setBounds(nave.getX() - 64, nave.getY(), nave.getWidth(), nave.getHeight());
                        }
                        break;
                    case 39://derecha
                        if (nave.getX() < 212) {
                            nave.setBounds(nave.getX() + 64, nave.getY(), nave.getWidth(), nave.getHeight());
                        }
                        break;
                    case 40://abajo
                        int contador = Integer.parseInt(poder.getText());
                        hilo_invisible invisibilidad = new hilo_invisible(nave, contador);
                        Thread volver_invisible = new Thread(invisibilidad);
                        volver_invisible.start();
                        contador--;
                        if (contador >= 0) {
                            poder.setText(String.valueOf(contador));
                        }
                        if (contador < 0) {
                            poder.setText("0");
                        }

                        break;
                    case 32://barra espaciadora
                        int x = nave.getX();
                        int y = nave.getY();
                        JButton misil = new JButton();
                        misil.setBounds(x, y, 64, 64);
                        misil.setBackground(Color.ORANGE);
                        fondo.add(misil);
                        lista_misiles.agregar(misil);
                        hilo_misil destructor = new hilo_misil(misil);
                        Thread genear_misil = new Thread(destructor);
                        genear_misil.start();
                        GALAGA.galaga.repaint();
                        break;
                }
            }
        });

    }

    public static JButton CrearBoton(int ancho, int alto, int x, int y, Color color) {
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

}
