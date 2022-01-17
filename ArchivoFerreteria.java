/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteFacturas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARTHA
 */
public class ArchivoFerreteria {
    
    private File archivoFerreteria;
    private File archivoProductos;
    
    public void crearArchivoFerreteria(){
        
        archivoFerreteria = new File("C:\\Users\\MARTHA\\Documents\\ArchivosFactura\\Ferreteria.txt");
        
        archivoProductos = new File("C:\\Users\\MARTHA\\Documents\\ArchivosFactura\\ProductosFerreteria.txt");
        try{
            
            if(archivoFerreteria.createNewFile()){//Create new file  arroja una excepcion
                System.out.println("Archivo Ferreteria Creado");
            }
            
            
        }catch(IOException ex){
            System.err.println("Error, "+ex);
        }

    }
    
    public void escribirTexto(ClaseFerreteria ferreteria){
        
        
        try {
            FileWriter escribirProductos = new FileWriter(archivoProductos,true);
            FileWriter escribirFerreteria = new FileWriter(archivoFerreteria,true);//en el constructor le indicamos
            //que va a escribir en el archivo creado por nosotros que es archivoFerreteria, y en el segundo parametro le indicamos con el true, que se puede 
            //escribir dentro de este archivo
            
            escribirFerreteria.write(ferreteria.getSeccion() +"%"+ferreteria.getProducto()+"%"+ferreteria.getMarca()+"%"+ferreteria.getImportado()+"%"+ferreteria.getPrecio()+"\r\n");
            escribirProductos.write(ferreteria.getProducto()+"\r\n");
            //la funcion Writer arroja una excepcion
            escribirProductos.close();
            escribirFerreteria.close();

            
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
            
        }
    }
    
    
}
