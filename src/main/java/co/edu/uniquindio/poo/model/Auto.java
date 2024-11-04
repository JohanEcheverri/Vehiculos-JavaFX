package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo{
    private int numPuertas;
    //private Reserva reserva; 

    public Auto(int numeroPuertas, String matricula, String marca, String modelo, int añoFabricacion) {
        super(matricula, marca, modelo, añoFabricacion);
        this.numPuertas = numeroPuertas;
    }

    @Override
    public double calcularCostoReserva(Reserva reserva) {
        return reserva.getTarifa()*reserva.getDias();

    }

    public int getNumeroPuertas() {
        return numPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Auto [numeroPuertas=" + numPuertas + "]" + super.toString();
    }

    
    

    
    
}
