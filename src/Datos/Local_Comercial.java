package Datos;

public class Local_Comercial extends Local{
    
    private String descripcion;
    private boolean viaPrincipal;

    public Local_Comercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.descripcion = descripcion;
        this.viaPrincipal = viaPrincipal;
    }

    @Override
    public String darInformacion(){
        String info = "Nombre del Barrio: " + this.Nombre_Barrio + "\n" + 
                "Estrato: " + this.estrato + "\n" + 
                "Valor Arriendo: " + this.Valor_Arriendo + "\n" + 
                "Área construida: " + this.Area_Construida + "\n" + 
                "Disponible: " + this.disponible + "\n" + 
                "Se encuentra en vía Principal: " + this.viaPrincipal + "\n" + 
                "Descripción: " + this.descripcion;
        return info;
    } 

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setViaPrincipal(boolean viaPrincipal) {
        this.viaPrincipal = viaPrincipal;
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

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isViaPrincipal() {
        return viaPrincipal;
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
