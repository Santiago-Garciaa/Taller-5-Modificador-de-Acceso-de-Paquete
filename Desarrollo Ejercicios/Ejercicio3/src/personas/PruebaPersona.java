package personas;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Santiago", 19);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.edad);
    }
}