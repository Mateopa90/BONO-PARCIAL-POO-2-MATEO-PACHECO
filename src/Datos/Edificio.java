package Datos;

import java.util.ArrayList;

public class Edificio extends Inmueble {

    private String Propietario;
    private ArrayList<Oficina> Oficinas;
    private ArrayList<Local_Comercial> Locales_Comerciales;
    private ArrayList<Piso> pisos;

    public Edificio(String propietario, String nombreBarrio, int estrato, 
            double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.Propietario = propietario;
        this.Oficinas = new ArrayList<>();
        this.Locales_Comerciales = new ArrayList<>();
        this.pisos = new ArrayList<>();
    }   

    public void addLocales_Comerciales(String descripcion, boolean viaPrincipal, String nombreBarrio, 
            int estrato, double valorArriendo, double areaConstruida, boolean disponible){
        
        Local_Comercial l = new Local_Comercial( descripcion, viaPrincipal, nombreBarrio, 
         estrato, valorArriendo, areaConstruida, disponible);
        Locales_Comerciales.add(l);
    }

    public void addOficinas(String tipoOficina, String nombreBarrio, int estrato, 
            double valorArriendo, double areaConstruida, boolean disponible) {
        
        Oficina o = new Oficina( tipoOficina, nombreBarrio, estrato,  valorArriendo, areaConstruida, disponible);
        Oficinas.add(o);
    }

    public void addPiso(int numeroOficinas, double area, String nombreBarrio, int estrato, 
            double valorArriendo, double areaConstruida, boolean disponible) {
        
        Piso p = new Piso(numeroOficinas, area, nombreBarrio, estrato, 
                valorArriendo, areaConstruida, disponible);
        pisos.add(p);
    }
    
    public String noArrendados() {
        String Pisos_Arrendados = "";
        String Locales_Arrendados = "";
        for (Piso piso : pisos) {
            if (piso.isDisponible() == false) {
                Pisos_Arrendados += piso.darInformacion();
                Pisos_Arrendados += '\n';
            }
        }
        for (Local_Comercial local : Locales_Comerciales) {
            if (local.isDisponible() == false) {
                Locales_Arrendados += local.darInformacion();
                Locales_Arrendados += '\n';
            }
        }
        return "Pisos No Arrendados: " + '\n' + Pisos_Arrendados + '\n' 
                + "Locales No Arrendados: " + '\n' + Locales_Arrendados;
    }
    
    public void setPropietario(String propietario) {
        this.Propietario = propietario;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.Oficinas = oficinas;
    }

    public void setLocalesComerciales(ArrayList<Local_Comercial> localesComerciales) {
        this.Locales_Comerciales = localesComerciales;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
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

    public String getPropietario() {
        return Propietario;
    }

    public ArrayList<Oficina> getOficinas() {
        return Oficinas;
    }

    public ArrayList<Local_Comercial> getLocalesComerciales() {
        return Locales_Comerciales;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
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

    @Override
    public String darInformacion() {
        String info = "Nombre del Barrio: " + this.Nombre_Barrio + "\n"
                + "Estrato: " + this.estrato + "\n"
                + "Valor Arriendo: " + this.Valor_Arriendo + "\n"
                + "Área construida: " + this.Area_Construida + "\n"
                + "Disponible: " + this.disponible + "\n"
                + "Info. del Propietario: " + this.Propietario;
        return info;
    }   
}
