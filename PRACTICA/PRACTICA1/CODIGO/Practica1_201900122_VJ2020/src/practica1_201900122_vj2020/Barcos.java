package practica1_201900122_vj2020;

/**
 *
 * @author Steve González 201900122
 */

public class Barcos {

    public int bitacora[];
    Tablero campo = new Tablero();

    public Barcos() {
        this.bitacora = new int[10];
    }

    public void Obtener_coordenadas(String ubicacion) {
        this.bitacora[0] = Character.getNumericValue(ubicacion.charAt(1));
        this.bitacora[1] = Character.getNumericValue(ubicacion.charAt(3));
        this.bitacora[2] = Character.getNumericValue(ubicacion.charAt(7));
        this.bitacora[3] = Character.getNumericValue(ubicacion.charAt(9));
        // this.bitacora[0] = fila inicio
        // this.bitacora[1]  =  columna inicio
        // this.bitacora[2]  =  fila fin
        // this.bitacora[3]  =  columna fin
    }

    public void Obtener_coordenadas_simples(String ubicacion) {
        this.bitacora[4] = Character.getNumericValue(ubicacion.charAt(1));
        this.bitacora[5] = Character.getNumericValue(ubicacion.charAt(3));
        // this.bitacora[4]  =  fila 
        // this.bitacora[5]  =  columna
    }

    public void Guardar_coordenadas_EasterEgg(String ubicacion) {
        this.bitacora[6] = Character.getNumericValue(ubicacion.charAt(1));
        this.bitacora[7] = Character.getNumericValue(ubicacion.charAt(3));
        // this.bitacora[6]  =  fila Easter Egg
        // this.bitacora[7]  =  columna Easter Egg
    }

    /**
     *
     * @param ubicacion
     */
    public void Obtener_coordenadas_misil(String ubicacion) {
        this.bitacora[8] = Character.getNumericValue(ubicacion.charAt(1));
        this.bitacora[9] = Character.getNumericValue(ubicacion.charAt(3));
        // this.bitacora[8]  =  fila misil
        // this.bitacora[9]  =  columna misil
    }

    public void Eliminar_coordenadas() {
        for (int i = 0; i < 8; i++) {
            this.bitacora[i] = (int) new Object();
            // limpia el arreglo donde se guardan momentaneamente las coordenadas
        }
    }

}
