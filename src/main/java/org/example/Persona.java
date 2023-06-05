package org.example;

public class Persona {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private HistorialMedico historial;

    public HistorialMedico getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    public Persona(String nombre, HistorialMedico historial) {
        this.nombre = nombre;
        this.historial = historial;
    }
}
