package Logica;

import java.io.*;

public class LogicaFincaRaiz {
    
    public void escribirEnArchivo() throws IOException{
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String cadena;
        
        archivo = new File("Inventario.txt");
        
        escribir = new FileWriter(archivo);
        linea = new PrintWriter(escribir);
        
    }
    
    public void leerArchivo () throws FileNotFoundException, IOException{
        File archivo;
        FileReader lectura;
        BufferedReader almacenamiento;
        String cadena;
        
        archivo = new File("Inventario.txt");
        
        lectura = new FileReader(archivo);
        almacenamiento = new BufferedReader(lectura);
        cadena = "";
        
        while (cadena != null){
            cadena = almacenamiento.readLine();
            
        } 
    }
}
