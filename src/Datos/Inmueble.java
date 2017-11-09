package Datos;

public abstract class Inmueble {
    protected String nombreBarrio;
    protected int estrato;
    protected double valorArriendo;
    protected double areaConstruida;
    protected boolean disponible;

    public Inmueble(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        this.nombreBarrio = nombreBarrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
        this.disponible = disponible;
    }
    
    public abstract String darInformacion();
}
