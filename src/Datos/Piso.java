package Datos;

import java.util.ArrayList;

public class Piso extends Inmueble {
    
    private int numeroOficinas;
    private double area;
    private ArrayList <Oficina> oficinas;

    public Piso(int numeroOficinas, double area, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.numeroOficinas = numeroOficinas;
        this.area = area;
        this.oficinas = new ArrayList<>();
    }
    
    public void agregarOficina (String tipoOficina, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible){
        Oficina o = new Oficina(tipoOficina, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        oficinas.add(o);
    } 
    
    @Override
    public String darInformacion(){
        String info = "Nombre del Barrio: " + this.nombreBarrio + "\n" + 
                "Estrato: " + this.estrato + "\n" + 
                "Valor Arriendo: " + this.valorArriendo + "\n" + 
                "Área construida: " + this.areaConstruida + "\n" + 
                "Disponible: " + this.disponible + "\n" + 
                "Número de Oficinas: " + this.numeroOficinas;
        return info;
    }     

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
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

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public double getArea() {
        return area;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public double getValorArriendo() {
        return valorArriendo;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public Persona getArrendatario() {
        return arrendatario;
    }
    
    
    
}
