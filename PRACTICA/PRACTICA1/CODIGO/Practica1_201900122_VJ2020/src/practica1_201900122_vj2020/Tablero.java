package practica1_201900122_vj2020;
/**
 *
 * @author Steve González 201900122
 */

public class Tablero {
    public int contador_de_barcos[];
    public String[][] tablero;
    public int fila_inicio;
    public int fila_fin;
    public int columna_inicio;
    public int columna_fin;

    public Tablero() {
        this.tablero = new String[10][10];
        this.contador_de_barcos = new int[1];
    }

    public void Limpiar_tablero() {
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                this.tablero[filas][columnas] = " ";
                // System.out.println(filas + "," + columnas +" = " + "vacia" );
            }
        }
        Imprimir_tablero();
    }

    public void Imprimir_tablero() {
        System.out.println("__________________________________________________________");
        System.out.println("[ ] ->[0][1][2][3][4][5][6][7][8][9]");
        for (int num = 0; num < 10; num++) {
            for (int filas = 0; filas < 10; filas++) {
                for (int columnas = 0; columnas < 10; columnas++) {
                    //       
                    if (this.tablero[filas][columnas] == null) {
                        this.tablero[filas][columnas] = " ";
                    }
                    if (filas == 0 && columnas == 0) {
                        num = 0;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 1 && columnas == 0) {
                        num = 1;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 2 && columnas == 0) {
                        num = 2;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 3 && columnas == 0) {
                        num = 3;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 4 && columnas == 0) {
                        num = 4;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 5 && columnas == 0) {
                        num = 5;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 6 && columnas == 0) {
                        num = 6;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 7 && columnas == 0) {
                        num = 7;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 8 && columnas == 0) {
                        num = 8;
                        System.out.print("[" + num + "] ->");
                    } else if (filas == 9 && columnas == 0) {
                        num = 9;
                        System.out.print("[" + num + "] ->");
                    }
                    System.out.print("[" + this.tablero[filas][columnas] + "]");
                }
                System.out.println("");
            }
        }
        System.out.println("__________________________________________________________");
    }

    public void barcos_en_tablero() {
        // int contador_de_barcos;
        int barcos = 0;
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if ("O".equals(this.tablero[filas][columnas])) {
                    barcos = barcos + 1;
                }
            }
        }
        this.contador_de_barcos[0] = barcos;
        System.out.println("hay " + this.contador_de_barcos[0] + "casillas ocupadas en tablero");
    }

    public int barcos_en_accion() {
        // int contador_de_barcos;
        int barcos = 0;
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if ("O".equals(this.tablero[filas][columnas])) {
                    barcos = barcos + 1;
                }
            }
        }
        return barcos;
    }

    public void posiciones_barcos_ingresados() {
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if ("O".equals(this.tablero[filas][columnas])) {
                    System.out.println("se registraron barcos en (" + filas + "," + columnas + ")");
                }
            }
        }
    }

    public int barcos_hundidos() {
        int hundidos = 0;
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if ("X".equals(this.tablero[filas][columnas])) {
                    hundidos = hundidos + 1;
                }
            }
        }
        return hundidos;
    }

    public int le_atinaste(int X, int Y) {
        int barco_hundido = 0;
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if ("O".equals(this.tablero[X][Y])) {
                    this.tablero[X][Y] = "X";
                    barco_hundido = 1;
                }
                if ("$".equals(this.tablero[X][Y])) {
                    this.tablero[X][Y] = "$";
                    barco_hundido = 2;
                } else {
                    barco_hundido = 3;
                }
            }
        }
        return barco_hundido;
    }
}
