package Main;

import Datos.FincaRaiz;
import Datos.Persona;

public class Parcial_2 {

    public static void main(String[] args) {
        FincaRaiz m = new FincaRaiz();
        m.agregarPiso(1, 12.2, "asdasda", 4, 1125.5, 12.5, true);
        m.agregarLocalComercial("AASDASD", true, "ASDASDASD", 0, 0, 0, true);
        
        m.agregarEdificio("asdahgsdasd", "este barrio", 0, 0, 0, true);
        
        m.agregarEdificio("ASHJH", "as", 0, 0, 0, true);
        
        //m.eliminarEdificio("ASHJH", "as", 0, 0, 0, true);
        m.consultarInventarios();
        Persona p = new Persona("Carlos", 1007392910, 23, "Hombre", true, false, false, false);
        Persona e = new Persona("Margsdas", 12312, 123, "ad", false, false, false, false);
        //e.consultarDatos();
        //m.consultarInventario();
    }
}
