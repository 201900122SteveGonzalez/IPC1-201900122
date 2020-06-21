package practica2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Interfaz_grafica {
JFrame Menu_principal = new JFrame("MENU PRINCIPAL");
public Interfaz_grafica() {
Menu_principal.setLayout(null);
    Menu_principal.setBounds(500, 105, 215, 360);
    Menu_principal.setVisible(true);    
    Menu_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    

JButton quicksort = new JButton("Top 5 Quick Sort");
quicksort.setBounds(20,20,160,40);
JButton bubblesort = new JButton("Top 5 Bubble Sort");
bubblesort.setBounds(20,80,160,40);
JButton iniciar_juego = new JButton("Iniciar Juego");
iniciar_juego.setBounds(20,140,160,40);
JButton acerca_de = new JButton("Acerca de...");
acerca_de.setBounds(20,200,160,40);
JButton salir = new JButton("Salir");
 salir.setBounds(20,260,160,40);

Menu_principal.add(quicksort);
Menu_principal.add(bubblesort);    
Menu_principal.add(iniciar_juego);  
Menu_principal.add(acerca_de);  
Menu_principal.add(salir);  

quicksort.addActionListener((ActionEvent ae) -> {
      REPORTES_QUICKSORT();
    });  

bubblesort.addActionListener((ActionEvent ae) -> {
      REPORTES_BUBBLESORT();
    });  

acerca_de.addActionListener((ActionEvent ae) -> {
      ACERCA();
    });  

iniciar_juego.addActionListener((ActionEvent ae) -> {
      INICIO();
    });  

salir.addActionListener((ActionEvent ae) -> {
       System.exit(0);
    });  
    }
    

    private void REPORTES_QUICKSORT() {
        JFrame Ventana_quicksort = new JFrame("REPORTES QUICKSORT");
        Ventana_quicksort.setLayout(null);
        Ventana_quicksort.setBounds(500, 105, 305, 200);
        Ventana_quicksort.setVisible(true);   
        Ventana_quicksort.setDefaultCloseOperation(1);
        JLabel lb1 = new JLabel("MEJORES PUNTUACIONES");
        lb1.setBounds(70, 0, 150, 40);
      Object titulos []={"NICKNAME", "PUNTEO"};
      Object dimensiones [][]=new Object[6][3];
      JTable tabla=new JTable(dimensiones, titulos);
       tabla.setValueAt("NICKNAME", 0, 0);
       tabla.setValueAt("PUNTEO", 0, 1);
      tabla.setBounds(20, 40, 250, 100);
        Ventana_quicksort.add(lb1);
        Ventana_quicksort.add(tabla);
        
   }

    private void REPORTES_BUBBLESORT() {
        JFrame Ventana_bubblesort = new JFrame("REPORTES BUBBLESORT");
        Ventana_bubblesort.setLayout(null);
        Ventana_bubblesort.setBounds(500, 105, 305, 200);
        Ventana_bubblesort.setVisible(true);   
        Ventana_bubblesort.setDefaultCloseOperation(1);
        JLabel lb1 = new JLabel("MEJORES PUNTUACIONES");
        lb1.setBounds(70, 0, 150, 40);
       Object titulos []={"NICKNAME", "PUNTEO"};
       Object dimensiones [][]=new Object[6][3];
       JTable tabla=new JTable(dimensiones, titulos);
       tabla.setValueAt("NICKNAME", 0, 0);
       tabla.setValueAt("PUNTEO", 0, 1);
       tabla.setBounds(20, 40, 250, 100);
        Ventana_bubblesort.add(lb1);
        Ventana_bubblesort.add(tabla);
   }

    private void INICIO() {   
        JFrame ventana_inicio = new JFrame("JUGADOR");
        ventana_inicio.setLayout(null);
        ventana_inicio.setBounds(500, 105, 260, 150);
        ventana_inicio.setVisible(true);   
        ventana_inicio.setDefaultCloseOperation(1);
        JLabel NAME = new JLabel("NICKNAME:");
        NAME.setBounds(20, 20, 80, 20);
        JTextField nombre = new JTextField("");
        nombre.setBounds(100, 20, 120, 20);
        JButton jugar = new JButton("JUGAR GALAGA");
        jugar.setBounds(50,60,140,40);
        ventana_inicio.add(NAME);
        ventana_inicio.add(nombre);    
        ventana_inicio.add(jugar);   
        
        jugar.addActionListener((ActionEvent ae) -> {
            String nickname = nombre.getText();
               if ("".equals(nickname)) {
                JOptionPane.showMessageDialog(null, "no ha ingresado un nombre de usuario");
            }else{
                   ventana_inicio.setVisible(false);
                 //  this.Menu_principal.setVisible(false);
                   GALAGA juego = new GALAGA();
               }       
        });  
    }

    private void ACERCA() {
        JFrame ventana_sobre = new JFrame("DATOS DE ESTUDIANTE");
        ventana_sobre.setLayout(null);
        ventana_sobre.setBounds(500, 105, 310, 150);
        ventana_sobre.setVisible(true);   
        ventana_sobre.setDefaultCloseOperation(1);
        JLabel NAME = new JLabel("NOMBRE: HERBERT STEVE GONZÁLEZ CAMEY");
        NAME.setBounds(20, 20, 260, 40);
        JLabel CARNET = new JLabel("CARNET: 201900122");
        CARNET.setBounds(20, 60, 200, 40);
        ventana_sobre.add(NAME);
        ventana_sobre.add(CARNET);
          }
    
}
