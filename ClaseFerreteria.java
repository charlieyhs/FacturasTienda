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
public class ClaseFerreteria {
    
    private String seccion, producto,marca,importado,precio;

    public ClaseFerreteria(String producto) {
        this.producto = producto;
    }

    
    
    
    public ClaseFerreteria(String seccion, String producto, String marca, String importado, String precio) {
        
        this.seccion = seccion;
        this.producto = producto;
        this.marca = marca;
        this.importado = importado;
        this.precio = precio;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public String toString(){
        
        return this.producto;
        
    }
    
}
