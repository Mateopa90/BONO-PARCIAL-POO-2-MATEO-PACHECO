package Datos;

public class Persona {
    private String Nombre;
    private int DNI;
    private int Edad;
    private String sexo;
    private boolean nomina;
    private boolean Aval_Bancario;
    private boolean Por_Contrato;
    private boolean Aval_Persona;

    public Persona(String nombre, int documento, int edad, String sexo, boolean nomina, 
            boolean avalBancario, boolean contratoTrabajo, boolean avalPersona) {
        this.Nombre = nombre;
        this.DNI = documento;
        this.Edad = edad;
        this.sexo = sexo;
        this.nomina = nomina;
        this.Aval_Bancario = avalBancario;
        this.Por_Contrato = contratoTrabajo;
        this.Aval_Persona = avalPersona;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.DNI = documento;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNomina(boolean nomina) {
        this.nomina = nomina;
    }

    public void setAvalBancario(boolean avalBancario) {
        this.Aval_Bancario = avalBancario;
    }

    public void setContratoTrabajo(boolean contratoTrabajo) {
        this.Por_Contrato = contratoTrabajo;
    }

    public void setAvalPersona(boolean avalPersona) {
        this.Aval_Persona = avalPersona;
    }

    public int getDocumento() {
        return DNI;
    }
    
    public boolean Verificar_Persona (){
        boolean aprobacion = false;
        if (nomina == true || Aval_Bancario == true || Por_Contrato == true || Aval_Persona == true){
            aprobacion = true;
        }
        return aprobacion;
    }
    
    public void Consultar_Datos(){
         String info = "Nombre: " + this.Nombre + "\n" + 
                "Documento de Identidad: " + this.DNI + "\n" + 
                "Edad: " + this.Edad + "\n" + 
                "Sexo: " + this.sexo + "\n" + 
                "La persona tiene una nómina: " + this.nomina + "\n" + 
                "La persona tiene aval bancario: " + this.Aval_Bancario + "\n" + 
                "La persona tiene un contrato de trabajo: " + this.Por_Contrato + "\n" +
                "La persona cuenta con el aval de una persona que cumple con todas las condiciones: " 
                 + this.Aval_Persona;
        System.out.println(info);
    }
}

