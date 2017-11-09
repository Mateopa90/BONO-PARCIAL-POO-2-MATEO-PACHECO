package Datos;

public class Oficina extends Local {
    private String tipoOficina;

    public Oficina(String tipoOficina, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.tipoOficina = tipoOficina;
    }
    
    @Override
    public String darInformacion(){
        String info = "Nombre del Barrio: " + this.nombreBarrio + "\n" + 
                "Estrato: " + this.estrato + "\n" + 
                "Valor Arriendo: " + this.valorArriendo + "\n" + 
                "Área construida: " + this.areaConstruida + "\n" + 
                "Disponible: " + this.disponible + "\n" + 
                "Tipo de Oficina: " + this.tipoOficina;
        return info;
    }     

    public void setTipoOficina(String tipoOficina) {
        this.tipoOficina = tipoOficina;
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
