package paquete4;

import paquete2.Prestamo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

public class PrestamoEducativo extends Prestamo{
    
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String nivEst, InstitucionEducativa centEd,
            double valCar, Persona ben, int temP, String ciuP) {
        super(ben, temP, ciuP);
        nivelEstudio = nivEst;
        centroEducativo = centEd;
        valorCarrera = valCar;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitucionEducativa n) {
        centroEducativo = n;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double n) {
        valorCarrera = n;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        double div = valorCarrera/tiempoPrestamo;
        double porciento =  div * 0.10;
        valorMensual = div - porciento;
    }

    @Override
    public String toString() {
        String m = String.format("%s-Ciudad Prestamo: %s\n\n"
                + "-Prestamo Educativo\n"
                + "\tNivel de estudio: %s\n"
                + "\tValor de la carrera: $%.2f\n"
                + "\tValor mensual a pagar: $%.2f\n"
                + "-Centro Educativo\n"
                + "\tNombre: %s\n"
                + "\tSiglas: %S\n\n",
                super.toString(),
                ciudadPrestamo.toUpperCase(),
                nivelEstudio,
                valorCarrera,
                valorMensual,
                centroEducativo.getNombre(),
                centroEducativo.getSiglas());
        return m;
    }
    
    
    
    
}
