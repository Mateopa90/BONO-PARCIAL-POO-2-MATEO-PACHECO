package Datos;

import java.util.ArrayList;
import java.util.TreeMap;

public class FincaRaiz {

    private TreeMap<Integer, LocalComercial> inventarioLocales;
    private TreeMap<Integer, Oficina> inventarioOficinas;
    private TreeMap<Integer, Piso> inventarioPisos;
    private TreeMap<Integer, Edificio> inventarioEdificios;
    private TreeMap<Integer, Persona> clientes;
    private int numLoc;
    private int numOfi;
    private int numPiso;
    private int numEdi;

    public FincaRaiz() {
        this.inventarioLocales = new TreeMap<>();
        this.inventarioOficinas = new TreeMap<>();
        this.inventarioPisos = new TreeMap<>();
        this.inventarioEdificios = new TreeMap<>();
        this.numLoc = 1;
        this.numOfi = 1;
        this.numPiso = 1;
        this.numEdi = 1;
    }

    public void agregarLocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        LocalComercial l = new LocalComercial(descripcion, viaPrincipal, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventarioLocales.put(this.numLoc, l);
        this.numLoc++;
    }

    public void agregarOficina(String tipoOficina, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Oficina o = new Oficina(tipoOficina, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventarioOficinas.put(this.numOfi, o);
        this.numOfi++;
    }

    public void agregarPiso(int numeroOficinas, double area, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Piso p = new Piso(numeroOficinas, area, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventarioPisos.put(this.numPiso, p);
        this.numPiso++;
    }

    public void agregarEdificio(String propietario, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Edificio e = new Edificio(propietario, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventarioEdificios.put(this.numEdi, e);
        this.numEdi++;
    }
    
    public void agregarCliente(Persona persona){
        clientes.put(persona.getDocumento(), persona);
    }

    public void eliminarEdificio(int key) {
        inventarioEdificios.remove(key);
    }

    public void eliminarPiso(int key) {
        inventarioPisos.remove(key);
    }

    public void eliminarOficina(int key) {
        inventarioOficinas.remove(key);
    }

    public void eliminarLocal(int key) {
        inventarioLocales.remove(key);
    }

    public void consultarInventarios() {
        System.out.println("Locales comerciales registrados: ");
        for (int i = 1; i <= inventarioLocales.size(); i++) {
            System.out.println("Local Comercial #" + i + "\n"
                    + "Nombre barrio: " + inventarioLocales.get(i).getNombreBarrio() + "\n"
                    + "Estrato: " + inventarioLocales.get(i).getEstrato() + "\n"
                    + "Valor arriendo: $" + inventarioLocales.get(i).getValorArriendo() + "\n"
                    + "Área construida: " + inventarioLocales.get(i).getAreaConstruida() + " metros cuadrados" + "\n"
                    + "Se encuentra Disponible: " + inventarioLocales.get(i).isDisponible() + "\n"
                    + "Se encuentra junto a una vía principal: " + inventarioLocales.get(i).isViaPrincipal() + "\n"
                    + "Descripcion: " + inventarioLocales.get(i).getDescripcion());
        }
        System.out.println("\n");
        System.out.println("Oficinas registradas: ");
        for (int s = 1; s <= inventarioOficinas.size(); s++) {
            System.out.println("Oficina #" + s + "\n"
                    + "Nombre barrio: " + inventarioOficinas.get(s).getNombreBarrio() + "\n"
                    + "Estrato: " + inventarioOficinas.get(s).getEstrato() + "\n"
                    + "Valor arriendo: $" + inventarioOficinas.get(s).getValorArriendo() + "\n"
                    + "Área construida: " + inventarioOficinas.get(s).getAreaConstruida() + " metros cuadrados" + "\n"
                    + "Se encuentra Disponible: " + inventarioOficinas.get(s).isDisponible() + "\n"
                    + "Tipo de Oficina: " + inventarioOficinas.get(s).getTipoOficina());
        }
        System.out.println("\n");
        System.out.println("Pisos registrados: ");
        for (int k = 1; k <= inventarioPisos.size(); k++) {
            System.out.println("Piso #" + k + "\n"
                    + "Nombre barrio: " + inventarioPisos.get(k).getNombreBarrio() + "\n"
                    + "Estrato: " + inventarioPisos.get(k).getEstrato() + "\n"
                    + "Valor arriendo: $" + inventarioPisos.get(k).getValorArriendo() + "\n"
                    + "Área construida: " + inventarioPisos.get(k).getAreaConstruida() + " metros cuadrados" + "\n"
                    + "Se encuentra Disponible: " + inventarioPisos.get(k).isDisponible() + "\n"
                    + "Número de Oficinas: " + inventarioPisos.get(k).getNumeroOficinas());
        }
        System.out.println("\n");
        System.out.println("Edificios registrados: ");
        for (int j = 1; j <= inventarioEdificios.size(); j++) {
            System.out.println("Edificio #" + j + "\n"
                    + "Nombre barrio: " + inventarioEdificios.get(j).getNombreBarrio() + "\n"
                    + "Estrato: " + inventarioEdificios.get(j).getEstrato() + "\n"
                    + "Valor arriendo: $" + inventarioEdificios.get(j).getValorArriendo() + "\n"
                    + "Área construida: " + inventarioEdificios.get(j).getAreaConstruida() + " metros cuadrados" + "\n"
                    + "Se encuentra Disponible: " + inventarioEdificios.get(j).isDisponible() + "\n"
                    + "NInfo. del Propietario: " + inventarioEdificios.get(j).getPropietario());
        }
        System.out.println("\n");
    }
}
