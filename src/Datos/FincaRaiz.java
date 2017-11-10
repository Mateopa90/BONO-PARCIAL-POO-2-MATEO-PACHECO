package Datos;

import java.util.ArrayList;
import java.util.TreeMap;

public class FincaRaiz {

    private TreeMap<String, Inmueble> inventario;

    public FincaRaiz() {

        this.inventario = new TreeMap<>();
    }

    public void agregarLocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        LocalComercial l = new LocalComercial(descripcion, viaPrincipal, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventario.put("Local Comercial", l);
    }

    public void agregarOficina(String tipoOficina, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Oficina o = new Oficina(tipoOficina, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventario.put("Oficina", o);
    }

    public void agregarPiso(int numeroOficinas, double area, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Piso p = new Piso(numeroOficinas, area, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventario.put("Piso", p);
    }

    public void agregarEdificio(String propietario, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Edificio e = new Edificio(propietario, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventario.put("Edificio", e);
    }

    public void eliminarEdificio(String propietario, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Edificio edificio = new Edificio(propietario, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        inventario.remove(inventario.containsValue(edificio));
    }

    public void eliminarPiso(Piso piso) {
        inventario.remove(inventario.containsValue(piso));
    }

    public void eliminarOficina(Oficina oficina) {
        inventario.remove(inventario.containsValue(oficina));
    }

    public void eliminarLocal(LocalComercial local) {
        inventario.remove(inventario.containsValue(local));
    }

    public void consultarInventario() {
        System.out.println(inventario.toString());
    }
}
