package Datos;

public class Oficina extends Local {
    private String tipoOficina;

    public Oficina(String tipoOficina, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.tipoOficina = tipoOficina;
    }
    
    @Override
    public String darInformacion(){
        String info = "Nombre del Barrio: " + this.Nombre_Barrio + "\n" + 
                "Estrato: " + this.estrato + "\n" + 
                "Valor Arriendo: " + this.Valor_Arriendo + "\n" + 
                "Área construida: " + this.Area_Construida + "\n" + 
                "Disponible: " + this.disponible + "\n" + 
                "Tipo de Oficina: " + this.tipoOficina;
        return info;
    }     

    public void setTipoOficina(String tipoOficina) {
        this.tipoOficina = tipoOficina;
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

    public String getTipoOficina() {
        return tipoOficina;
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
