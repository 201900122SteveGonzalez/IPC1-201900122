package proyecto1_201900122_vj2020;

public abstract class datos_solicitud_seguro {

    private static int NoSolicitud;
    private static String a[];//DPI
//-------------------------------------------
    private static String b[];//NOMBRE
//-------------------------------------------
    private static String c[];//TELEFONO
//-------------------------------------------
    private static String d[];//TIPO
//-------------------------------------------
    private static String e[];//DESCRIPCION
//-------------------------------------------
    private static String f[];//MONTO
//-------------------------------------------
    private static String g[];//POLIZA
//-------------------------------------------
    private static String h[];//DEDUCIBLE

    public datos_solicitud_seguro() {
        datos_solicitud_seguro.a = new String[20];
        //    datos_solicitud_seguro.a [0]= "HELLO";
        datos_solicitud_seguro.b = new String[20];
        datos_solicitud_seguro.c = new String[20];
        datos_solicitud_seguro.d = new String[20];
        datos_solicitud_seguro.e = new String[20];
        datos_solicitud_seguro.f = new String[20];
        datos_solicitud_seguro.g = new String[20];
        datos_solicitud_seguro.h = new String[20];
    }

    public static void eliminar_datos(int i) {
        datos_solicitud_seguro.a[i] = null;
        datos_solicitud_seguro.b[i] = null;
        datos_solicitud_seguro.c[i] = null;
        datos_solicitud_seguro.d[i] = null;
        datos_solicitud_seguro.e[i] = null;
        datos_solicitud_seguro.f[i] = null;
        datos_solicitud_seguro.g[i] = null;
        datos_solicitud_seguro.h[i] = null;
    }

    public static void almacenar_info_solicitud(String DPI, String NOMBRE, String TELEFONO, String TIPO, String DESCRIPCION, String MONTO, String POLIZA, String DEDUCIBLE) {
        if (datos_solicitud_seguro.getA()[datos_solicitud_seguro.getNoSolicitud()] == null) {
            datos_solicitud_seguro.getA()[datos_solicitud_seguro.getNoSolicitud()] = DPI;
            datos_solicitud_seguro.getB()[datos_solicitud_seguro.getNoSolicitud()] = NOMBRE;
            datos_solicitud_seguro.getC()[datos_solicitud_seguro.getNoSolicitud()] = TELEFONO;
            datos_solicitud_seguro.getD()[datos_solicitud_seguro.getNoSolicitud()] = TIPO;
            datos_solicitud_seguro.getE()[datos_solicitud_seguro.getNoSolicitud()] = DESCRIPCION;
            datos_solicitud_seguro.getF()[datos_solicitud_seguro.getNoSolicitud()] = MONTO;
            datos_solicitud_seguro.getG()[datos_solicitud_seguro.getNoSolicitud()] = POLIZA;
            datos_solicitud_seguro.getH()[datos_solicitud_seguro.getNoSolicitud()] = DEDUCIBLE;
        }

    }

    /**
     * @return the NoSolicitud
     */
    public static int getNoSolicitud() {
        return NoSolicitud;
    }

    /**
     * @param aNoUsuario the NoSolicitud to set
     */
    public static void setNoSolicitud(int aNoUsuario) {
        NoSolicitud = aNoUsuario;
    }

    /**
     * @return the a
     */
    public static String[] getA() {
        return a;
    }

    /**
     * @param aA the a to set
     */
    public static void setA(String[] aA) {
        a = aA;
    }

    /**
     * @return the b
     */
    public static String[] getB() {
        return b;
    }

    /**
     * @param aB the b to set
     */
    public static void setB(String[] aB) {
        b = aB;
    }

    /**
     * @return the c
     */
    public static String[] getC() {
        return c;
    }

    /**
     * @param aC the c to set
     */
    public static void setC(String[] aC) {
        c = aC;
    }

    /**
     * @return the d
     */
    public static String[] getD() {
        return d;
    }

    /**
     * @param aD the d to set
     */
    public static void setD(String[] aD) {
        d = aD;
    }

    /**
     * @return the e
     */
    public static String[] getE() {
        return e;
    }

    /**
     * @param aE the e to set
     */
    public static void setE(String[] aE) {
        e = aE;
    }

    /**
     * @return the f
     */
    public static String[] getF() {
        return f;
    }

    /**
     * @param aF the f to set
     */
    public static void setF(String[] aF) {
        f = aF;
    }

    /**
     * @return the g
     */
    public static String[] getG() {
        return g;
    }

    /**
     * @param aG the g to set
     */
    public static void setG(String[] aG) {
        g = aG;
    }

    /**
     * @return the h
     */
    public static String[] getH() {
        return h;
    }

    /**
     * @param aH the h to set
     */
    public static void setH(String[] aH) {
        h = aH;
    }
}
