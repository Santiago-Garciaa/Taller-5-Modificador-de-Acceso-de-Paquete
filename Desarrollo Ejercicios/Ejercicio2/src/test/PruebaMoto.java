package test;

import vehiculos.Moto;

public class PruebaMoto {
    public static void main(String[] args) {
        Moto m = new Moto("Deportiva");
        // Este acceso falla por que la clase moto es privada
    }
}