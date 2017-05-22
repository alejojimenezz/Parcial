/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uim;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author Estudiante
 */
public class Archivo implements UIM{
    private File archivo;
    public Archivo() {
        this.archivo = new File ("datos.txt");
    }

    @Override
    public void Escribir(Ciudad Uim) throws FileNotFoundException {
        PrintStream salida = new PrintStream(archivo);
    }

    @Override
    public Ciudad Leer() {
        return null;
    }
}
