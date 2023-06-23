package paquete5;

public class Persona {
    private String nombre;
    private String apellido;
    private String username;

    public Persona(String nom, String ape, String user) {
        nombre = nom;
        apellido = ape;
        username = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String n) {
        apellido = n;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String n) {
        username = n;
    }
    
    
    
}
