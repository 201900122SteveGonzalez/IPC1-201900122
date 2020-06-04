package vj_ipc1_ht1;
import java.util.Scanner;
public class Consulta_de_requisitos {
Scanner teclado = new Scanner(System.in);
    public Consulta_de_requisitos() {
        System.out.println("BIENVENIDO A ASIGNACIÓN DE CURSOS");
        System.out.println("¿CUENTA CON AL MENOS 34 CRÉDITOS Y HA APROBADO MATEMÁTICA BÁSICA 2?");
        String respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("no")){
            System.out.println("NO PUEDE CURSAR IPC1, PORQUE NO CUMPLE CON LOS PRERREQUISITOS");
        }
        if (respuesta.equalsIgnoreCase("si")){
            Consulta_de_secciones cupo = new Consulta_de_secciones();      
        }
    }
}
