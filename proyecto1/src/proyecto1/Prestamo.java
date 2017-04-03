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
public class Prestamo {
    private String tipo;
    private double cantidad;
    private float interes;
    private int amortizacion;
    
    public Prestamo(double cantidad){
        this.cantidad=cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public int getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(int amortizacion) {
        this.amortizacion = amortizacion;
    }
    
}
