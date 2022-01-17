/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteFacturas;

/**
 *
 * @author MARTHA
 */
public class ClaseSecciones {
    
    private String secciones;

    public ClaseSecciones(String secciones) {
        this.secciones = secciones;
    }

    public String getSecciones() {
        return secciones;
    }

    public void setSecciones(String secciones) {
        this.secciones = secciones;
    }
    
    public String toString(){
        
        return this.secciones;
        
    }
    
    
}
