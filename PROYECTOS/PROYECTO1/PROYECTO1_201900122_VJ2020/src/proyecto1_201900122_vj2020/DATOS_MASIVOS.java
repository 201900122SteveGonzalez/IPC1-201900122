package proyecto1_201900122_vj2020;
/**
 *
 * @author Steve González
 */

public abstract class DATOS_MASIVOS { 
    /**
     *
     */
private static int posicion_tipo;
private static String Tipo_nombre [];
private static String Tipo_valorMaximo [];
//---------------------------------
private static  int posicion_modelo;
private static String  Modelo_año [];
private static String Modelo_porentaje_depreciacion [];
//-------------------------------------------
private static int posicion_marca;
private static String Marca_nombre [];
private static String Marca_porcentaje_aumento_de_poliza[];
//----------------------------------------------
private static int posicion_linea;
private static String Linea_nombre [];
private static String Linea_porcentaje_aumento_de_poliza[];
//----------------------------------------------
private static int posicion_uso;
private static String Uso_nombre [];
private static String Uso_porcentaje_aumento_de_poliza[];
//----------------------------------------------
private static int posicion_mecanica;
private static String Mecanica_nombre_actividad [];
private static double Mecanica_precio[];
//----------------------------------------------
private static int posicion_repuesto;
private static String Repuesto_nombre [];
private static double Repuesto_precio[];

    public DATOS_MASIVOS() {
        DATOS_MASIVOS.Tipo_nombre = new String [100];
        DATOS_MASIVOS.Tipo_valorMaximo = new String [100];
        DATOS_MASIVOS.Modelo_año = new String [100];
        DATOS_MASIVOS.Modelo_porentaje_depreciacion = new String [100];
        DATOS_MASIVOS.Marca_nombre = new String [100];
        DATOS_MASIVOS.Marca_porcentaje_aumento_de_poliza = new String [100];
        DATOS_MASIVOS.Linea_nombre = new String [100];
        DATOS_MASIVOS.Linea_porcentaje_aumento_de_poliza = new String [100];
        DATOS_MASIVOS.Uso_nombre = new String [100];
        DATOS_MASIVOS.Uso_porcentaje_aumento_de_poliza = new String [100];
        DATOS_MASIVOS.Mecanica_nombre_actividad = new String [100];
        DATOS_MASIVOS.Mecanica_precio = new double [100];
        DATOS_MASIVOS.Repuesto_nombre= new String [100];
        DATOS_MASIVOS.Repuesto_precio = new double [100];
    }
    
   public static void guardar_tipo(String nombre, String valor_maximo_a_asegurar){
       if(DATOS_MASIVOS.Tipo_nombre[posicion_tipo]==null){
     DATOS_MASIVOS.getTipo_nombre()[DATOS_MASIVOS.getPosicion_tipo()] = nombre;
     DATOS_MASIVOS.getTipo_valorMaximo()[DATOS_MASIVOS.getPosicion_tipo()] = valor_maximo_a_asegurar; 
          System.out.println("se registro EN TIPO nombre de: "+DATOS_MASIVOS.getTipo_nombre()[DATOS_MASIVOS.getPosicion_tipo()]+ " en: "+DATOS_MASIVOS.getPosicion_tipo());
               System.out.println("se registro EN TIPO porcentaje de depreciacion: "+DATOS_MASIVOS.getTipo_valorMaximo()[DATOS_MASIVOS.getPosicion_tipo()]+" en:"+DATOS_MASIVOS.getPosicion_tipo());     
       }
       }
   
   public static void guardar_modelo(String Modelo_año, String Modelo_porentaje_depreciacion){
        if(DATOS_MASIVOS.getModelo_año()[DATOS_MASIVOS.getPosicion_modelo()]==null){   
            DATOS_MASIVOS.getModelo_año()[DATOS_MASIVOS.getPosicion_modelo()] = Modelo_año;
            DATOS_MASIVOS.getModelo_porentaje_depreciacion()[DATOS_MASIVOS.getPosicion_modelo()] = Modelo_porentaje_depreciacion;
               System.out.println("se registro EN MODELO modelo año: "+DATOS_MASIVOS.getModelo_año()[DATOS_MASIVOS.getPosicion_modelo()]+ " en: "+DATOS_MASIVOS.getPosicion_modelo());
               System.out.println("se registro EN MODELO porcentaje de depreciacion: "+DATOS_MASIVOS.getModelo_porentaje_depreciacion()[DATOS_MASIVOS.getPosicion_modelo()]+" en:"+DATOS_MASIVOS.getPosicion_modelo());     
   }
   }
   
   public static  void guardar_marca(String Marca_nombre, String Marca_porcentaje_aumento_de_poliza){
        if(DATOS_MASIVOS.getMarca_nombre()[DATOS_MASIVOS.getPosicion_marca()]==null){   
            DATOS_MASIVOS.getMarca_nombre()[DATOS_MASIVOS.getPosicion_marca()] = Marca_nombre;
            DATOS_MASIVOS.getMarca_porcentaje_aumento_de_poliza()[DATOS_MASIVOS.getPosicion_marca()] = Marca_porcentaje_aumento_de_poliza;
               System.out.println("se registro EN MARCA nombre de: "+DATOS_MASIVOS.getMarca_nombre()[DATOS_MASIVOS.getPosicion_marca()]+ " en: "+DATOS_MASIVOS.getPosicion_marca());
               System.out.println("se registro EN MARCA el porcentaje de aumento de poliza: "+DATOS_MASIVOS.getMarca_porcentaje_aumento_de_poliza()[DATOS_MASIVOS.getPosicion_marca()]+" en:"+DATOS_MASIVOS.getPosicion_marca());     
   }
   }
   
    public static void guardar_linea(String Linea_nombre, String Linea_porcentaje_aumento_de_poliza){
       if(DATOS_MASIVOS.getLinea_nombre()[DATOS_MASIVOS.getPosicion_linea()]==null){
           DATOS_MASIVOS.getLinea_nombre()[DATOS_MASIVOS.getPosicion_linea()] = Linea_nombre;
           DATOS_MASIVOS.getLinea_porcentaje_aumento_de_poliza()[DATOS_MASIVOS.getPosicion_linea()] = Linea_porcentaje_aumento_de_poliza;
               System.out.println("se registro EN LINEA nombre de: "+DATOS_MASIVOS.getLinea_nombre()[DATOS_MASIVOS.getPosicion_linea()]+ " en: "+DATOS_MASIVOS.getPosicion_linea());
               System.out.println("se registro EN LINEA porcentaje de aumento de poliza: "+DATOS_MASIVOS.getLinea_porcentaje_aumento_de_poliza()[DATOS_MASIVOS.getPosicion_linea()]+" en:"+DATOS_MASIVOS.getPosicion_linea());     
       }
       }

    public static void guardar_uso(String Uso_nombre, String Uso_porcentaje_aumento_de_poliza){
       if(DATOS_MASIVOS.getUso_nombre()[DATOS_MASIVOS.getPosicion_uso()]==null){
           DATOS_MASIVOS.getUso_nombre()[DATOS_MASIVOS.getPosicion_uso()] = Uso_nombre;
           DATOS_MASIVOS.getUso_porcentaje_aumento_de_poliza()[DATOS_MASIVOS.getPosicion_uso()] = Uso_porcentaje_aumento_de_poliza;
               System.out.println("se registro EN USO nombre de: "+DATOS_MASIVOS.getUso_nombre()[DATOS_MASIVOS.getPosicion_uso()]+ " en: "+DATOS_MASIVOS.getPosicion_uso());
               System.out.println("se registro EN USO porcentaje de aumento de poliza: "+DATOS_MASIVOS.getUso_porcentaje_aumento_de_poliza()[DATOS_MASIVOS.getPosicion_uso()]+" en:"+DATOS_MASIVOS.getPosicion_uso());     
       }
       }
    
    public static void guardar_mecanica(String Mecanica_nombre_actividad, String Mecanica_precio){
       if(DATOS_MASIVOS.getTipo_nombre()[DATOS_MASIVOS.getPosicion_mecanica()]==null){
           DATOS_MASIVOS.getMecanica_nombre_actividad()[DATOS_MASIVOS.getPosicion_mecanica()] = Mecanica_nombre_actividad;
           DATOS_MASIVOS.getMecanica_precio()[DATOS_MASIVOS.getPosicion_mecanica()] = Double.parseDouble(Mecanica_precio);
               System.out.println("se registro EN MECANICA nombre actividad de: "+DATOS_MASIVOS.getMecanica_nombre_actividad()[DATOS_MASIVOS.getPosicion_mecanica()]+ " en: "+DATOS_MASIVOS.getPosicion_mecanica());
               System.out.println("se registro EN MECANICA precio de: "+DATOS_MASIVOS.getMecanica_precio()[DATOS_MASIVOS.getPosicion_mecanica()]+" en:"+DATOS_MASIVOS.getPosicion_mecanica());     
       }
       }
    
    public static void guardar_repuesto(String Repuesto_nombre, String Repuesto_precio){
       if(DATOS_MASIVOS.getRepuesto_nombre()[DATOS_MASIVOS.getPosicion_repuesto()]==null){
           DATOS_MASIVOS.getRepuesto_nombre()[DATOS_MASIVOS.getPosicion_repuesto()] = Repuesto_nombre;
           DATOS_MASIVOS.getRepuesto_precio()[DATOS_MASIVOS.getPosicion_repuesto()] = Double.parseDouble(Repuesto_precio);
               System.out.println("se registro EN REPUESTO nombre de: "+DATOS_MASIVOS.getRepuesto_nombre()[DATOS_MASIVOS.getPosicion_repuesto()]+ " en: "+DATOS_MASIVOS.getPosicion_repuesto());
               System.out.println("se registro EN RESPUESTO precio de: "+DATOS_MASIVOS.getRepuesto_precio()[DATOS_MASIVOS.getPosicion_repuesto()]+" en:"+DATOS_MASIVOS.getPosicion_repuesto());     
       }
       }   

    /**
     * @return the posicion_tipo
     */
    public static int getPosicion_tipo() {
        return posicion_tipo;
    }

    /**
     * @param aPosicion_tipo the posicion_tipo to set
     */
    public static void setPosicion_tipo(int aPosicion_tipo) {
        posicion_tipo = aPosicion_tipo;
    }

    /**
     * @return the Tipo_nombre
     */
    public static String[] getTipo_nombre() {
        return Tipo_nombre;
    }

    /**
     * @param aTipo_nombre the Tipo_nombre to set
     */
    public static void setTipo_nombre(String[] aTipo_nombre) {
        Tipo_nombre = aTipo_nombre;
    }

    /**
     * @return the Tipo_valorMaximo
     */
    public static String[] getTipo_valorMaximo() {
        return Tipo_valorMaximo;
    }

    /**
     * @param aTipo_valorMaximo the Tipo_valorMaximo to set
     */
    public static void setTipo_valorMaximo(String[] aTipo_valorMaximo) {
        Tipo_valorMaximo = aTipo_valorMaximo;
    }

    /**
     * @return the posicion_modelo
     */
    public static int getPosicion_modelo() {
        return posicion_modelo;
    }

    /**
     * @param aPosicion_modelo the posicion_modelo to set
     */
    public static void setPosicion_modelo(int aPosicion_modelo) {
        posicion_modelo = aPosicion_modelo;
    }

    /**
     * @return the Modelo_año
     */
    public static String[] getModelo_año() {
        return Modelo_año;
    }

    /**
     * @param aModelo_año the Modelo_año to set
     */
    public static void setModelo_año(String[] aModelo_año) {
        Modelo_año = aModelo_año;
    }

    /**
     * @return the Modelo_porentaje_depreciacion
     */
    public static String[] getModelo_porentaje_depreciacion() {
        return Modelo_porentaje_depreciacion;
    }

    /**
     * @param aModelo_porentaje_depreciacion the Modelo_porentaje_depreciacion to set
     */
    public static void setModelo_porentaje_depreciacion(String[] aModelo_porentaje_depreciacion) {
        Modelo_porentaje_depreciacion = aModelo_porentaje_depreciacion;
    }

    /**
     * @return the posicion_marca
     */
    public static int getPosicion_marca() {
        return posicion_marca;
    }

    /**
     * @param aPosicion_marca the posicion_marca to set
     */
    public static void setPosicion_marca(int aPosicion_marca) {
        posicion_marca = aPosicion_marca;
    }

    /**
     * @return the Marca_nombre
     */
    public static String[] getMarca_nombre() {
        return Marca_nombre;
    }

    /**
     * @param aMarca_nombre the Marca_nombre to set
     */
    public static void setMarca_nombre(String[] aMarca_nombre) {
        Marca_nombre = aMarca_nombre;
    }

    /**
     * @return the Marca_porcentaje_aumento_de_poliza
     */
    public static String[] getMarca_porcentaje_aumento_de_poliza() {
        return Marca_porcentaje_aumento_de_poliza;
    }

    /**
     * @param aMarca_porcentaje_aumento_de_poliza the Marca_porcentaje_aumento_de_poliza to set
     */
    public static void setMarca_porcentaje_aumento_de_poliza(String[] aMarca_porcentaje_aumento_de_poliza) {
        Marca_porcentaje_aumento_de_poliza = aMarca_porcentaje_aumento_de_poliza;
    }

    /**
     * @return the posicion_linea
     */
    public static int getPosicion_linea() {
        return posicion_linea;
    }

    /**
     * @param aPosicion_linea the posicion_linea to set
     */
    public static void setPosicion_linea(int aPosicion_linea) {
        posicion_linea = aPosicion_linea;
    }

    /**
     * @return the Linea_nombre
     */
    public static String[] getLinea_nombre() {
        return Linea_nombre;
    }

    /**
     * @param aLinea_nombre the Linea_nombre to set
     */
    public static void setLinea_nombre(String[] aLinea_nombre) {
        Linea_nombre = aLinea_nombre;
    }

    /**
     * @return the Linea_porcentaje_aumento_de_poliza
     */
    public static String[] getLinea_porcentaje_aumento_de_poliza() {
        return Linea_porcentaje_aumento_de_poliza;
    }

    /**
     * @param aLinea_porcentaje_aumento_de_poliza the Linea_porcentaje_aumento_de_poliza to set
     */
    public static void setLinea_porcentaje_aumento_de_poliza(String[] aLinea_porcentaje_aumento_de_poliza) {
        Linea_porcentaje_aumento_de_poliza = aLinea_porcentaje_aumento_de_poliza;
    }

    /**
     * @return the posicion_uso
     */
    public static int getPosicion_uso() {
        return posicion_uso;
    }

    /**
     * @param aPosicion_uso the posicion_uso to set
     */
    public static void setPosicion_uso(int aPosicion_uso) {
        posicion_uso = aPosicion_uso;
    }

    /**
     * @return the Uso_nombre
     */
    public static String[] getUso_nombre() {
        return Uso_nombre;
    }

    /**
     * @param aUso_nombre the Uso_nombre to set
     */
    public static void setUso_nombre(String[] aUso_nombre) {
        Uso_nombre = aUso_nombre;
    }

    /**
     * @return the Uso_porcentaje_aumento_de_poliza
     */
    public static String[] getUso_porcentaje_aumento_de_poliza() {
        return Uso_porcentaje_aumento_de_poliza;
    }

    /**
     * @param aUso_porcentaje_aumento_de_poliza the Uso_porcentaje_aumento_de_poliza to set
     */
    public static void setUso_porcentaje_aumento_de_poliza(String[] aUso_porcentaje_aumento_de_poliza) {
        Uso_porcentaje_aumento_de_poliza = aUso_porcentaje_aumento_de_poliza;
    }

    /**
     * @return the posicion_mecanica
     */
    public static int getPosicion_mecanica() {
        return posicion_mecanica;
    }

    /**
     * @param aPosicion_mecanica the posicion_mecanica to set
     */
    public static void setPosicion_mecanica(int aPosicion_mecanica) {
        posicion_mecanica = aPosicion_mecanica;
    }

    /**
     * @return the Mecanica_nombre_actividad
     */
    public static String[] getMecanica_nombre_actividad() {
        return Mecanica_nombre_actividad;
    }

    /**
     * @param aMecanica_nombre_actividad the Mecanica_nombre_actividad to set
     */
    public static void setMecanica_nombre_actividad(String[] aMecanica_nombre_actividad) {
        Mecanica_nombre_actividad = aMecanica_nombre_actividad;
    }

    /**
     * @return the Mecanica_precio
     */
    public static double[] getMecanica_precio() {
        return Mecanica_precio;
    }

    /**
     * @param aMecanica_precio the Mecanica_precio to set
     */
    public static void setMecanica_precio(double[] aMecanica_precio) {
        Mecanica_precio = aMecanica_precio;
    }

    /**
     * @return the posicion_repuesto
     */
    public static int getPosicion_repuesto() {
        return posicion_repuesto;
    }

    /**
     * @param aPosicion_repuesto the posicion_repuesto to set
     */
    public static void setPosicion_repuesto(int aPosicion_repuesto) {
        posicion_repuesto = aPosicion_repuesto;
    }

    /**
     * @return the Repuesto_nombre
     */
    public static String[] getRepuesto_nombre() {
        return Repuesto_nombre;
    }

    /**
     * @param aRepuesto_nombre the Repuesto_nombre to set
     */
    public static void setRepuesto_nombre(String[] aRepuesto_nombre) {
        Repuesto_nombre = aRepuesto_nombre;
    }

    /**
     * @return the Repuesto_precio
     */
    public static double[] getRepuesto_precio() {
        return Repuesto_precio;
    }

    /**
     * @param aRepuesto_precio the Repuesto_precio to set
     */
    public static void setRepuesto_precio(double[] aRepuesto_precio) {
        Repuesto_precio = aRepuesto_precio;
    }
   
}
