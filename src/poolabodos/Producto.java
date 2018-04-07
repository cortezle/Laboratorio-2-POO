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
public class Producto {
    private String nombre,estado,proveedor,id;
    private int cantdisp;
    private float costo;
    
    
    
public Producto() {}

 public Producto(String nombre,String estado, String proveedor, String id, int cantdisp, float costo){
        this.nombre =  nombre;
        this.cantdisp = cantdisp;
        this.costo=costo;
        this.estado=estado;
        this.proveedor=proveedor;
        this.id=id;
        
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public int getCantDisp(){
        return cantdisp;
    }
    
    public void setCantDisp(int cantdisp) {
        this.cantdisp = cantdisp;
    }
    
    public float  getCosto(){
        return costo;
    }
    
    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getProveedor(){
        return proveedor;
    }
    
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public String getId(){
        return id;
    }
    
    public void setId (String id){
        this.id=id;
    }
 

}
