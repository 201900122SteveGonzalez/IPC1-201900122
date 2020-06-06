package tarea1;

public class control {
public String [] usuario;
public int [] carnet;
public String [] usuarioA;
public int [] carnetA;
public String [] usuarioB;
public int [] carnetB;
    public control() {
        this.usuario = new String [10];
        this.carnet = new int [10];
        this.usuarioA = new String [5];
        this.usuarioB = new String [5];
        this.carnetA = new int [5];
        this.carnetB = new int [5];
    }
    
    public void registrarA(String nombre, int carnet, int posicion){
        this.usuarioA[posicion] = nombre;
        this.carnetA[posicion] = carnet;
    }
       
    
    public void registrarB(String nombre, int carnet, int posicion){
        this.usuarioB[posicion] = nombre;
        this.carnetB[posicion] = carnet;
    }
    
    public void imprimir_registroA(int registrados){
         if(registrados<=4){
            System.out.println("REGISTRADOS EN SECCION A: ");
        for(int i = 0; i<=registrados; i++){
            System.out.println("Usuario "+(i+1)+" : " + usuarioA[i]);
            System.out.println("Carnet: " + carnetA[i]);
        }
         }
        if(registrados>4){
            System.out.println("REGISTRADOS EN SECCION A: ");
            for(int i = 0; i<=4; i++){
            System.out.println("Usuario "+(i+1)+" : " + usuarioA[i]);
            System.out.println("Carnet: " + carnetA[i]);
        }
       }
    }
    
    public void imprimir_registroB(int registrados){
        if(registrados<=4){
            System.out.println("REGISTRADOS EN SECCION B: ");
        for(int i = 0; i<=registrados; i++){
            System.out.println("Usuario "+(i+1)+" : " + usuarioB[i]);
            System.out.println("Carnet: " + carnetB[i]);
        }
         }
        if(registrados>4){
            System.out.println("REGISTRADOS EN SECCION B:");
            for(int i = 0; i<=4; i++){
            System.out.println("Usuario "+(i+1)+" : " + usuarioB[i]);
            System.out.println("Carnet: " + carnetB[i]);
        }
       }
    }
    
}
