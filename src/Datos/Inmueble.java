package Datos;

public abstract class Inmueble {
    protected String nombreBarrio;
    protected int estrato;
    protected double valorArriendo;
    protected double areaConstruida;
    protected boolean disponible;
    protected Persona arrendatario;

    public Inmueble(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        this.nombreBarrio = nombreBarrio;
        this.estrato = estrato;
        this.valorArriendo = valorArriendo;
        this.areaConstruida = areaConstruida;
        this.disponible = disponible;
    }
    
    public abstract String darInformacion();
    
    public void agregarCliente(Persona persona){
        if(persona.evaluarPersona() == true){
            this.arrendatario = persona;
        } else {
            System.out.println("Esta persona no cumple con los requisitos necesarios para "
                    + "alquilar uno de los Inmuebles");
        }
    }
    
    
}
