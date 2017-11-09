package Datos;

public class LocalComercial extends Local{
    
    private String descripcion;
    private boolean viaPrincipal;

    public LocalComercial(String descripcion, boolean viaPrincipal, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.descripcion = descripcion;
        this.viaPrincipal = viaPrincipal;
    }
    
    @Override
    public String darInformacion(){
        String info = "Nombre del Barrio: " + this.nombreBarrio + "\n" + 
                "Estrato: " + this.estrato + "\n" + 
                "Valor Arriendo: " + this.valorArriendo + "\n" + 
                "Área construida: " + this.areaConstruida + "\n" + 
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
