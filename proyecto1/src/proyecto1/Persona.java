/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author mcruz
 */
public class Persona {
    String numeroDeTelefono;
    
    public Persona (String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    public String getNumeroDeTelefono(){
        return numeroDeTelefono;
    }
    
    public void setNumeroDeTelefono(String numeroDeTelefono){
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
