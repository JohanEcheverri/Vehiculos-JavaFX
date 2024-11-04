package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private Collection<Vehiculo> vehiculos;
    private Collection<Reserva> reservas;
    private Collection<Cliente> clientes;
    private double tarifa;
    
    public Empresa(String nombre, Collection<Vehiculo> vehiculos, Collection<Reserva> reservas,
            Collection<Cliente> clientes, double tarifa) {
        this.nombre = nombre;
        this.vehiculos = new LinkedList<>();
        this.reservas = new LinkedList<>();
        this.clientes = new LinkedList<>();
    }

    public void eliminarCliente(String cedula){
        if( verificarCliente(cedula) ){
            for (Cliente cliente : clientes) {
                if(cliente.getCedula().equals(cedula)){
                    clientes.remove(cliente);
                }
            }
        }
        else{
            System.out.println("No se encontro al cliente");
        }
    }
    
    public boolean verificarCliente(String cedula){
        boolean c=false;
        for (Cliente cliente : clientes) {
            if(cliente.getCedula().equals(cedula)){
                c=true;
            }
        }
        return c;
    }

    public void agregarCliente(Cliente cliente){
        if(!verificarCliente(cliente.getCedula())){
            clientes.add(cliente);
        }
        else{
            System.out.println("El cliente ya esta agregado");
        }
    }



    public boolean verificarVehiculo(String matricula){
        boolean c=false;
        for(Vehiculo vehiculo: vehiculos){
            if(vehiculo.getMatricula().equals(matricula)){
                c=true; 
            }
        }
        return c;    
    }
    
    public void eliminarVehiculo(Vehiculo vehiculo){
    

    }
    public void añadirVehiculo(Vehiculo vehiculo){
        if(!verificarVehiculo(vehiculo.getMatricula())){
            vehiculos.add(vehiculo);
            
        }
        else{
            System.err.println("El vehiculo ya esta añadido");
        } 
    }


    




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Collection<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Collection<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", vehiculos=" + vehiculos + ", reservas=" + reservas + ", clientes="
                + clientes + "]";
    }
}
