/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201900122_vj2020;

/**
 *
 * @author USUARIO
 */
public abstract class datos_asegurado {

    private static int posicion_referecia;
    private static int contador_Aprobados;
    public static String dpi_ingresado;
    private static String DPI[];
    private static String NOMBRE[];
    private static String TELEFONO[];
    private static String TIPO[];
    private static String DESCRIPCION[];
    private static String MONTO[];
    private static String POLIZA[];
    private static String DEDUCIBLE[];

    public datos_asegurado() {
        datos_asegurado.DEDUCIBLE = new String[100];
        datos_asegurado.DESCRIPCION = new String[100];
        datos_asegurado.DPI = new String[100];
        datos_asegurado.MONTO = new String[100];
        datos_asegurado.NOMBRE = new String[100];
        datos_asegurado.POLIZA = new String[100];
        datos_asegurado.TELEFONO = new String[100];
        datos_asegurado.TIPO = new String[100];
    }

    public static void almacenar(String DPI, String NOMBRE, String TELEFONO, String TIPO, String DESCRIPCION, String MONTO, String POLIZA, String DEDUCIBLE) {
        datos_asegurado.getDPI()[datos_asegurado.getContador_Aprobados()] = DPI;
        datos_asegurado.getNOMBRE()[datos_asegurado.getContador_Aprobados()] = NOMBRE;
        datos_asegurado.getTELEFONO()[datos_asegurado.getContador_Aprobados()] = TELEFONO;
        datos_asegurado.getTIPO()[datos_asegurado.getContador_Aprobados()] = TIPO;
        datos_asegurado.getDESCRIPCION()[datos_asegurado.getContador_Aprobados()] = DESCRIPCION;
        datos_asegurado.getMONTO()[datos_asegurado.getContador_Aprobados()] = MONTO;
        datos_asegurado.getPOLIZA()[datos_asegurado.getContador_Aprobados()] = POLIZA;
        datos_asegurado.getDEDUCIBLE()[datos_asegurado.getContador_Aprobados()] = DEDUCIBLE;
    }

    public static void imprimir_almacenados() {
        for (int i = 0; i < datos_asegurado.getContador_Aprobados(); i++) {
            if (getDPI()[i] != null) {
                System.out.println("SEGURO APROBADO");
                System.out.println("datos guardados en posicion: " + i);
                System.out.println("DPI: " + datos_asegurado.getDPI()[i]);
                System.out.println("HOMBRE: " + datos_asegurado.getNOMBRE()[i]);
                System.out.println("TELEFONO: " + datos_asegurado.getTELEFONO()[i]);
                System.out.println("TIPO: " + datos_asegurado.getTIPO()[i]);
                System.out.println("DESCRIPCION: " + datos_asegurado.getDESCRIPCION()[i]);
                System.out.println("MONTO: " + datos_asegurado.getMONTO()[i]);
                System.out.println("POLIZA: " + datos_asegurado.getPOLIZA()[i]);
                System.out.println("DEDUCIBLE: " + datos_asegurado.getDEDUCIBLE()[i]);
                System.out.println("DPI: " + datos_asegurado.getDPI()[i]);
            }
        }
    }

    public static String getDpi_ingresado() {
        return dpi_ingresado;
    }

    public static void setDpi_ingresado(String DPI_INGRESADO) {
        dpi_ingresado = DPI_INGRESADO;
    }

    public static int getPosicion_Referencia() {
        return posicion_referecia;
    }

    public static void setPosicion_Referencia(int aPosicion_Referencia) {
        posicion_referecia = aPosicion_Referencia;
    }

    /**
     * @return the contador_Aprobados
     */
    public static int getContador_Aprobados() {
        return contador_Aprobados;
    }

    /**
     * @param aContador_Aprobados the contador_Aprobados to set
     */
    public static void setContador_Aprobados(int aContador_Aprobados) {
        contador_Aprobados = aContador_Aprobados;
    }

    /**
     * @return the DPI
     */
    public static String[] getDPI() {
        return DPI;
    }

    /**
     * @param aDPI the DPI to set
     */
    public static void setDPI(String[] aDPI) {
        DPI = aDPI;
    }

    /**
     * @return the NOMBRE
     */
    public static String[] getNOMBRE() {
        return NOMBRE;
    }

    /**
     * @param aNOMBRE the NOMBRE to set
     */
    public static void setNOMBRE(String[] aNOMBRE) {
        NOMBRE = aNOMBRE;
    }

    /**
     * @return the TELEFONO
     */
    public static String[] getTELEFONO() {
        return TELEFONO;
    }

    /**
     * @param aTELEFONO the TELEFONO to set
     */
    public static void setTELEFONO(String[] aTELEFONO) {
        TELEFONO = aTELEFONO;
    }

    /**
     * @return the TIPO
     */
    public static String[] getTIPO() {
        return TIPO;
    }

    /**
     * @param aTIPO the TIPO to set
     */
    public static void setTIPO(String[] aTIPO) {
        TIPO = aTIPO;
    }

    /**
     * @return the DESCRIPCION
     */
    public static String[] getDESCRIPCION() {
        return DESCRIPCION;
    }

    /**
     * @param aDESCRIPCION the DESCRIPCION to set
     */
    public static void setDESCRIPCION(String[] aDESCRIPCION) {
        DESCRIPCION = aDESCRIPCION;
    }

    /**
     * @return the MONTO
     */
    public static String[] getMONTO() {
        return MONTO;
    }

    /**
     * @param aMONTO the MONTO to set
     */
    public static void setMONTO(String[] aMONTO) {
        MONTO = aMONTO;
    }

    /**
     * @return the POLIZA
     */
    public static String[] getPOLIZA() {
        return POLIZA;
    }

    /**
     * @param aPOLIZA the POLIZA to set
     */
    public static void setPOLIZA(String[] aPOLIZA) {
        POLIZA = aPOLIZA;
    }

    /**
     * @return the DEDUCIBLE
     */
    public static String[] getDEDUCIBLE() {
        return DEDUCIBLE;
    }

    /**
     * @param aDEDUCIBLE the DEDUCIBLE to set
     */
    public static void setDEDUCIBLE(String[] aDEDUCIBLE) {
        DEDUCIBLE = aDEDUCIBLE;
    }

}
