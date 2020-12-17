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
public class Profesor extends Persona {
    private Integer IdProfesor;
    private String Titulo;
    private String Departamento;

    public Profesor(String nombre, String Apellido, String Direccion) {
        super(nombre, Apellido, Direccion);
    }

   

    
    public Integer getIdProfesor() {
        return IdProfesor;
    }

    public void setIdProfesor(Integer IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getTitulo() {
        return Titulo;
    }



    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
}
