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
public class CargaElectrica {
    private int x;
    private String CE;
    
    public CargaElectrica() {
        if (x==1) {
            CE = "Tormenta Electrica";
        } else if (x==2) {
            CE = "Rayos";
        } else if (x==3) {
            CE = "Truenos";
        } else if (x==4) {
            CE = "Normal";
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getCE() {
        return CE;
    }

    public void setCE(String CE) {
        this.CE = CE;
    }

    public CargaElectrica(int x, String CE) {
        this.x = x;
        this.CE = CE;
    }
}
