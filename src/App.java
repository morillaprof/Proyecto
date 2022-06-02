import modelo.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Voy a crear mi primera persona");

        Persona persona1 = new Persona("Iván", "Morilla", "Párraga");

        System.out.println(persona1.toString());

    }
}
