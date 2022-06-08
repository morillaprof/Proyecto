package modelo;

import java.util.ArrayList;

class Viaje {

    private int idViaje;
    private String destino;
    private Integer noches;
    private ArrayList<String> alojamientos;
    

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getNoches() {
        return this.noches;
    }

    public void setNoches(Integer noches) {
        this.noches = noches;
    }

    public ArrayList<String> getAlojamientos() {
        return this.alojamientos;
    }

    public void setAlojamientos(ArrayList<String> alojamientos) {
        this.alojamientos = alojamientos;
    }

    public int getIdViaje() {
        return this.idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }



}