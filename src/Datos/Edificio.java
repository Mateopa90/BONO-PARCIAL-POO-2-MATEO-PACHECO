package Datos;

import java.util.ArrayList;

public class Edificio extends Inmueble {

    private String propietario;
    private ArrayList<Oficina> oficinas;
    private ArrayList<LocalComercial> localesComerciales;
    private ArrayList<Piso> pisos;

    public Edificio(String propietario, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.propietario = propietario;
        this.oficinas = new ArrayList<>();
        this.localesComerciales = new ArrayList<>();
        this.pisos = new ArrayList<>();
    }   

    public void agregarLocalesComerciales(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        LocalComercial l = new LocalComercial(descripcion, viaPrincipal, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        localesComerciales.add(l);
    }

    public void agregarOficinas(String tipoOficina, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Oficina o = new Oficina(tipoOficina, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        oficinas.add(o);
    }

    public void agregarPiso(int numeroOficinas, double area, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        Piso p = new Piso(numeroOficinas, area, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        pisos.add(p);
    }

    @Override
    public String darInformacion() {
        String info = "Nombre del Barrio: " + this.nombreBarrio + "\n"
                + "Estrato: " + this.estrato + "\n"
                + "Valor Arriendo: " + this.valorArriendo + "\n"
                + "Área construida: " + this.areaConstruida + "\n"
                + "Disponible: " + this.disponible + "\n"
                + "Info. del Propietario: " + this.propietario;
        return info;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public void setLocalesComerciales(ArrayList<LocalComercial> localesComerciales) {
        this.localesComerciales = localesComerciales;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setValorArriendo(double valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
