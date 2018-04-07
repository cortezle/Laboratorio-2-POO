/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolabodos;

/**
 *
 * @author Lucho
 */
public class Factura {
    private String nombrep, proveedor;
    private int cantprod;
    private float costoindv;
    
     public Factura(String nombrep, int cantprod, float costoindv, String proveedor){
        this.nombrep = nombrep;
        this.cantprod = cantprod;
        this.costoindv = costoindv;
        this.proveedor = proveedor;
    }
    public String getnombrep(){
        return nombrep;
    }
    public void setUser(String nombrep){
        this.nombrep = nombrep;
    }
    
    public int getcantprod(){
        return cantprod;
    }
    public void setcantprod(int cantprod){
        this.cantprod = cantprod;
    }
    
    public float costoindv(){
        return cantprod;
    }
    public void setcostoindv(float costoindv){
        this.costoindv = costoindv;
    }
    public String getproveedor(){
        return proveedor;
    }
    public void proveedor(String proveedor){
        this.proveedor = proveedor;
    }
    
    
     
     
    
}
