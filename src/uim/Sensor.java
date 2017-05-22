/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uim;

/**
 *
 * @author Estudiante
 */
public class Sensor extends CargaElectrica{
    private String Marca;
    private int Referencia;
    private String FechaInstalacion;
    private int MmLluviaXMin;
    private double Temperatura;
    
    @Override
    public String getCE() {
        return super.getCE();
    }

    public Sensor(String Marca, int Referencia, String FechaInstalacion, int MmLluviaXMin, double Temperatura, int x, String CE) {
        super(x, CE);
        this.Marca = Marca;
        this.Referencia = Referencia;
        this.FechaInstalacion = FechaInstalacion;
        this.MmLluviaXMin = MmLluviaXMin;
        this.Temperatura = Temperatura;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getReferencia() {
        return Referencia;
    }

    public void setReferencia(int Referencia) {
        this.Referencia = Referencia;
    }

    public String getFechaInstalacion() {
        return FechaInstalacion;
    }

    public void setFechaInstalacion(String FechaInstalacion) {
        this.FechaInstalacion = FechaInstalacion;
    }

    public int getMmLluviaXMin() {
        return MmLluviaXMin;
    }

    public void setMmLluviaXMin(int MmLluviaXMin) {
        this.MmLluviaXMin = MmLluviaXMin;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }

    @Override
    public String toString() {
        String nextLine = "\n";
        return FechaInstalacion + " " + Temperatura + " " + MmLluviaXMin + " " + this.getX() + nextLine;
    }
    
}
