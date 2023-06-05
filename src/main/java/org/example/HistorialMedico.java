package org.example;

public class HistorialMedico {
    private String enfermedad;
    private int gravedad;

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public HistorialMedico(String enfermedad, int gravedad) {
        this.enfermedad = enfermedad;
        this.gravedad = gravedad;
    }
}
