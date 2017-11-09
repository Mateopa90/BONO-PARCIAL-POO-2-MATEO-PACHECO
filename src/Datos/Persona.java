package Datos;

public class Persona {
    private String nombre;
    private int documento;
    private int edad;
    private String sexo;
    private boolean nomina;
    private boolean avalBancario;
    private boolean contratoTrabajo;
    private boolean avalPersona;

    public Persona(String nombre, int documento, int edad, String sexo, boolean nomina, boolean avalBancario, boolean contratoTrabajo, boolean avalPersona) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.sexo = sexo;
        this.nomina = nomina;
        this.avalBancario = avalBancario;
        this.contratoTrabajo = contratoTrabajo;
        this.avalPersona = avalPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNomina(boolean nomina) {
        this.nomina = nomina;
    }

    public void setAvalBancario(boolean avalBancario) {
        this.avalBancario = avalBancario;
    }

    public void setContratoTrabajo(boolean contratoTrabajo) {
        this.contratoTrabajo = contratoTrabajo;
    }

    public void setAvalPersona(boolean avalPersona) {
        this.avalPersona = avalPersona;
    }
    
    public boolean evaluarPersona (){
        boolean aprobacion = false;
        if (nomina == true || avalBancario == true || contratoTrabajo == true || avalPersona == true){
            aprobacion = true;
        }
        return aprobacion;
    }
}
