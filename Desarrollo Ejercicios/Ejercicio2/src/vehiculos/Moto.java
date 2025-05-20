package vehiculos;

class Moto extends Vehiculo {
    Moto(String tipo) {
        super(tipo);
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}