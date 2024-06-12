package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "empleado")
public class Empleado {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Empleado")
    private int id_Empleado;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido_1")
    private String apellido_1;
    
    @Column(name = "apellido_2")
    private String apellido_2;
    
    @Column(name = "Dni")
    private String Dni;
    
    @Column(name = "fechaNac")
    private String fechaNac;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "Sexo")
    private String Sexo;
    
    @Column(name = "sueldo")
    private String sueldo;
    
    @Column(name = "sueper_Dni")
    private String sueper_Dni;
    
    @Column(name = "Dno")
    private String Dno;
    
    // Constructor sin argumentos
    public Empleado() {
    }

    // Constructor con argumentos
    public Empleado(int idEmpleado, String nombre, String apellido_1, String apellido_2, String dni, String fechaNac,
                    String direccion, String sexo, String sueldo, String sueper_Dni, String dno) {
        super();
        this.id_Empleado = idEmpleado;
        this.nombre = nombre;
        this.apellido_1 = apellido_1;
        this.apellido_2 = apellido_2;
        Dni = dni;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        Sexo = sexo;
        this.sueldo = sueldo;
        this.sueper_Dni = sueper_Dni;
        Dno = dno;
    }

    // Getters y setters
    public int getIdEmpleado() {
        return id_Empleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.id_Empleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_1() {
        return apellido_1;
    }

    public void setApellido_1(String apellido_1) {
        this.apellido_1 = apellido_1;
    }

    public String getApellido_2() {
        return apellido_2;
    }

    public void setApellido_2(String apellido_2) {
        this.apellido_2 = apellido_2;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getSueper_Dni() {
        return sueper_Dni;
    }

    public void setSueper_Dni(String sueper_Dni) {
        this.sueper_Dni = sueper_Dni;
    }

    public String getDno() {
        return Dno;
    }

    public void setDno(String dno) {
        Dno = dno;
    }

    @Override
    public String toString() {
        return "Empleado [idEmpleado=" + id_Empleado + ", nombre=" + nombre + ", apellido_1=" + apellido_1
                + ", apellido_2=" + apellido_2 + ", Dni=" + Dni + ", fechaNac=" + fechaNac + ", direccion=" + direccion
                + ", Sexo=" + Sexo + ", sueldo=" + sueldo + ", sueper_Dni=" + sueper_Dni + ", Dno=" + Dno + "]";
    }
}


	
	