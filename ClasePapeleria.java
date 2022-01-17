/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteFacturas;

/**
 *
 * @author MARTHA
 */
public class ClasePapeleria {
    
    private String seccion, producto,marca,importado,precio;

    public ClasePapeleria(String producto) {
        
        this.producto = producto;
    }

    
    
    
    public ClasePapeleria(String seccion, String producto, String marca, String importado, String precio) {
        
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
