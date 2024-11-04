package co.edu.uniquindio.poo.model;

public class Cliente {
    private String nombres, apellidos, cedula, email, telefono;
    private int edad;

    public Cliente( String nombres, String apellidos,  String cedula,String email,String telefono, int edad){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.cedula=cedula;
        this.edad=edad;
        this.email=email;
        this.telefono=telefono;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Cliente [nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + ", email=" + email
                + ", telefono=" + telefono + ", edad=" + edad + "]";
    }


    
}
