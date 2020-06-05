/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporte;

/**
 *
 * @author USUARIO
 */
public class ReporteUsuarios {
    private String [] usuarios;
    private int [] estado;

    public ReporteUsuarios(String[] usuarios, int[] estado) {
        this.usuarios = usuarios;
        this.estado = estado;
    }
    public void setUsuarios (String [] usuarios){
        this.usuarios = usuarios;
    }
    public String[] getUsuarios (){
        return usuarios;
    }
    public int [] getEstado (){
        return estado;
    }
    public void setEstado(int[] estado){
        this.estado = estado;
    }
}
