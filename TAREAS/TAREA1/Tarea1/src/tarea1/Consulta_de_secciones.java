/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;
import java.util.Scanner;
public class Consulta_de_secciones {
control administrador = new control();
String asignado;
public int repeticiones;
public int asignadosA;
public int asignadosB;
public boolean requisitos;
    public Consulta_de_secciones() {
        do{
        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDO A ASIGNACIÓN DE CURSOS");
        System.out.println("INGRESE NOMBRE DE ESTUDIANTE");
        administrador.usuario[this.repeticiones] = teclado.nextLine();
        System.out.println("INGRESE SU NUMERO DE CARNÉ");
        administrador.carnet[this.repeticiones] = teclado.nextInt();
      //  System.out.println("¿CUENTA CON AL MENOS 34 CREDITOS Y HA APROBADO MATEMATICA BASICA 2?");
      //  String respuesta = teclado.nextLine();
     //   if ("no".equals(respuesta)){
     //      System.out.println("NO PUEDE CURSAR IPC1, PORQUE NO CUMPLE CON LOS PRERREQUISITOS");     
     //   }
      //  if ("si".equals(respuesta)){
             Consultar();
      //      System.out.println("repeticiones = " + repeticiones);
          //  this.repeticiones++;
      //  }
        }while(requisitos==true);
    }

    private void Consultar() {
        Scanner teclado = new Scanner(System.in);
        boolean regresar=false;
       // do{
        System.out.println("Ingrese la sección que desea consultar A o B");
        System.out.println("EN CASO DE QUE AMBAS ESTEN LLENAS SE LE AVISARA AL CONSULTAR EN CUALQUIER SECCION");
        String seccion = teclado.nextLine();
         switch(seccion){   
            case "A":
                System.out.println("Estudiantes asignados en esta seccion = "+ this.asignadosA);
                if(this.asignadosA == 5){
                    System.out.println("cupo lleno hay 5 personas en esta seccion, consulte en la otra seccion");
                    administrador.imprimir_registroA(this.asignadosA);
                }
                 if(0<=this.asignadosA && this.asignadosA< 5){
                    System.out.println("hay " + this.asignadosA + " estudiantes asignados en esta seccion" + ", puede asignarse en esta seccion");
                    System.out.println("¿desea asignarse en esta seccion?");
                    asignado = teclado.nextLine();
                     if(asignado.equalsIgnoreCase("si")){
                         System.out.println("AISGNACION EN SECCION A COMPLETADA");
                       administrador.registrarA(administrador.usuario[this.repeticiones], administrador.carnet[this.repeticiones], this.asignadosA);
                       System.out.println("se registro usuario "+ administrador.usuarioA[this.asignadosA]);
                        System.out.println("se registro carnet " + administrador.carnetA[this.asignadosA]);
                        System.out.println("se registro en posicion " + this.asignadosA);
                         administrador.imprimir_registroA(this.asignadosA);
                         this.asignadosA = this.asignadosA+1;
                         System.out.println("estudiantes asignados en seccion A = "+this.asignadosA);
                         this.repeticiones++;
                         regresar = false;
                         this.requisitos=true;
                         break;
                     }
                     if(asignado.equalsIgnoreCase("no")){
                         regresar = true;
                      }
                 }
                  if(this.asignadosA==5 && asignadosB==5){
                    System.out.println("AMBAS SECCIONES ESTAN LLENAS, intente abrir una nueva seccion para asignarse IPC1");
                    administrador.imprimir_registroA(this.asignadosA);
                    administrador.imprimir_registroB(asignadosB);
                    regresar = false;
                    this.requisitos=false;
                     System.exit(0);
                }
                break;
                
            case "B":
                System.out.println("Estudiantes asignados en esta seccion = "+ asignadosB);
                if(asignadosB == 5){
                    System.out.println("cupo lleno hay 5 personas en esta seccion, consulte en la otra seccion");
                }
                 if(0<=asignadosB && asignadosB< 5){
                   System.out.println("hay " + asignadosB + " estudiantes asignados en esta seccion" + ", puede asignarse en esta seccion");
                   System.out.println("¿desea asignarse en esta seccion?");
                    asignado = teclado.nextLine();
                     if(asignado.equalsIgnoreCase("si")){
                        System.out.println("AISGNACION EN SECCION B COMPLETADA");
                       administrador.registrarB(administrador.usuario[this.repeticiones], administrador.carnet[this.repeticiones], this.asignadosB);
                       System.out.println("se registro usuario "+ administrador.usuarioB[this.asignadosB]);
                        System.out.println("se registro carnet " + administrador.carnetB[this.asignadosB]);
                        System.out.println("se registro en posicion " + this.asignadosB);
                         administrador.imprimir_registroB(this.asignadosB);
                         this.asignadosB = this.asignadosB+1;
                         System.out.println("valor actual de asignados en seccion B = " +this.asignadosB);
                         regresar = false;
                         this.requisitos=true;
                         break;
                     }
                     if(asignado.equalsIgnoreCase("no")){
                          regresar = true;
                      }
                }
                if(this.asignadosA==5 && asignadosB==5){
                    System.out.println("AMBAS SECCIONES ESTAN LLENAS, intente abrir una nueva seccion para asignarse IPC1");
                    administrador.imprimir_registroA(this.asignadosA);
                    administrador.imprimir_registroB(asignadosB);
                    regresar = false;
                    this.requisitos=false;
                     System.exit(0);
                }
                break;
                default : System.out.println("ERROR, no se ingreso ninguna seccion disponible en el sistema");
                regresar=true;
                break;
         }
       // } while(regresar=true);
    }

   
    
}
