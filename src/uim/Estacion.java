/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uim;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Estacion {
    private String NombreEstacion;
    private String Ubicacion;
    private String FechaInstalacion;
    ArrayList <Sensor> Sensores;
    
    public ArrayList <Sensor> getSensores() {
        return Sensores;
    }
    
    public Estacion() {
        this.Sensores = new ArrayList<>();
    }

    public void AddSensor (Sensor sensor) {
        this.Sensores.add(sensor);
    }

    public Estacion(String NombreEstacion, String Ubicacion, String FechaInstalacion) {
        this.NombreEstacion = NombreEstacion;
        this.Ubicacion = Ubicacion;
        this.FechaInstalacion = FechaInstalacion;
    }

    public String getNombreEstacion() {
        return NombreEstacion;
    }

    public void setNombreEstacion(String NombreEstacion) {
        this.NombreEstacion = NombreEstacion;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getFechaInstalacion() {
        return FechaInstalacion;
    }

    public void setFechaInstalacion(String FechaInstalacion) {
        this.FechaInstalacion = FechaInstalacion;
    }

    @Override
    public String toString() {
        String nextLine = "\n";
        return NombreEstacion + nextLine + Sensores + nextLine;
    }
    
    public double PromSensor() {
        double PromTemperatura;
        double PromLluvia;
        int PromCargaElectrica;
                
        return 0;
    }
}
