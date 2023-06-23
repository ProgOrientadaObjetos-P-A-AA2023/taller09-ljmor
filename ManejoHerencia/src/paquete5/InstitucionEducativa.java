package paquete5;

public class InstitucionEducativa {
    
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nom, String sig) {
        nombre = nom;
        siglas = sig;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String a) {
        nombre = a;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String a) {
        siglas = a;
    }
    
    
}
