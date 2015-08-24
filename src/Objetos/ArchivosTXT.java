/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alcides
 */
public class ArchivosTXT {
    private File archivo;

    public ArchivosTXT() {
    }
    
    // path example: 0C:\Users\Alcides\Documents\NetBeansProjects\Tarea4_AlcidesLara\tabal1.txt
    public String leer(String nombre){
        try{            
            File f = new File(nombre); // abro el archivo a leer
            FileReader lectorArchivo = new FileReader(f); // creo el canal para leer el archivo
            BufferedReader br = new BufferedReader(lectorArchivo); // almacenamiento de toda la informacion del txt
            String l=""; // variables donde se almacena informacion
            String aux=""; // variables donde se almacena informacion
            while(true){
                aux=br.readLine(); // leer cada linea del archivo de texto
                if(aux!=null){
                    l=l+aux; // agregar la nueva linea a la variable donde esta todo lo del txt
                }
                else{
                    break;
                }
            }
            br.close();              // cierre del canal de acceso al txt
            lectorArchivo.close();   //
            return l; // regresa todo lo que tenial el archivo en un solo string
        }catch(IOException e){
            System.out.println("Error:"+e.getMessage()); // mensaje de error en caso de algun problema
        }
        return null;
    }
    
    public void Escribir(String informacion,String nombre){ // funcion que nos permite escribir en un archivo txt
        this.archivo=new File(nombre+".txt"); // crea un nuevo archivo de texto
        try{
            FileWriter escribir=new FileWriter(archivo,true); // abro el canal para escribir en el txt
            escribir.write(informacion); // escribo en el txt
            escribir.close(); // cierro el archivo txt
        }
        catch(Exception e){
            System.out.println("Error al escribir");
        }
    }
}