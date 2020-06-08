package practica1_201900122_vj2020;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Steve González 201900122
 */

public class Menu {
    Barcos barco = new Barcos();
    public int status[] = new int[4];
    public static int cantidad;
    public boolean salir;
    public boolean salir2;
    public boolean salir3;
    public boolean seguir_jugando;
    public String coordenadas;
    public int PortaAviones;
    public int submarinos;
    public int destructores;
    public int fragatas;
    public int huevo_de_pascua;
    public int intentos = 10;
    public String nickname;
    public int numero_de_jugador;
    Tablero tablero = new Tablero();
    usuarios historial = new usuarios();
    public int total_barcos_en_tablero;

    public Menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n\n\n");
            System.out.println("############## MENU PRINCIPAL ##############");
            System.out.println("## 1) CREAR TABLERO ##");
            System.out.println("## 2) REPORTE COMPLETO ##");
            System.out.println("## 3) REPORTE VICTORIAS ##");
            System.out.println("## 4) SALIR ##");
            System.out.print("escriba el numero de opcion a la que desea ingresar: \n");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    MENU_TABLERO();
                    historial.almacenar_intentos(10);
                    break;
                case 2:
                    REPORTE_COMPLETO();
                    break;
                case 3:
                    REPORTE_VICTORIAS();
                    break;
                case 4:
                    this.salir = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 4");
                    this.salir = false;
            }
        } while (this.salir == false);
    }

    private void REPORTE_COMPLETO() {
        historial.imprimir_reporte_completo();
    }

    private void REPORTE_VICTORIAS() {
        // con ordenamiento de burbuja muestra el listado de los usuarios que ganaron
        // su partida, serán ordenados de menor a mayor según la cantidad de intentos que
        // necesitaron para ganar la partida.
    }

    private void MENU_TABLERO() {
        Scanner teclado = new Scanner(System.in);
        //el tablero por defecto es de 10x10
        int opcion2;
        do {
            System.out.println("\n\n\n");
            System.out.println("############## MENU TABLERO ##############");
            System.out.println("## 1) INGRESAR BARCOS ##");
            System.out.println("## 2) CAMBIAR CANTIDAD DE INTENTOS ##");
            System.out.println("## 3) INICIAR JUEGO ##");
            System.out.println("## 4) VISUALIZAR EL TABLERO  ##");
            System.out.println("## 5) REINICIAR TABLERO ##");
            System.out.println("## 6) REGRESAR AL MENU PRINCIPAL ##");
            System.out.print("escriba el numero de opcion a la que desea ingresar: \n");
            opcion2 = teclado.nextInt();
            switch (opcion2) {
                case 1:
                    MENU_BARCOS();
                    break;
                case 2:
                    CAMBIAR_CANTIDAD_DE_INTENTOS();
                    break;
                case 3:
                    INICIAR_JUEGO();
                    break;
                case 4:
                    VISUALIZAR_EL_TABLERO();
                    break;
                case 5:
                    REINICIAR_TABLERO();
                    break;
                case 6:
                    this.salir = false;
                    this.salir2 = true;
                    break;
                default:
                    System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 6");
                    this.salir2 = false;
            }
        } while (this.salir2 == false);
    }

    private void CAMBIAR_CANTIDAD_DE_INTENTOS() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("por defecto tiene " + this.intentos + " intentos");
        System.out.println("¿desea cambiar el numero de intentos?");
        String respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("no")) {
            this.status[3] = 10;
            MENU_TABLERO();
        }
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("ingrese la nueva cantidad: ");

            this.status[3] = teclado.nextInt();
            Menu.cantidad = this.status[3];
            this.intentos = this.status[3];
            historial.almacenar_intentos(this.status[3]);
            System.out.println("ahora cuenta con " + this.intentos + " intentos");
            MENU_TABLERO();
        }
    }

    private void INICIAR_JUEGO() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE SU NICKNAME: ");
        historial.almacenar_numero_usuario(numero_de_jugador);
        this.nickname = teclado.nextLine();
        historial.almacenar_nickname(this.nickname);
        do {
            if (tablero.contador_de_barcos[0] == 21) {
                System.out.println("INGRESE EL NUMERO DE OPCION A REALIZAR");
                System.out.println("1). Lanzar misil");
                System.out.println("2). Terminar partida");
                int opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        LANZAR_MISIL();
                        break;
                    case 2:
                        TERMINAR_PARTIDA();
                        break;
                    default:
                        System.out.println("error, no ingreso ninguna opcion para jugar");
                        this.seguir_jugando = false;
                        break;
                }
            } else {
                System.out.println("Error, no ha llenado el tablero de barcos y/o no ha ingresado el Easter Egg");
                System.out.println("### BARCOS INGRESADOS: ###");
                System.out.println("PORTAAVIONES : " + this.PortaAviones + "/1");
                System.out.println("SUBMARINOS : " + this.submarinos + "/3");
                System.out.println("DESTRUCTORES :" + this.destructores + "/3");
                System.out.println("FRAGATAS : " + this.submarinos + "/2");
                System.out.println("Easter Egg : " + this.huevo_de_pascua + "/1");
                tablero.Imprimir_tablero();
                MENU_TABLERO();
            }
        } while (this.seguir_jugando = false);
    }

    private void LANZAR_MISIL() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("tiene " + this.intentos + "misiles");
        while (this.intentos > 0) {
            System.out.println("ingrese las coordenadas para lanzar el misil con el formato (#,#)");
            String destructor = teclado.nextLine();
            barco.Obtener_coordenadas_misil(destructor);
            EASTER_EGG();
            int destruido = tablero.le_atinaste(barco.bitacora[8], barco.bitacora[9]);
            switch (destruido) {
                case 1:
                    System.out.println("le atinaste");
                    System.out.println("destruiste el barco en (" + barco.bitacora[8] + "," + barco.bitacora[9] + ")");
                    this.intentos--;
                    this.status[0] = tablero.barcos_hundidos();
                    this.status[1] = tablero.barcos_en_accion();
                    this.status[2] = this.intentos;
                    Actualizar(this.status[0], this.status[1], this.status[2], Menu.cantidad);
                    System.out.println("Presione enter para continuar");
                    break;
                case 2:
                    System.out.println("le atinaste al EASTER EGG");
                    System.out.println("ubicado en en (" + barco.bitacora[8] + "," + barco.bitacora[9] + ")");
                    this.intentos--;
                    this.status[0] = tablero.barcos_hundidos();
                    this.status[1] = tablero.barcos_en_accion();
                    this.status[2] = this.intentos;
                    Actualizar(this.status[0], this.status[1], this.status[2], Menu.cantidad);
                    System.out.println("201900122 Herbert Steve González Camey");
                    System.out.println("Presione enter para continuar");
                    break;
                case 3:
                    this.intentos--;
                    this.status[0] = tablero.barcos_hundidos();
                    this.status[1] = tablero.barcos_en_accion();
                    this.status[2] = this.intentos;
                    Actualizar(this.status[0], this.status[1], this.status[2], 10);
                    System.out.println("Presione enter para continuar");
                    break;
            }
        }
        if (this.intentos == 0) {
            ////registrar barcos hundidos
            historial.almacenar_barcos_hundidos(tablero.barcos_hundidos());
            if (historial.REGISTRO[3] == historial.REGISTRO[4]) {
                historial.REGISTRO[2] = "GANO";
                System.out.println("Gano la partida " + historial.REGISTRO[1]);
                historial.registrar_info_usuario();
                historial.imprimir_info_ultimo_usuario();
                this.numero_de_jugador++;
                this.salir = false; //reinicio del juego
            } else {
                historial.REGISTRO[2] = "PERDIO";
                System.out.println("Perdio la partida " + historial.REGISTRO[1]);
                historial.registrar_info_usuario();
                historial.imprimir_info_ultimo_usuario();
                this.numero_de_jugador++;
                this.salir = false; //reinicio del juego
            }
        }

    }

    private void EASTER_EGG() {
        if (barco.bitacora[8] == barco.bitacora[6] && barco.bitacora[9] == barco.bitacora[7]) {
            tablero.tablero[6][7] = "$";
        }
    }

    private void TERMINAR_PARTIDA() {
        historial.almacenar_estado("ABANDONO");
        System.out.println("Adios " + historial.REGISTRO[1]);
        historial.registrar_info_usuario();
        historial.imprimir_info_ultimo_usuario();
        this.numero_de_jugador++;
        this.salir = false; //reinicio del juego
    }

    private void VISUALIZAR_EL_TABLERO() {
        tablero.Imprimir_tablero();
    }

    private void REINICIAR_TABLERO() {
        tablero.Limpiar_tablero();
        tablero.Imprimir_tablero();
    }

    private void MENU_BARCOS() {
        Scanner teclado = new Scanner(System.in);
        int opcion3;
        do {
            System.out.println("\n\n\n\n\n\n");
            System.out.println("############## MENU BARCOS #############");
            System.out.println("## 1) INSERTAR PORTAAVIONES ##");
            System.out.println("## 2) INSERTAR SUBMARINOS ##");
            System.out.println("## 3) INSERTAR DESTRUCTORES ##");
            System.out.println("## 4) INSERTAR FRAGATAS ##");
            System.out.println("## 5) INSERTAR EASTER EGG ##");
            System.out.print("escriba el numero de opcion a la que desea ingresar: \n");
            opcion3 = teclado.nextInt();
            switch (opcion3) {
                case 1:
                    INSERTAR_PORTAAVIONES();
                    break;
                case 2:
                    INSERTAR_SUBMARINOS();
                    break;
                case 3:
                    INSERTAR_DESTRUCTORES();
                    break;
                case 4:
                    INSERTAR_FRAGATAS();
                    break;
                case 5:
                    INSERTAR_EASTER_EGG();
                    break;
                default:
                    System.out.println("ERROR, porfavor ingrese un numero entero del 1 al 5");
                    salir3 = false;
            }
        } while (salir3 == false);
    }

    private void INSERTAR_PORTAAVIONES() {
        Scanner teclado = new Scanner(System.in);
        if (this.PortaAviones == 0) {
            System.out.println("Ingrese las coordenadas del PORTAAVIONES con el siguiente formato: '(FilaInicio,ColumnaInicio)- (FilaFin,ColumnaFin)' ");
            this.coordenadas = teclado.nextLine();
            barco.Obtener_coordenadas(this.coordenadas);
            if (barco.bitacora[2] - barco.bitacora[0] == 0 && barco.bitacora[3] - barco.bitacora[1] == 3) {
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1] + 1] = "O";
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1] + 2] = "O";
                tablero.tablero[barco.bitacora[2]][barco.bitacora[3]] = "O";
                this.PortaAviones++;
            }
            if (barco.bitacora[2] - barco.bitacora[0] == 3 && barco.bitacora[3] - barco.bitacora[1] == 0) {
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[0] + 1][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[0] + 2][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[2]][barco.bitacora[3]] = "O";
                this.PortaAviones++;
            }
            if (barco.bitacora[0] < 0 || barco.bitacora[2] > 9 || barco.bitacora[1] < 0 || barco.bitacora[3] > 9) {
                System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
            }
            tablero.barcos_en_tablero();
            tablero.posiciones_barcos_ingresados();
            if (tablero.contador_de_barcos[0] == 21) {
                tablero.Imprimir_tablero();
                System.out.println("ha llenado el tablero de juego");
                MENU_TABLERO();
            } else {
                System.out.println("tablero actual");
                tablero.Imprimir_tablero();
                MENU_BARCOS();
            }
        } else {
            System.out.println("ya ingreso" + this.PortaAviones + " portaaviones");
            MENU_BARCOS();
        }
    }

    private void INSERTAR_SUBMARINOS() {
        Scanner teclado = new Scanner(System.in);
        if (this.submarinos <= 2) {
            System.out.println("Ingrese las coordenadas de los 3 SUBMARINOS con el siguiente formato: '(FilaInicio,ColumnaInicio)- (FilaFin,ColumnaFin)' ");
            this.coordenadas = teclado.nextLine();
            barco.Obtener_coordenadas(this.coordenadas);
            if (barco.bitacora[2] - barco.bitacora[0] == 0 && barco.bitacora[3] - barco.bitacora[1] == 2) {
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1] + 1] = "O";
                tablero.tablero[barco.bitacora[2]][barco.bitacora[3]] = "O";
                this.submarinos++;
            }
            if (barco.bitacora[2] - barco.bitacora[0] == 2 && barco.bitacora[3] - barco.bitacora[1] == 0) {
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[0] + 1][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[2]][barco.bitacora[3]] = "O";
                this.submarinos++;
            }
            if (barco.bitacora[0] < 0 || barco.bitacora[2] > 9 || barco.bitacora[1] < 0 || barco.bitacora[3] > 9) {
                System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
            }
            tablero.barcos_en_tablero();
            tablero.posiciones_barcos_ingresados();
            if (tablero.contador_de_barcos[0] == 21) {
                tablero.Imprimir_tablero();
                System.out.println("ha llenado el tablero de juego");
                MENU_TABLERO();
            } else {
                System.out.println("tablero actual");
                tablero.Imprimir_tablero();
                MENU_BARCOS();
            }
        } else {
            System.out.println("ya ingreso " + this.submarinos + " submarinos");
            MENU_BARCOS();
        }
    }

    private void INSERTAR_DESTRUCTORES() {
        Scanner teclado = new Scanner(System.in);
        if (this.destructores <= 2) {
            System.out.println("Ingrese las coordenadas de los 3 DESTRUCTORES con el siguiente formato: '(FilaInicio,ColumnaInicio)- (FilaFin,ColumnaFin)' ");
            this.coordenadas = teclado.nextLine();
            barco.Obtener_coordenadas(this.coordenadas);
            barco.Obtener_coordenadas(this.coordenadas);
            if (barco.bitacora[2] - barco.bitacora[0] == 0 && barco.bitacora[3] - barco.bitacora[1] == 1) {
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[2]][barco.bitacora[3]] = "O";
                this.destructores++;
            }
            if (barco.bitacora[2] - barco.bitacora[0] == 1 && barco.bitacora[3] - barco.bitacora[1] == 0) {
                tablero.tablero[barco.bitacora[0]][barco.bitacora[1]] = "O";
                tablero.tablero[barco.bitacora[2]][barco.bitacora[3]] = "O";
                this.destructores++;
            }
            if (barco.bitacora[0] < 0 || barco.bitacora[2] > 9 || barco.bitacora[1] < 0 || barco.bitacora[3] > 9) {
                System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
                barco.Eliminar_coordenadas();
                MENU_BARCOS();
            }
            tablero.barcos_en_tablero();
            tablero.posiciones_barcos_ingresados();
            if (tablero.contador_de_barcos[0] == 21) {
                System.out.println("ha llenado el tablero de juego");
                MENU_TABLERO();
                tablero.Imprimir_tablero();
            } else {
                System.out.println("tablero actual");
                tablero.Imprimir_tablero();
                MENU_BARCOS();
            }
        } else {
            System.out.println("ya ingreso " + this.destructores + " destructores");
            MENU_BARCOS();
        }
    }

    private void INSERTAR_FRAGATAS() {
        Scanner teclado = new Scanner(System.in);
        if (this.fragatas <= 1) {
            System.out.println("Ingrese las coordenadas de las 2 FRAGATAS con el siguiente formato: '(Fila,Columna)' ");
            this.coordenadas = teclado.nextLine();
            barco.Obtener_coordenadas_simples(this.coordenadas);
            if (barco.bitacora[4] < 0 || barco.bitacora[4] > 9 || barco.bitacora[5] < 0 || barco.bitacora[5] > 9) {
                System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
                barco.Eliminar_coordenadas();
            } else {
                tablero.tablero[barco.bitacora[4]][barco.bitacora[5]] = "O";
                this.fragatas++;
            }
            tablero.barcos_en_tablero();
            tablero.posiciones_barcos_ingresados();
            if (tablero.contador_de_barcos[0] == 21) {
                tablero.Imprimir_tablero();
                System.out.println("ha llenado el tablero de juego");
                MENU_TABLERO();
            } else {
                System.out.println("tablero actual");
                tablero.Imprimir_tablero();
                MENU_BARCOS();
            }
        } else {
            System.out.println("ya ingreso " + this.fragatas + " fragatas");
            MENU_BARCOS();
        }
    }

    private void INSERTAR_EASTER_EGG() {
        Scanner teclado = new Scanner(System.in);
        if (this.huevo_de_pascua == 0) {
            System.out.println("Ingrese las coordenadas del Easter Egg con el siguiente formato: '(Fila,Columna)' ");
            this.coordenadas = teclado.nextLine();
            barco.Guardar_coordenadas_EasterEgg(this.coordenadas);
            if (barco.bitacora[6] < 0 || barco.bitacora[6] > 9 || barco.bitacora[7] < 0 || barco.bitacora[7] > 9) {
                System.out.println("ERROR, ingreso mal las coordenadas las cuales no coindicen con el tamaño del tablero");
                barco.Eliminar_coordenadas();
                MENU_BARCOS();
            } else {
                tablero.barcos_en_tablero();
                System.out.println("Easter Egg guardado en : (" + barco.bitacora[6] + "," + barco.bitacora[7] + ")");
                tablero.posiciones_barcos_ingresados();
                this.huevo_de_pascua++;
            }
        } else {
            System.out.println("ya ingreso " + this.huevo_de_pascua + " Easter Egg");
        }
    }

    private void Imprimir_tiempo() {
        Date tiempo = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: " + hourdateFormat.format(tiempo));
    }

    private void Actualizar(int hundidos, int en_accion, int realizados, int total) {
        System.out.println("__________________________________________________________");
        Imprimir_tiempo();
        System.out.println("");
        System.out.println("Barcos:");
        System.out.println("          " + hundidos + "/21 " + "Hundidos");
        System.out.println("          " + en_accion + "/21 " + "En Accion");
        System.out.println("Intentos:");
        System.out.println("          " + 1 + realizados + "/" + total + " realizados");
        System.out.println("          " + (total - realizados) + "/" + total + " restantes");
        tablero.Imprimir_tablero();
        INICIAR_JUEGO();
    }
}
