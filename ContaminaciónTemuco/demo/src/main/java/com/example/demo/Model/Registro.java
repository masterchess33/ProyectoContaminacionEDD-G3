package com.example.demo.Model;

public class Registro {

    private String sector;
    private int mes;
    private int dia;
    private double mp10;
    private double mp2_5;
    private double temperatura;

    public Registro(String sector, int mes, int dia, double mp10, double mp2_5, double temperatura) {
        this.sector = sector;
        this.mes = mes;
        this.dia = dia;
        this.mp10 = mp10;
        this.mp2_5 = mp2_5;
        this.temperatura = temperatura;
    }

    public String getSector() {
        return sector;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public double getMp10() {
        return mp10;
    }

    public double getMp2_5() {
        return mp2_5;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String toString(){
        return "Sector: "+sector+", mes: "+mes+", dia: "+dia+", PM10: "+mp10+", PM2.5: "+mp2_5+", temperatura: "+temperatura;
    }
}
