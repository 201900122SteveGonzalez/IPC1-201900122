package proyecto1_201900122_vj2020;

public class banco_de_datos_ASEGURADO {
public int NoUsuario;
public String nombres, apellidos;
public long DPI, telefono;
public String tipo_vehculo, uso_vehiculo, linea, modelo;
public double valor_vehiculo;

    public banco_de_datos_ASEGURADO(int NoUsuario, String nombres, String apellidos, long DPI, long telefono, String tipo_vehculo, String uso_vehiculo, String linea, String modelo, double valor_vehiculo) {
        this.NoUsuario = NoUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DPI = DPI;
        this.telefono = telefono;
        this.tipo_vehculo = tipo_vehculo;
        this.uso_vehiculo = uso_vehiculo;
        this.linea = linea;
        this.modelo = modelo;
        this.valor_vehiculo = valor_vehiculo;
    }
    
}
