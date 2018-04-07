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
public class Proveedor {
     private String empresa, administrador;
     
     public Proveedor() {}

    public Proveedor(String empresa, String administrador){
        this.empresa=empresa;
        this.administrador=administrador;
    }
    
    public String getempresa(){
        return empresa;
    }
    public void setempresa(String empresa){
        this.empresa=empresa;
    }
    public String getadministrador(){
        return administrador;
    }
    public void setadministrador (String administrador){
        this.administrador=administrador;
    }
}
