package ht3;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author steve gonzalez
 */
public class InterfazGrafica  {
JFrame Ventana_principal = new JFrame("Infinity");;
JButton rojo= new JButton();
JButton azul = new JButton();
JLabel label1 = new JLabel("Rojo");
JTextField text1 = new JTextField();
JLabel label2 = new JLabel("Azul");
JTextField text2 = new JTextField();
    public InterfazGrafica() {
        Ventana_principal.setLayout(null);
        Ventana_principal.setBounds(340, 105, 570, 195);
        Ventana_principal.setVisible(true);   
        Ventana_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        rojo.setBounds(200,20,150,120);
        rojo.setBackground(Color.red);
        Ventana_principal.setBackground(Color.YELLOW);
        azul.setBounds(25,20,150,120);
        azul.setBackground(Color.blue);
        label1.setBounds(385, 50, 80, 30);
        text1.setBounds(430,50,90,30);
        label2.setBounds(385,90, 80, 30);
        text2.setBounds(430,90,90,30);
        Ventana_principal.add(rojo);
        Ventana_principal.add(azul);
        Ventana_principal.add(label1);
        Ventana_principal.add(text1);
        Ventana_principal.add(label2);
        Ventana_principal.add(text2);
    }
    
}
