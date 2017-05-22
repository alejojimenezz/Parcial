/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uim;

import java.io.FileNotFoundException;

/**
 *
 * @author Estudiante
 */
public interface UIM {
    public void Escribir (Ciudad Uim) throws FileNotFoundException;
    public Ciudad Leer();
}
