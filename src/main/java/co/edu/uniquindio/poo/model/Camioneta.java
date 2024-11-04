package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo {
    private double capacidadCarga;

    public Camioneta(double capacidadCarga, String matricula, String marca, String modelo, int añoFabricacion) {
        super(matricula, marca, modelo, añoFabricacion);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCostoReserva(Reserva reserva) {//incluye % extra por tonelada
        double PORCENTAGEEXTRA = 0.05;
        return reserva.getTarifa()*reserva.getDias() + (capacidadCarga+PORCENTAGEEXTRA);
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camioneta [capacidadCarga=" + capacidadCarga + "]" + super.toString();
    }
    


    
}
