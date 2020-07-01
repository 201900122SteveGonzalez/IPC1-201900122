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
import hilos.hilo_temporal;
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
    public static lista_objetos lista_rojos = new lista_objetos();
    public static lista_objetos lista_azules = new lista_objetos();
    public static lista_objetos lista_amarillos = new lista_objetos();
    public static lista_objetos lista_verdes = new lista_objetos();
    public static Pila pila = new Pila();
    public static Cola cola = new Cola();
    public static lista_circular_doblemente_enlazada circular = new lista_circular_doblemente_enlazada();
    public static lista_doble lista_doble = new lista_doble();
    public static int rojos;
    public static int azules;
    public static int amarillos;
    public static int verdes;
    FondoPanel fondo = new FondoPanel();
    public static JButton jugador;
    public static String archivo;
    public static int contador_botones;
    FileReader fr;
    BufferedReader br;
    public static JTextArea textcircular;
    public static JTextArea textdoble;
    public static JTextArea textpila;
    public static JTextArea textsimple;
    public static JTextArea textcola;
    public RecogeBloques() {
        MENU.setLayout(null);
        MENU.setBounds(300, 105, 580, 525);
        MENU.setVisible(true);
        MENU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fondo.setLayout(null);
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

        jugador = new JButton();
        jugador.setBounds(20, 100, 75, 75);
        jugador.setBackground(Color.BLACK);
        MENU.add(jugador);

        MENU.repaint();
        hilo_temporal temporal = new hilo_temporal();
        Thread correr_tiempo = new Thread(temporal);
        correr_tiempo.start();
        
        ListaDoble.addActionListener((ActionEvent ae) -> {
            JFrame LD = new JFrame("Lista Doble");
            LD.setLayout(null);
            LD.setBounds(450, 100, 250, 380);
            LD.setVisible(true);
            LD.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            textdoble = new JTextArea();
            textdoble.setBounds(20, 20, 190, 200);
            LD.add(textdoble);
            JButton agregar = new JButton("Agregar");
            agregar.setBounds(20, 240, 190, 30);
            LD.add(agregar);
            JButton eliminar = new JButton("Eliminar");
            eliminar.setBounds(20, 290, 190, 30);
            LD.add(eliminar);
            lista_doble.generar_listas(textdoble);
           agregar.addActionListener((ActionEvent ae2) -> {
            JFrame agregarld = new JFrame("Agregar LD");
            agregarld.setLayout(null);
            agregarld.setBounds(500, 100, 190, 170);
            agregarld.setVisible(true);
            agregarld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel val = new JLabel("Valor");
            val.setBounds(20, 10, 40, 20);
            agregarld.add(val);
            JTextField valor = new JTextField();
            valor.setBounds(40, 40, 100, 30);
            agregarld.add(valor);
            JButton Agregar = new JButton("Agregar");
            Agregar.setBounds(40, 80, 100, 30);
            agregarld.add(Agregar);
            Agregar.addActionListener((ActionEvent ae3) -> {
                if("".equals(valor.getText())){
                      JOptionPane.showMessageDialog(null, "NO HA INGRESADO UN VALOR PARA AÑADIR A LA LISTA");
                }else{
                   azules++;
                   lista_doble.insertar2(Integer.parseInt(valor.getText()), "AZUL", azules);
                    lista_doble.generar_listas(textdoble);
                    lista_doble.imprimir();
                    valor.setText("");
                    agregarld.setVisible(false);
                }
               });
            });
           eliminar.addActionListener((ActionEvent ae4) -> {
            JFrame eliminarld = new JFrame("Eliminar LD");
            eliminarld.setLayout(null);
            eliminarld.setBounds(500, 100, 190, 170);
            eliminarld.setVisible(true);
            eliminarld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel val = new JLabel("Valor");
            val.setBounds(20, 10, 40, 20);
            eliminarld.add(val);
            JTextField valor = new JTextField();
            valor.setBounds(40, 40, 100, 30);
            eliminarld.add(valor);
            JButton borrar = new JButton("Eliminar");
            borrar.setBounds(40, 80, 100, 30);
            eliminarld.add(borrar);
            borrar.addActionListener((ActionEvent ae3) -> {
                if("".equals(valor.getText())){
                      JOptionPane.showMessageDialog(null, "NO HA INGRESADO UN VALOR PARA AÑADIR A LA LISTA");
                }else{
                    int value = 0;
                    try{
                     value = Integer.parseInt(valor.getText());
                    }catch(Exception e){
                      JOptionPane.showMessageDialog(null, "NO INGRESO UN NUMERO");
                    }
                    if(lista_doble.existe2(value)){
                         lista_doble.eliminar(value);
                        lista_doble.generar_listas(textdoble);
                        valor.setText("");
                        eliminarld.setVisible(false);
                    }else{
                         JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO UN NODO CON ESE VALOR");
                    } 
                }
               });         
            });
        });

        ListaCircular.addActionListener((ActionEvent ae) -> {
            JFrame LC = new JFrame("Lista Circular Doble");
            LC.setLayout(null);
            LC.setBounds(450, 100, 250, 380);
            LC.setVisible(true);
            LC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            textcircular = new JTextArea();
            textcircular.setBounds(20, 20, 190, 200);
            LC.add(textcircular);
            JButton agregar = new JButton("Agregar");
            agregar.setBounds(20, 240, 190, 30);
            LC.add(agregar);
            JButton eliminar = new JButton("Eliminar");
            eliminar.setBounds(20, 290, 190, 30);
            LC.add(eliminar);
            circular.generar_listas(textcircular);
           agregar.addActionListener((ActionEvent ae2) -> {
            JFrame agregarlc = new JFrame("Agregar LC");
            agregarlc.setLayout(null);
            agregarlc.setBounds(500, 100, 190, 170);
            agregarlc.setVisible(true);
            agregarlc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel val = new JLabel("Valor");
            val.setBounds(20, 10, 40, 20);
            agregarlc.add(val);
            JTextField valor = new JTextField();
            valor.setBounds(40, 40, 100, 30);
            agregarlc.add(valor);
            JButton Agregar = new JButton("Agregar");
            Agregar.setBounds(40, 80, 100, 30);
            agregarlc.add(Agregar);
            Agregar.addActionListener((ActionEvent ae3) -> {
                if("".equals(valor.getText())){
                      JOptionPane.showMessageDialog(null, "NO HA INGRESADO UN VALOR PARA AÑADIR A LA LISTA");
                }else{
                    rojos++;
                   circular.insertar2(Integer.parseInt(valor.getText()), "ROJO", rojos);
                    circular.generar_listas(textcircular);
                    agregarlc.setVisible(false);
                }
               });
            });
           eliminar.addActionListener((ActionEvent ae4) -> {
            JFrame eliminarlc = new JFrame("Eliminar LC");
            eliminarlc.setLayout(null);
            eliminarlc.setBounds(500, 100, 190, 170);
            eliminarlc.setVisible(true);
            eliminarlc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel val = new JLabel("Valor");
            val.setBounds(20, 10, 40, 20);
            eliminarlc.add(val);
            JTextField valor = new JTextField();
            valor.setBounds(40, 40, 100, 30);
            eliminarlc.add(valor);
            JButton borrar = new JButton("Eliminar");
            borrar.setBounds(40, 80, 100, 30);
            eliminarlc.add(borrar);
            borrar.addActionListener((ActionEvent ae3) -> {
                if("".equals(valor.getText())){
                      JOptionPane.showMessageDialog(null, "NO HA INGRESADO UN VALOR PARA AÑADIR A LA LISTA");
                }else{
                    int value = 0;
                    try{
                     value = Integer.parseInt(valor.getText());
                    }catch(Exception e){
                                            JOptionPane.showMessageDialog(null, "NO INGRESO UN NUMERO");
                    }
                    if(circular.existe(value)){
                         circular.eliminar(value);
                        circular.generar_listas(textcircular);
                        eliminarlc.setVisible(false);
                    }else{
                                   JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO UN NODO CON ESE VALOR");
                    }
                }
               });         
            });
        });

        ListaSimple.addActionListener((ActionEvent ae) -> {
         JFrame LSP = new JFrame("Lista Simple");
            LSP.setLayout(null);
            LSP.setBounds(450, 100, 250, 550);
            LSP.setVisible(true);
            LSP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            textsimple = new JTextArea();
            textsimple.setBounds(20, 20, 190, 360);
            LSP.add(textsimple);
            JButton agregar = new JButton("Agregar");
            agregar.setBounds(20, 400, 190, 30);
            LSP.add(agregar);
            JButton eliminar = new JButton("Eliminar");
            eliminar.setBounds(20, 450, 190, 30);
            LSP.add(eliminar);
            LS.generar_listas(textsimple);
           agregar.addActionListener((ActionEvent ae2) -> {
            JFrame agregarls = new JFrame("Agregar LS");
            agregarls.setLayout(null);
            agregarls.setBounds(500, 100, 190, 240);
            agregarls.setVisible(true);
            agregarls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel val = new JLabel("Valor");
            val.setBounds(20, 10, 40, 20);
            agregarls.add(val);
            JTextField valor = new JTextField();
            valor.setBounds(40, 40, 100, 30);
            agregarls.add(valor);
            JLabel col = new JLabel("Color");
            col.setBounds(20, 70, 40, 20);
            agregarls.add(col);
            JTextField color = new JTextField();
            color.setBounds(40, 100, 100, 30);
            agregarls.add(color);
            JButton Agregar = new JButton("Agregar");
            Agregar.setBounds(40, 150, 100, 30);
            agregarls.add(Agregar);
            Agregar.addActionListener((ActionEvent ae3) -> {
                if("".equals(valor.getText()) || "".equals(color.getText())){
                      JOptionPane.showMessageDialog(null, "NO HA INGRESADO TODA LA INFORMACION PARA AÑADIR A LA LISTA");
                }else{
                   contador_botones++;
                   LS.insertar2(Integer.parseInt(valor.getText()), color.getText(), contador_botones);
                    LS.generar_listas(textsimple);
                    LS.imprimir_lista();
                    valor.setText("");
                    agregarls.setVisible(false);
                }
               });
            });
           eliminar.addActionListener((ActionEvent ae4) -> {
            JFrame eliminarls = new JFrame("Eliminar LS");
            eliminarls.setLayout(null);
            eliminarls.setBounds(500, 100, 200, 240);
            eliminarls.setVisible(true);
            eliminarls.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel val = new JLabel("Valor");
            val.setBounds(20, 10, 40, 20);
            eliminarls.add(val);
            JTextField valor = new JTextField();
            valor.setBounds(40, 40, 100, 30);
            eliminarls.add(valor);
            JLabel col = new JLabel("Color");
            col.setBounds(20, 70, 40, 20);
            eliminarls.add(col);
            JTextField color = new JTextField();
            color.setBounds(40, 100, 100, 30);
            eliminarls.add(color);
            JButton borrar = new JButton("Eliminar");
            borrar.setBounds(40, 150, 100, 30);
            eliminarls.add(borrar);
            borrar.addActionListener((ActionEvent ae3) -> {
                if("".equals(valor.getText()) || "".equals(color.getText())){
                      JOptionPane.showMessageDialog(null, "NO HA INGRESADO TODA LA INFORMACION PARA ELIMINAR DE LA LISTA");
                }else{
                    int value = 0;
                    try{
                     value = Integer.parseInt(valor.getText());
                    }catch(Exception e){
                      JOptionPane.showMessageDialog(null, "NO INGRESO UN NUMERO");
                    }
                    if(LS.existe(value, color.getText())){
                         LS.eliminar(value, color.getText());
                        LS.generar_listas(textsimple);
                        valor.setText("");
                        eliminarls.setVisible(false);
                    }else{
                         JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO UN NODO CON ESE VALOR");
                    } 
                }
               });         
            });
        });

        ListaDoble.addActionListener((ActionEvent ae) -> {

        });

        Pila.addActionListener((ActionEvent ae) -> {
          JFrame PL = new JFrame("Pila");
            PL.setLayout(null);
            PL.setBounds(450, 100, 250, 380);
            PL.setVisible(true);
            PL.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            textpila = new JTextArea();
            textpila.setBounds(20, 20, 190, 200);
            PL.add(textpila);
            JButton push = new JButton("Push");
            push.setBounds(20, 240, 190, 30);
            PL.add(push);
            JButton pop = new JButton("Pop");
            pop.setBounds(20, 290, 190, 30);
            PL.add(pop);
            pila.generar_listas(textpila);
           push.addActionListener((ActionEvent ae2) -> {
            JFrame pushpila = new JFrame("Agregar Pila");
            pushpila.setLayout(null);
            pushpila.setBounds(500, 100, 190, 170);
            pushpila.setVisible(true);
            pushpila.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel val = new JLabel("Valor");
            val.setBounds(20, 10, 40, 20);
            pushpila.add(val);
            JTextField valor = new JTextField();
            valor.setBounds(40, 40, 100, 30);
            pushpila.add(valor);
            JButton Agregar = new JButton("Agregar");
            Agregar.setBounds(40, 80, 100, 30);
            pushpila.add(Agregar);
            Agregar.addActionListener((ActionEvent ae3) -> {
                if("".equals(valor.getText())){
                      JOptionPane.showMessageDialog(null, "NO HA INGRESADO UN VALOR PARA AÑADIR A LA LISTA");
                }else{
                    amarillos++;
                   pila.push(Integer.parseInt(valor.getText()), "AMARILLO", amarillos);
                    pila.generar_listas(textpila);
                    pushpila.setVisible(false);
                    System.out.println("cabeza: "+pila.getCabeza().getID());
//                    System.out.println("siguiente: "+pila.getCabeza().getSiguiente().getID());
                }
               });
            });
           pop.addActionListener((ActionEvent ae4) -> {
             pila.pop();
             pila.generar_listas(textpila);
            });
        });

        Cola.addActionListener((ActionEvent ae) -> {
           JFrame CL = new JFrame("Cola");
            CL.setLayout(null);
            CL.setBounds(450, 100, 250, 380);
            CL.setVisible(true);
            CL.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            textcola = new JTextArea();
            textcola.setBounds(20, 20, 190, 200);
            CL.add(textcola);
            JButton encolar = new JButton("Encolar");
            encolar.setBounds(20, 240, 190, 30);
            CL.add(encolar);
            JButton desencolar = new JButton("Desencolar");
            desencolar.setBounds(20, 290, 190, 30);
            CL.add(desencolar);
            cola.generar_listas(textcola);
           encolar.addActionListener((ActionEvent ae2) -> {
            JFrame encolarcola = new JFrame("Agregar Cola");
            encolarcola.setLayout(null);
            encolarcola.setBounds(500, 100, 190, 170);
            encolarcola.setVisible(true);
            encolarcola.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel val = new JLabel("Valor");
            val.setBounds(20, 10, 40, 20);
            encolarcola.add(val);
            JTextField valor = new JTextField();
            valor.setBounds(40, 40, 100, 30);
            encolarcola.add(valor);
            JButton Agregar = new JButton("Agregar");
            Agregar.setBounds(40, 80, 100, 30);
            encolarcola.add(Agregar);
            Agregar.addActionListener((ActionEvent ae3) -> {
                if("".equals(valor.getText())){
                      JOptionPane.showMessageDialog(null, "NO HA INGRESADO UN VALOR PARA AÑADIR A LA LISTA");
                }else{
                    verdes++;
                   cola.encolar(Integer.parseInt(valor.getText()), "VERDE", verdes);
                    cola.generar_listas(textcola);
                    encolarcola.setVisible(false);
                }
               });
            });
           desencolar.addActionListener((ActionEvent ae4) -> {
             cola.desencolar();
             cola.generar_listas(textcola);
            });
        });

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
                            jugador.setBounds(jugador.getX(), jugador.getY() + 75, jugador.getWidth(), jugador.getHeight());
                        }
                        break;
                    case 38://arriba
                        if (jugador.getY() > 100) {
                            jugador.setBounds(jugador.getX(), jugador.getY() - 75, jugador.getWidth(), jugador.getHeight());
                        }
                        break;

                }
            }

        });

        Reiniciar.addActionListener((ActionEvent ae) -> {
            LS.imprimir_lista();
            System.out.println("------------------------------------------------");
            LS.imprimir_lista();
            System.out.println("");
            pila.imprimir_lista();
            System.out.println("");
            cola.imprimir_lista();
            System.out.println("");
            lista_doble.imprimir();
            System.out.println("");
            circular.imprimir();
            LS.reinicio();
            pila.reiniciar();
            cola.reiniciar();
            circular.reiniciar();
            lista_doble.reiniciar();
            System.out.println("------------------------------------------------");
            LS.imprimir_lista();
            System.out.println("");
            pila.imprimir_lista();
            System.out.println("");
            cola.imprimir_lista();
            System.out.println("");
            lista_doble.imprimir();
            System.out.println("");
            circular.imprimir();
            lista_rojos.reiniciar();
            lista_azules.reiniciar();
            lista_amarillos.reiniciar();
            lista_verdes.reiniciar();
            jugador.setBounds(20, 100, 75, 75);
//            textcircular.setText("");
//            textcircular.setText("LISTA VACIA");
        });

        CargarDatos.addActionListener((ActionEvent ae) -> {
            JFileChooser fc = new javax.swing.JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.ipc1", "ipc1");
            fc.setFileFilter(filtro);
            int seleccion = fc.showOpenDialog(MENU);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
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
                while ((aux = br.readLine()) != null) {
                    //   while(!"Fila".equalsIgnoreCase(aux = br.readLine())){  
                    String[] linea = aux.split("\n");
                    for (String dato : linea) {
                        String[] info = dato.split(",");
                        if (!"Fila".equalsIgnoreCase(info[0])) {
                            int fila = Integer.parseInt(info[0]);
                            int columna = Integer.parseInt(info[1]);
                            int valor = Integer.parseInt(info[2]);
                            Color color = null;
                            switch (info[3]) {
                                case "AZUL":
                                    color = Color.BLUE;
                                    JButton boton = CrearBoton(fila, columna, valor, Color.BLUE);
                                    lista_azules.agregar(boton);
                                    break;
                                case "ROJO":
                                    color = Color.RED;
                                    JButton boton2 = CrearBoton(fila, columna, valor, Color.RED);
                                    lista_rojos.agregar(boton2);
                                    break;
                                case "AMARILLO":
                                    color = Color.YELLOW;
                                    JButton boton3 = CrearBoton(fila, columna, valor, Color.YELLOW);
                                    lista_amarillos.agregar(boton3);
                                    break;
                                case "VERDE":
                                    color = Color.GREEN;
                                    JButton boton4 = CrearBoton(fila, columna, valor, Color.GREEN);
                                    lista_verdes.agregar(boton4);
                                    break;
                            }
                          //  contador_botones++;
                            LS.insertar(valor, color, contador_botones);
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(RecogeBloques.class.getName()).log(Level.SEVERE, null, ex);
            }
            CargarTablero();
        });
    }

    private JButton CrearBoton(int fila, int columna, int valor, Color color) {
        JButton boton = new JButton();
        boton.setBounds(20 + (columna * 75), 100 + (fila * 75), 75, 75);
        boton.setBackground(color);
        boton.setText(String.valueOf(valor));
        return boton;
    }

//    private JButton CrearBoton(int ancho, int alto, int x, int y, int valor, Color color) {
//        JButton boton = new JButton();
//        boton.setBounds(x, y, ancho, alto);
//        boton.setBackground(color);
//        boton.setText(String.valueOf(valor));
//        return boton;
//    }
    public void CargarTablero() {
        lista_rojos.llenar_tablero();
        lista_azules.llenar_tablero();
        lista_amarillos.llenar_tablero();
        lista_verdes.llenar_tablero();
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
