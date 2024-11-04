package co.edu.uniquindio.poo.model;



public class Reserva {
    private double costo;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int dias;

    public Reserva(Cliente cliente, int dias, double tarifa, Vehiculo vehiculo) {
        this.cliente = cliente;
        this.costo = 0;
        this.dias = dias;
        this.vehiculo = vehiculo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Reserva [costo=" + costo + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", tarifa=" + tarifa
                + ", dias=" + dias + "]";
    }

    

    
    
}
