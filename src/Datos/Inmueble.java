package Datos;

public abstract class Inmueble {
    protected String Nombre_Barrio;
    protected int estrato;
    protected double Valor_Arriendo;
    protected double Area_Construida;
    protected boolean disponible;
    protected Persona Inquilino;

    public Inmueble(String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        this.Nombre_Barrio = nombreBarrio;
        this.estrato = estrato;
        this.Valor_Arriendo = valorArriendo;
        this.Area_Construida = areaConstruida;
        this.disponible = disponible;
    }
    
    public abstract String darInformacion();
    
    public void addCliente(Persona persona){
        if(persona.Verificar_Persona() == true){
            this.Inquilino = persona;
        } else {
            System.out.println("Esta persona no es apta segun requisitos para alquilar los Inmuebles");
        }
    }
    
    public void eliminarCliente(){
        this.Inquilino = null;
    }
}
