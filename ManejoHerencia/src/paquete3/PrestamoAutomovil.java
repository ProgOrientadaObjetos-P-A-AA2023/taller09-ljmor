package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

public class PrestamoAutomovil extends Prestamo{
    private String tipoAuto;
    private String marcaAuto;
    private Persona garante;
    private double valorAuto;
    private double valorMensual;

    public PrestamoAutomovil(String tipAu, String marAu, Persona gar,
            double valAu, Persona ben, int temP, String ciuP) {
        super(ben, temP, ciuP);
        tipoAuto = tipAu;
        marcaAuto = marAu;
        garante = gar;
        valorAuto = valAu;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String t) {
        tipoAuto = t;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String t) {
        marcaAuto = t;
    }

    public Persona getGarante() {
        return garante;
    }

    public void setGarante(Persona t) {
        garante = t;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public void setValorAuto(double t) {
        valorAuto = t;
    }

    public double getValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        valorMensual = valorAuto/tiempoPrestamo;
    }

    @Override
    public String toString() {
        String m = String.format("%s-Ciudad Prestamo: %s\n\n"
                + "-Prestamo Automovil\n"
                + "\tTipo de auto: %s\n"
                + "\tMarca de auto: %S\n"
                + "\tValor del auto: $%.2f\n"
                + "\tValor mensual a pagar: $%.2f\n"
                + "-Garante\n"
                + "\tNombre: %s %s\n"
                + "\tUsername: %s\n\n",
                super.toString(),
                ciudadPrestamo.toLowerCase(),
                tipoAuto,
                marcaAuto,
                valorAuto,
                valorMensual,
                garante.getNombre(),
                garante.getApellido(),
                garante.getUsername());
        return m;
    }
    
    
}
