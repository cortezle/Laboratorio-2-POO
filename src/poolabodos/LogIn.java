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
public class LogIn {
    private String user, password;
    
    public LogIn() {}

    public LogIn(String user, String password){
        this.user=user;
        this.password=password;
    }
    
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user=user;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword (String password){
        this.password=password;
    }
  



}
