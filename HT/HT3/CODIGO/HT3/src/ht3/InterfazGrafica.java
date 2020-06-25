package ht3;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
/**
 *
 * @author steve gonzalez
 */
public class InterfazGrafica  {
FondoPanel fondo = new FondoPanel();
JFrame Ventana_principal = new JFrame("Infinity");
public static JButton rojo= new JButton();
public static JButton azul = new JButton();
JLabel label1 = new JLabel("ROJO");
public static JTextField text1 = new JTextField();//rojo
JLabel label2 = new JLabel("AZUL");
public static JTextField text2 = new JTextField();//azul

    public InterfazGrafica() {
        Ventana_principal.setLayout(null);
        Ventana_principal.setBounds(340, 105, 570, 195);
        Ventana_principal.setVisible(true);   
        Ventana_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Ventana_principal.setContentPane(fondo);
        rojo.setBounds(200,20,150,120);
        rojo.setBackground(Color.blue);
        Ventana_principal.setBackground(Color.YELLOW);
        azul.setBounds(25,20,150,120);
        azul.setBackground(Color.red);
        label1.setBounds(385, 40, 90, 60);
        Font f= new Font("ALGERIAN", Font.BOLD, 14); 
        label1.setFont(f);
        label1.setForeground(Color.WHITE);
        label1.setVisible(true);
        text1.setBounds(430,50,90,30);
        label2.setBounds(385,80, 90, 60);
        label2.setFont(f);
        label2.setForeground(Color.WHITE);
        text2.setBounds(430,90,90,30);
        Ventana_principal.add(rojo);
        Ventana_principal.add(azul);
        Ventana_principal.add(label1);
        Ventana_principal.add(text1);
        Ventana_principal.add(label2);
        Ventana_principal.add(text2);
        
    }
    
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("background.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
