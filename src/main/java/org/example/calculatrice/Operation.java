package org.example.calculatrice;

public class Operation {

    private String type;
    private double nombre1;
    private double nombre2;
    private double resultat;
    private String message;

    public Operation() {
    }

    public Operation(String type, double nombre1, double nombre2) {
        this.type = type;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getNombre1() {
        return nombre1;
    }

    public void setNombre1(double nombre1) {
        this.nombre1 = nombre1;
    }

    public double getNombre2() {
        return nombre2;
    }

    public void setNombre2(double nombre2) {
        this.nombre2 = nombre2;
    }

    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}