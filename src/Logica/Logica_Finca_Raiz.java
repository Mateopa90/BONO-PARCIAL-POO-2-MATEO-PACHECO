package Logica;

import Datos.Finca_Raiz;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Logica_Finca_Raiz {
    
    private Finca_Raiz FR;
    
    public void Escribir_Archivo() throws IOException{
        
        File archivo = new File("Inventario.txt");        
        if(!(archivo.exists()))
            archivo.createNewFile();
        
        FileWriter escribir = new FileWriter(archivo);
        PrintWriter linea = new PrintWriter(escribir);
        String cadena;  
        
    }
    
    public void leer_Archivo_1 () throws FileNotFoundException, IOException{
        
        File archivo = new File("Inventario.txt");
        FileReader lectura = new FileReader(archivo);
        BufferedReader almacenamiento = new BufferedReader(lectura);
        String cadena = "";

        while (cadena != null){
            cadena = almacenamiento.readLine();
            
        } 
    }
    
    public void cargarDatos_2(String ruta) {

        File in = new File(ruta);
        Scanner e = null;
        if (in.exists()) {
            try {
                e = new Scanner(in);
                e.useDelimiter(",");
                String nombre_Barrio;
                int estrato;
                int Valor_Arriendo;
                int Area_Construida;
                boolean arrendado;
                String inmueble;
                while (e.hasNext()) {
                    inmueble = e.next().trim();
                    switch (inmueble) {
                        case "Oficina": {
                            String tipo;
                            String arrendados = e.next().trim();
                            arrendado = Boolean.parseBoolean(arrendados);
                            nombre_Barrio = e.next().trim();
                            String areaConstruidas = e.next().trim();
                            Area_Construida = Integer.parseInt(areaConstruidas);
                            String estratos = e.next().trim();
                            estrato = Integer.parseInt(estratos);
                            String valorArriendos = e.next().trim();
                            Valor_Arriendo = Integer.parseInt(valorArriendos);
                            tipo = e.next();
                            FR.addOficina(tipo, nombre_Barrio, estrato, Valor_Arriendo, Area_Construida, arrendado);
                            break;
                        }
                        case "LocalComercial": {
                            String descripcion;
                            boolean viaPrincipal;
                            String arrendados = e.next().trim();
                            arrendado = Boolean.parseBoolean(arrendados);
                            nombre_Barrio = e.next().trim();
                            String areaConstruidas = e.next().trim();
                            Area_Construida = Integer.parseInt(areaConstruidas);
                            String estratos = e.next().trim();
                            estrato = Integer.parseInt(estratos);
                            String valorArriendos = e.next().trim();
                            Valor_Arriendo = Integer.parseInt(valorArriendos);
                            descripcion = e.next().trim();
                            String viaPrincipals = e.next().trim();
                            viaPrincipal = Boolean.parseBoolean(viaPrincipals);
                            FR.addLocalComercial(descripcion, viaPrincipal, nombre_Barrio, estrato, Valor_Arriendo, Area_Construida, arrendado);
                            break;
                        }
                        case "Piso": {
                            int numOficinas;
                            int area;
                            String arrendados = e.next().trim();
                            arrendado = Boolean.parseBoolean(arrendados);
                            nombre_Barrio = e.next().trim();
                            String areaConstruidas = e.next().trim();
                            Area_Construida = Integer.parseInt(areaConstruidas);
                            String estratos = e.next().trim();
                            estrato = Integer.parseInt(estratos);
                            String valorArriendos = e.next().trim();
                            Valor_Arriendo = Integer.parseInt(valorArriendos);
                            String areas = e.next().trim();
                            area = Integer.parseInt(areas);
                            String numOficinass = e.next().trim();
                            numOficinas = Integer.parseInt(numOficinass);
                            FR.addPiso(numOficinas, area, nombre_Barrio, estrato, Valor_Arriendo, Area_Construida, arrendado);
                            break;
                        } 

                        case "Edificio": {
                            String propietario;
                            String arrendados = e.next().trim();
                            arrendado = Boolean.parseBoolean(arrendados);
                            nombre_Barrio = e.next().trim();
                            String areaConstruidas = e.next().trim();
                            Area_Construida = Integer.parseInt(areaConstruidas);
                            String estratos = e.next().trim();
                            estrato = Integer.parseInt(estratos);
                            String valorArriendos = e.next().trim();
                            Valor_Arriendo = Integer.parseInt(valorArriendos);
                            propietario = e.next().trim();
                            FR.addEdificio(propietario, nombre_Barrio, estrato, Valor_Arriendo, Area_Construida, arrendado);
                            break;
                        }
                        default:
                            break;
                    }

                }

            } catch (FileNotFoundException ex) {
                System.out.println("Error");
                JOptionPane.showMessageDialog(null, "No Es Permitida Esa Opcion", "Error",JOptionPane.ERROR_MESSAGE);
            }

        }

    }
}

