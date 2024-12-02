import models.Persona;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("Bryan");
        persona.setEdad(18);

        cajaString.guardar("Guardo un String");
        cajaInteger.guardar(10);
        cajaPersona.guardar(persona);

        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener().getNombre());

        Par<Integer, String> parIntString = new Par<>();
        Par<String, Integer> parStringInt = new Par<>(); 
    }
}
