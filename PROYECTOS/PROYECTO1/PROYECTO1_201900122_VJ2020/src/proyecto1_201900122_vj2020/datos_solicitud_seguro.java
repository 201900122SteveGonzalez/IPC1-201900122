package proyecto1_201900122_vj2020;

public abstract class datos_solicitud_seguro {
private static int NoUsuario;
private static String DPI;//a
private static String nombres;//b
private static String apellidos;//c
private static String NOMBRE;//d
private static String telefono;//e
private static String tipo;//f
private static String uso;//g
private static String marca;//g
//-------------------------------------------
    private static String linea;
//-------------------------------------------
    private static String modelo;
//-------------------------------------------
    private static String DESCRIPCION;
//-------------------------------------------
    private static String monto;
//-------------------------------------------
    private static String poliza;
//-------------------------------------------
    private static String deducible;
//-------------------------------------------
    private static String[] a;
//-------------------------------------------
    private static String[] b;
//-------------------------------------------
    private static String[] c;
//-------------------------------------------
    private static String[] d;
//-------------------------------------------
    private static String[] e;
//-------------------------------------------
    private static String[] f;
//-------------------------------------------
    private static String[] g;
//-------------------------------------------
    private static String[] h;

public static void colocar_CadenasDeTexto(){
    datos_solicitud_seguro.setDESCRIPCION(datos_solicitud_seguro.getTipo() + "," + datos_solicitud_seguro.getUso() + "," + datos_solicitud_seguro.getMarca() + "," + datos_solicitud_seguro.getLinea() + "," + datos_solicitud_seguro.getModelo());
    
    datos_solicitud_seguro.setNOMBRE(datos_solicitud_seguro.getNombres() + "" + datos_solicitud_seguro.getApellidos());
}   

public static void almacenar_info_solicitud(){
    if(datos_solicitud_seguro.getA()[datos_solicitud_seguro.getNoUsuario()]==null){
       datos_solicitud_seguro.getA()[datos_solicitud_seguro.getNoUsuario()] = datos_solicitud_seguro.getDPI();
       datos_solicitud_seguro.getB()[datos_solicitud_seguro.getNoUsuario()] = datos_solicitud_seguro.getNOMBRE();   
       datos_solicitud_seguro.getC()[datos_solicitud_seguro.getNoUsuario()] = datos_solicitud_seguro.getTelefono();   
       datos_solicitud_seguro.getD()[datos_solicitud_seguro.getNoUsuario()] = datos_solicitud_seguro.getTipo();        
       datos_solicitud_seguro.getE()[datos_solicitud_seguro.getNoUsuario()] = datos_solicitud_seguro.getDESCRIPCION();  
       datos_solicitud_seguro.getF()[datos_solicitud_seguro.getNoUsuario()] = datos_solicitud_seguro.getMonto();  
       datos_solicitud_seguro.getG()[datos_solicitud_seguro.getNoUsuario()] = datos_solicitud_seguro.getPoliza();  
       datos_solicitud_seguro.getH()[datos_solicitud_seguro.getNoUsuario()] = datos_solicitud_seguro.getDeducible();  
    }
    
}

    /**
     * @return the NoUsuario
     */
    public static int getNoUsuario() {
        return NoUsuario;
    }

    /**
     * @param aNoUsuario the NoUsuario to set
     */
    public static void setNoUsuario(int aNoUsuario) {
        NoUsuario = aNoUsuario;
    }

    /**
     * @return the DPI
     */
    public static String getDPI() {
        return DPI;
    }

    /**
     * @param aDPI the DPI to set
     */
    public static void setDPI(String aDPI) {
        DPI = aDPI;
    }

    /**
     * @return the nombres
     */
    public static String getNombres() {
        return nombres;
    }

    /**
     * @param aNombres the nombres to set
     */
    public static void setNombres(String aNombres) {
        nombres = aNombres;
    }

    /**
     * @return the apellidos
     */
    public static String getApellidos() {
        return apellidos;
    }

    /**
     * @param aApellidos the apellidos to set
     */
    public static void setApellidos(String aApellidos) {
        apellidos = aApellidos;
    }

    /**
     * @return the NOMBRE
     */
    public static String getNOMBRE() {
        return NOMBRE;
    }

    /**
     * @param aNOMBRE the NOMBRE to set
     */
    public static void setNOMBRE(String aNOMBRE) {
        NOMBRE = aNOMBRE;
    }

    /**
     * @return the telefono
     */
    public static String getTelefono() {
        return telefono;
    }

    /**
     * @param aTelefono the telefono to set
     */
    public static void setTelefono(String aTelefono) {
        telefono = aTelefono;
    }

    /**
     * @return the tipo
     */
    public static String getTipo() {
        return tipo;
    }

    /**
     * @param aTipo the tipo to set
     */
    public static void setTipo(String aTipo) {
        tipo = aTipo;
    }

    /**
     * @return the uso
     */
    public static String getUso() {
        return uso;
    }

    /**
     * @param aUso the uso to set
     */
    public static void setUso(String aUso) {
        uso = aUso;
    }

    /**
     * @return the marca
     */
    public static String getMarca() {
        return marca;
    }

    /**
     * @param aMarca the marca to set
     */
    public static void setMarca(String aMarca) {
        marca = aMarca;
    }

    /**
     * @return the linea
     */
    public static String getLinea() {
        return linea;
    }

    /**
     * @param aLinea the linea to set
     */
    public static void setLinea(String aLinea) {
        linea = aLinea;
    }

    /**
     * @return the modelo
     */
    public static String getModelo() {
        return modelo;
    }

    /**
     * @param aModelo the modelo to set
     */
    public static void setModelo(String aModelo) {
        modelo = aModelo;
    }

    /**
     * @return the DESCRIPCION
     */
    public static String getDESCRIPCION() {
        return DESCRIPCION;
    }

    /**
     * @param aDESCRIPCION the DESCRIPCION to set
     */
    public static void setDESCRIPCION(String aDESCRIPCION) {
        DESCRIPCION = aDESCRIPCION;
    }

    /**
     * @return the monto
     */
    public static String getMonto() {
        return monto;
    }

    /**
     * @param aMonto the monto to set
     */
    public static void setMonto(String aMonto) {
        monto = aMonto;
    }

    /**
     * @return the poliza
     */
    public static String getPoliza() {
        return poliza;
    }

    /**
     * @param aPoliza the poliza to set
     */
    public static void setPoliza(String aPoliza) {
        poliza = aPoliza;
    }

    /**
     * @return the deducible
     */
    public static String getDeducible() {
        return deducible;
    }

    /**
     * @param aDeducible the deducible to set
     */
    public static void setDeducible(String aDeducible) {
        deducible = aDeducible;
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
