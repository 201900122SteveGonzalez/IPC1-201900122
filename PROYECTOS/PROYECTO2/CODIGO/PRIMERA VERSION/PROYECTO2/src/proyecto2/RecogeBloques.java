package proyecto2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import Listas_Simples.*;
import Listas_Doblemente_Enlazadas.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Steve González
 */
public class RecogeBloques {
    public static lista_simple LS = new lista_simple();//para guardar el archivo al cargarlo
    public static JFrame MENU = new JFrame("RECOGE BLOQUES");
    public static lista_objetos lista_rojos  = new lista_objetos();
    public static lista_objetos lista_azules  = new lista_objetos();
    public static lista_objetos lista_amarillos  = new lista_objetos();
    public static lista_objetos lista_verdes  = new lista_objetos();
    FondoPanel fondo = new FondoPanel();
    public static JButton jugador;
    public static String archivo;
    public static int contador_botones;
    FileReader fr;
    BufferedReader br;
    public RecogeBloques() {
        MENU.setLayout(null);
        MENU.setBounds(300, 105, 580, 525);
        MENU.setVisible(true);
        MENU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MENU.setContentPane(fondo);
        JButton CargarDatos = new JButton("Cargar Datos");
        CargarDatos.setBounds(20, 10, 120, 30);
        MENU.add(CargarDatos);
        JButton Reiniciar = new JButton("Reiniciar");
        Reiniciar.setBounds(20, 50, 120, 30);
        MENU.add(Reiniciar);
        JButton ListaCircular = new JButton("Lista Circular");
        ListaCircular.setBounds(150, 30, 120, 30);
        MENU.add(ListaCircular);
        JButton ListaSimple = new JButton("Lista Simple");
        ListaSimple.setBounds(280, 10, 120, 30);
        MENU.add(ListaSimple);
        JButton Pila = new JButton("Pila");
        Pila.setBounds(280, 50, 120, 30);
        MENU.add(Pila);
        JButton ListaDoble = new JButton("Lista Doble");
        ListaDoble.setBounds(410, 10, 120, 30);
        MENU.add(ListaDoble);
        JButton Cola = new JButton("Cola");
        Cola.setBounds(410, 50, 120, 30);
        MENU.add(Cola);

        jugador = CrearBoton(75, 75, 20, 100, Color.black);
        MENU.add(jugador);

        MENU.repaint();
        
        jugador.addKeyListener(new KeyListener() {

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
                        if (jugador.getX() > 20) {
                            jugador.setBounds(jugador.getX() - 75, jugador.getY(), jugador.getWidth(), jugador.getHeight());
                        }
                        break;
                    case 39://derecha
                        if (jugador.getX() < 470) {
                            jugador.setBounds(jugador.getX() + 75, jugador.getY(), jugador.getWidth(), jugador.getHeight());
                        }
                        break;
                    case 40://abajo
                        if (jugador.getY() < 400) {
                            jugador.setBounds(jugador.getX(), jugador.getY()+75, jugador.getWidth(), jugador.getHeight());
                        }
                        break;
                     case 38://arriba
                           if (jugador.getY() > 100) {
                            jugador.setBounds(jugador.getX(), jugador.getY()-75, jugador.getWidth(), jugador.getHeight());
                        }
                        break;
                        
                }
            }

        });
        
        Reiniciar.addActionListener((ActionEvent ae) -> {
           LS.imprimir_lista();
           LS.reinicio();
            System.out.println("------------------------------------------------");
           LS.imprimir_lista();
           LS.llenar_tablero();
        });

        CargarDatos.addActionListener((ActionEvent ae) -> {
                JFileChooser fc = new javax.swing.JFileChooser();
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.ipc1","ipc1");
                fc.setFileFilter(filtro);
                int seleccion = fc.showOpenDialog(MENU);
                if(seleccion == JFileChooser.APPROVE_OPTION){
                 File fichero = fc.getSelectedFile();
                 archivo = fichero.getAbsolutePath();
                    System.out.println(archivo);
                }
            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RecogeBloques.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                String aux;
            try {
                while((aux = br.readLine())!=null){
               //   while(!"Fila".equalsIgnoreCase(aux = br.readLine())){  
                    String[] linea = aux.split("\n");
                    for (String dato : linea) {
                        String[] info = dato.split(",");
                        if(!"Fila".equalsIgnoreCase(info[0])){
                            int fila = Integer.parseInt(info[0]);
                            int columna = Integer.parseInt(info[1]);
                            int valor = Integer.parseInt(info[2]);
                            Color color = null;
                            switch(info[3]){
                                case "AZUL":
                                    color = Color.BLUE;
                                    break;
                                case "ROJO":
                                    color = Color.RED;
                                    break;
                                case "AMARILLO":
                                    color = Color.YELLOW;
                                    break;  
                                case "VERDE":
                                    color = Color.GREEN;
                                    break;
                            }
                            LS.insertar(fila, columna, valor, color);
                            
                        }  
                    }
                } } catch (IOException ex) {
                Logger.getLogger(RecogeBloques.class.getName()).log(Level.SEVERE, null, ex);
            }
            CargarTablero();
        });
    }

   
    
    private JButton CrearBoton(int ancho, int alto, int x, int y, Color color) {
        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
        return boton;
    }

    public void CargarTablero() {
         LS.llenar_tablero();
         MENU.repaint();
    }

    class FondoPanel extends JPanel {
        private Image imagen;
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/tablero_bloques.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
