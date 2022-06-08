package modelo;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;


    //Getters and Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    //Constructor con parámetros
    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }


    @Override
    public String toString() {
        return "Esta persona se llama " + getNombre() + " " + getApellido1() + " " + getApellido2();
    }


}

    