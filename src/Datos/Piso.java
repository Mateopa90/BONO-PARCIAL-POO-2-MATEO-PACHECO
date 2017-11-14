package Datos;

import java.util.*;

public class Piso extends Inmueble {
    
    private int Num_Oficinas;
    private double area;
    private ArrayList <Oficina> oficinas;

    public Piso(int numeroOficinas, double area, String nombreBarrio, int estrato, 
            double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.Num_Oficinas = numeroOficinas;
        this.area = area;
        this.oficinas = new ArrayList<>();
    }
    
    public void addOficina (String tipoOficina, String nombreBarrio, int estrato, 
            double valorArriendo, double areaConstruida, boolean disponible){
        Oficina o = new Oficina(tipoOficina, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        oficinas.add(o);
    } 
    
    @Override
    public String darInformacion(){
        String info = "Nombre del Barrio: " + this.Nombre_Barrio + "\n" + 
                "Estrato: " + this.estrato + "\n" + 
                "Valor Arriendo: " + this.Valor_Arriendo + "\n" + 
                "Área construida: " + this.Area_Construida + "\n" + 
                "Disponible: " + this.disponible + "\n" + 
                "Número de Oficinas: " + this.Num_Oficinas;
        return info;
    }     

    public void setNumeroOficinas(int numeroOficinas) {
        this.Num_Oficinas = numeroOficinas;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.Nombre_Barrio = nombreBarrio;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setValorArriendo(double valorArriendo) {
        this.Valor_Arriendo = valorArriendo;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.Area_Construida = areaConstruida;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNumeroOficinas() {
        return Num_Oficinas;
    }

    public double getArea() {
        return area;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public String getNombreBarrio() {
        return Nombre_Barrio;
    }

    public int getEstrato() {
        return estrato;
    }

    public double getValorArriendo() {
        return Valor_Arriendo;
    }

    public double getAreaConstruida() {
        return Area_Construida;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public Persona getArrendatario() {
        return Inquilino;
    }
    
    
    
}
