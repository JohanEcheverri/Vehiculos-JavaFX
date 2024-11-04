package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo {
    private Caja caja;

    public Moto(String matricula, String marca, String modelo, int añoFabricacion, Caja caja) {
        super(matricula, marca, modelo, añoFabricacion);
        this.caja = caja;
    }
    
    @Override
    public double calcularCostoReserva(Reserva reserva) { //Si la moto es automatica AUTOMATICA tiene tarifa adicional
    double TARIFA_ADICIONAL = 3000;

    double costo = reserva.getTarifa() * reserva.getDias();

    if (reserva.getVehiculo() instanceof Moto) {
        Moto moto = (Moto) reserva.getVehiculo(); 

        if (moto.getCaja() == Caja.AUTOMATICA) {
            costo += TARIFA_ADICIONAL;
        }
    }
    return costo;
}

    public Caja getCaja() {
        return caja;
    }
    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public String toString() {
        return "Moto [caja=" + caja + "]"+ super.toString();
    }
    
    
}
