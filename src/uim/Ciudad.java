/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uim;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Ciudad implements UIM {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Ciudad(String city) {
        this.city = city;
    }
    ArrayList <Estacion> Estaciones;    

    public ArrayList <Estacion> getEstaciones() {
        return Estaciones;
    }
    
    public Ciudad() {
        this.Estaciones = new ArrayList<>();
    }

    public void AddEstacion (Estacion estacion) {
        this.Estaciones.add(estacion);
    }

    @Override
    public String toString() {
        String nextLine = "\n";
        return city + nextLine + Estaciones + nextLine;
    }

    @Override
    public void Escribir(Ciudad Uim) throws FileNotFoundException {
        
    }

    @Override
    public Ciudad Leer() {
        return null;
    }
    
    
}
