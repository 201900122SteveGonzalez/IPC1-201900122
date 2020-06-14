package proyecto1_201900122_vj2020;
/**
 *
 * @author Steve González
 */

public class DATOS_MASIVOS { 
public int posicion_tipo;
String Tipo_nombre [];
double Tipo_valorMaximo [];
//---------------------------------
public int posicion_modelo;
String Modelo_año [];
double Modelo_porentaje_depreciacion [];
//-------------------------------------------
public int posicion_marca;
String Marca_nombre [];
double Marca_porcentaje_aumento_de_poliza[];
//----------------------------------------------
public int posicion_linea;
String Linea_nombre [];
double Linea_porcentaje_aumento_de_poliza[];
//----------------------------------------------
public int posicion_uso;
String Uso_nombre [];
double Uso_porcentaje_aumento_de_poliza[];
//----------------------------------------------
public int posicion_mecanica;
String Mecanica_nombre_actividad [];
double Mecanica_precio[];
//----------------------------------------------
public int posicion_repuesto;
String Repuesto_nombre [];
double Repuesto_precio[];

    public DATOS_MASIVOS() {
        this.Tipo_nombre = new String [100];
        this.Tipo_valorMaximo = new double [100];
        this.Modelo_año = new String [100];
        this.Modelo_porentaje_depreciacion = new double [100];
        this.Marca_nombre = new String [100];
        this.Marca_porcentaje_aumento_de_poliza = new double [100];
        this.Linea_nombre = new String [100];
        this.Linea_porcentaje_aumento_de_poliza = new double [100];
        this.Uso_nombre = new String [100];
        this.Uso_porcentaje_aumento_de_poliza = new double [100];
        this.Mecanica_nombre_actividad = new String [100];
        this.Mecanica_precio = new double [100];
        this.Repuesto_nombre= new String [100];
        this.Repuesto_precio = new double [100];
    }
    
   public void guardar_tipo(String nombre, String valor_maximo_a_asegurar){
       if(this.Tipo_nombre[this.posicion_tipo]==null){
                this.Tipo_nombre[this.posicion_tipo] = nombre;
                this.Tipo_valorMaximo[this.posicion_tipo] = Double.parseDouble(valor_maximo_a_asegurar);
               System.out.println("se registro EN TIPO nombre de: "+this.Tipo_nombre[this.posicion_tipo]+ " en: "+this.posicion_tipo);
               System.out.println("se registro EN TIPO porcentaje de depreciacion: "+this.Tipo_valorMaximo[this.posicion_tipo]+" en:"+this.posicion_tipo);     
       }
       }
   
   public void guardar_modelo(String Modelo_año, String Modelo_porentaje_depreciacion){
        if(this.Modelo_año[this.posicion_modelo]==null){   
          this.Modelo_año[this.posicion_modelo] = Modelo_año;
          this.Modelo_porentaje_depreciacion[this.posicion_modelo] = Double.parseDouble(Modelo_porentaje_depreciacion);
               System.out.println("se registro EN MODELO modelo año: "+this.Modelo_año[this.posicion_modelo]+ " en: "+this.posicion_modelo);
               System.out.println("se registro EN MODELO porcentaje de depreciacion: "+this.Modelo_porentaje_depreciacion[this.posicion_modelo]+" en:"+this.posicion_modelo);     
   }
   }
   
   public void guardar_marca(String Marca_nombre, String Marca_porcentaje_aumento_de_poliza){
        if(this.Marca_nombre[this.posicion_marca]==null){   
          this.Marca_nombre[this.posicion_marca] = Marca_nombre;
          this.Marca_porcentaje_aumento_de_poliza[this.posicion_marca] = Double.parseDouble(Marca_porcentaje_aumento_de_poliza);
               System.out.println("se registro EN MARCA nombre de: "+this.Marca_nombre[this.posicion_marca]+ " en: "+this.posicion_marca);
               System.out.println("se registro EN MARCA el porcentaje de aumento de poliza: "+this.Marca_porcentaje_aumento_de_poliza[this.posicion_marca]+" en:"+this.posicion_marca);     
   }
   }
   
    public void guardar_linea(String Linea_nombre, String Linea_porcentaje_aumento_de_poliza){
       if(this.Linea_nombre[this.posicion_linea]==null){
                this.Linea_nombre[this.posicion_linea] = Linea_nombre;
                this.Linea_porcentaje_aumento_de_poliza[this.posicion_linea] = Double.parseDouble(Linea_porcentaje_aumento_de_poliza);
               System.out.println("se registro EN LINEA nombre de: "+this.Linea_nombre[this.posicion_linea]+ " en: "+this.posicion_linea);
               System.out.println("se registro EN LINEA porcentaje de aumento de poliza: "+this.Linea_porcentaje_aumento_de_poliza[this.posicion_linea]+" en:"+this.posicion_linea);     
       }
       }

    public void guardar_uso(String Uso_nombre, String Uso_porcentaje_aumento_de_poliza){
       if(this.Uso_nombre[this.posicion_uso]==null){
                this.Uso_nombre[this.posicion_uso] = Uso_nombre;
                this.Uso_porcentaje_aumento_de_poliza[this.posicion_uso] = Double.parseDouble(Uso_porcentaje_aumento_de_poliza);
               System.out.println("se registro EN USO nombre de: "+this.Uso_nombre[this.posicion_uso]+ " en: "+this.posicion_uso);
               System.out.println("se registro EN USO porcentaje de aumento de poliza: "+this.Uso_porcentaje_aumento_de_poliza[this.posicion_uso]+" en:"+this.posicion_uso);     
       }
       }
    
    public void guardar_mecanica(String Mecanica_nombre_actividad, String Mecanica_precio){
       if(this.Tipo_nombre[this.posicion_mecanica]==null){
                this.Mecanica_nombre_actividad[this.posicion_mecanica] = Mecanica_nombre_actividad;
                this.Mecanica_precio[this.posicion_mecanica] = Double.parseDouble(Mecanica_precio);
               System.out.println("se registro EN MECANICA nombre actividad de: "+this.Mecanica_nombre_actividad[this.posicion_mecanica]+ " en: "+this.posicion_mecanica);
               System.out.println("se registro EN MECANICA precio de: "+this.Mecanica_precio[this.posicion_mecanica]+" en:"+this.posicion_mecanica);     
       }
       }
    
    public void guardar_repuesto(String Repuesto_nombre, String Repuesto_precio){
       if(this.Repuesto_nombre[this.posicion_repuesto]==null){
                this.Repuesto_nombre[this.posicion_repuesto] = Repuesto_nombre;
                this.Repuesto_precio[this.posicion_repuesto] = Double.parseDouble(Repuesto_precio);
               System.out.println("se registro EN REPUESTO nombre de: "+this.Repuesto_nombre[this.posicion_repuesto]+ " en: "+this.posicion_repuesto);
               System.out.println("se registro EN RESPUESTO precio de: "+this.Repuesto_precio[this.posicion_repuesto]+" en:"+this.posicion_repuesto);     
       }
       }   
   
}
