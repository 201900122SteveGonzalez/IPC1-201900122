package vj_ipc1_ht1;
import java.util.Scanner;
public class Consulta_de_secciones {
Scanner teclado = new Scanner(System.in);
int asignadosA = 15;
int asignadosB = 10;
String asignado;
    public Consulta_de_secciones() {
        boolean regresar;
        do{
        System.out.println("Ingrese la sección que desea consultar A o B");
        System.out.println("EN CASO DE QUE AMBAS ESTEN LLENAS SE LE AVISARA AL CONSULTAR EN CUALQUIER SECCION");
        String seccion = teclado.nextLine();
         switch(seccion){
             
            case "A":
                System.out.println("Estudiantes asignados en esta seccion = "+ asignadosA);
                if(asignadosA == 15){
                    System.out.println("cupo lleno hay 15 personas en esta seccion, consulte en la otra seccion");
                }
                 if(0<=asignadosA && asignadosA< 15){
                    System.out.println("hay " + asignadosA + " estudiantes asignados en esta seccion" + ", puede asignarse en esta seccion");
                    System.out.println("¿desea asignarse en esta seccion?");
                    asignado = teclado.nextLine();
                     if(asignado.equalsIgnoreCase("si")){
                         System.out.println("AISGNACION EN SECCION A COMPLETADA");
                          regresar = false;
                          System.exit(0);
                      }
                     if(asignado.equalsIgnoreCase("no")){
                         regresar = true;
                      }
                 }
                  if(asignadosA==15 && asignadosB==15){
                    System.out.println("AMBAS SECCIONES ESTAN LLENAS, intente abrir una nueva seccion para asignarse IPC1");
                     System.exit(0);
                }
                break;
                
            case "B":
                System.out.println("Estudiantes asignados en esta seccion = "+ asignadosB);
                if(asignadosB == 15){
                    System.out.println("cupo lleno hay 15 personas en esta seccion, consulte en la otra seccion");
                }
                 if(0<=asignadosB && asignadosB< 15){
                   System.out.println("hay " + asignadosB + " estudiantes asignados en esta seccion" + ", puede asignarse en esta seccion");
                   System.out.println("¿desea asignarse en esta seccion?");
                    asignado = teclado.nextLine();
                     if(asignado.equalsIgnoreCase("si")){
                         System.out.println("AISGNACION EN SECCION B COMPLETADA");
                          regresar = false;
                          System.exit(0);
                      }
                     if(asignado.equalsIgnoreCase("no")){
                          regresar = true;
                      }
                }
                 if(asignadosA==15 && asignadosB==15){
                    System.out.println("AMBAS SECCIONES ESTAN LLENAS, intente abrir una nueva seccion para asignarse IPC1");
                }
                break;
                default : System.out.println("ERROR, no se ingreso ninguna seccion disponible en el sistema");
         break;
         }
        } while(regresar=true);
    }
}