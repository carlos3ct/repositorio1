/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.List;

/**
 *
 * @author mcruz
 */
public class Profesor extends Persona{
     private String nombre;
     private int edad;
     private List<Prestamo> prestamo;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the prestamo
     */
    public List<Prestamo> getPrestamo() {
        return prestamo;
    }

    /**
     * @param prestamo the prestamo to set
     */
    public void setPrestamo(List<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }
    /**
     * @return the nombre
     */
    

    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }
    
    
    public void printTodaLaInformación(){
        printInformacionPersonal();
        for(Prestamo p:Prestamo()){
            System.out.println(p);
        }
    }

    public void printInformacionPersonal() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Teléfono: "+numeroDeTelefono);
    }

    private Iterable<Prestamo> Prestamo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
