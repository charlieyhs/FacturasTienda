/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteFacturas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author MARTHA
 */
public class ArchivoSecciones {
    
    private File archivoSecciones;
    
    public void CrearArchivo(){
        
        archivoSecciones = new File("C:\\Users\\MARTHA\\Documents\\ArchivosFactura\\Secciones.txt");
        
        try{
            
            if(archivoSecciones.createNewFile()){//Create new file  arroja una excepcion
                System.out.println("Archivo Secciones Creado");
            }else{
                System.out.println("Archivo No creado: Secciones");
            }
            
            
        }catch(IOException ex){
            System.err.println("Error, "+ex);
        }
    }
    
    public void escribirTexto(ClaseSecciones secciones){
        
        
        try {
            
            FileWriter escribirSecciones = new FileWriter(archivoSecciones,true);//en el constructor le indicamos
            //que va a escribir en el archivo creado por nosotros que es archivoFerreteria, y en el segundo parametro le indicamos con el true, que se puede 
            //escribir dentro de este archivo
            escribirSecciones.write(secciones.getSecciones()+"\r\n");
            //la funcion Writer arroja una excepcion
            
            escribirSecciones.close();

            
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
            
        }
    }
    
}
