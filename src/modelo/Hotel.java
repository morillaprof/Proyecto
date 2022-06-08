package modelo;

public class Hotel {
    private String nombre;
    private Integer categoría;
    private String dirección;
    private String ciudad;
    private String pais;


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoría() {
        return this.categoría;
    }

    public void setCategoría(Integer categoría) {
        this.categoría = categoría;
    }

    public String getDirección() {
        return this.dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
