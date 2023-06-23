package paquete2;

import paquete5.Persona;

public class Prestamo {
    
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;

    public Prestamo(Persona ben, int temP, String ciuP) {
        beneficiario = ben;
        tiempoPrestamo = temP;
        ciudadPrestamo = ciuP;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona s) {
        beneficiario = s;
    }

    public int getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(int s) {
        tiempoPrestamo = s;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setCiudadPrestamo(String s) {
        ciudadPrestamo = s;
    }

    @Override
    public String toString() {
        String m = String.format("===============================\n"
                + "-Beneficiario:\n"
                + "\tNombre: %s %s\n"
                + "\tUsername: %s\n\n"
                + "-Tiempo Prestamo: %d meses.\n"
                + "-Ciudad Prestamo: %s\n\n",
                beneficiario.getNombre(),
                beneficiario.getApellido(),
                beneficiario.getUsername(),
                tiempoPrestamo,
                ciudadPrestamo.toLowerCase());
        return m;
    }
    
    
    
    
}
