/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author maty
 */
public class Alumno extends Persona {
    private Integer IdAlmuno;
    private Integer annioIngeso;
    private String Carrera;

    public Alumno(String nombre, String Apellido, String Direccion) {
        super(nombre, Apellido, Direccion);
    }

   

    public Integer getIdAlmuno() {
        return IdAlmuno;
    }

    public void setIdAlmuno(Integer IdAlmuno) {
        this.IdAlmuno = IdAlmuno;
    }

    public Integer getAnnioIngeso() {
        return annioIngeso;
    }

    public void setAnnioIngeso(Integer annioIngeso) {
        this.annioIngeso = annioIngeso;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
}
