/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteFacturas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author MARTHA
 */
public class ArchivoPapelera {
    private File archivoPapeleria;
    private File archivoProductos;
    
    public void crearArchivoPapeleria(){
        
        archivoPapeleria = new File("C:\\Users\\MARTHA\\Documents\\ArchivosFactura\\Papeleria.txt");
        
        archivoProductos = new File("C:\\Users\\MARTHA\\Documents\\ArchivosFactura\\ProductosPapeleria.txt");
        try{
            
            if(archivoPapeleria.createNewFile()){//Create new file  arroja una excepcion
                System.out.println("Archivo Papeleria Creado");
            }
            
            
        }catch(IOException ex){
            System.err.println("Error, "+ex);
        }

    }
    
    public void escribirTexto(ClasePapeleria papeleria){
        
        
        try {
            FileWriter escribirProductos = new FileWriter(archivoProductos,true);
            FileWriter escribirPapeleria = new FileWriter(archivoPapeleria,true);//en el constructor le indicamos
            //que va a escribir en el archivo creado por nosotros que es archivoFerreteria, y en el segundo parametro le indicamos con el true, que se puede 
            //escribir dentro de este archivo
            
            escribirPapeleria.write(papeleria.getSeccion() +"%"+papeleria.getProducto()+"%"+papeleria.getMarca()+"%"+papeleria.getImportado()+"%"+papeleria.getPrecio()+"\r\n");
            escribirProductos.write(papeleria.getProducto()+"\r\n");
            //la funcion Writer arroja una excepcion
            escribirProductos.close();
            escribirPapeleria.close();

            
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
            
        }
    }
}
