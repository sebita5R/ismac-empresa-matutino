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
@Table(name = "proyecto")
public class Proyecto {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NumProyecto")
    private int NumProyecto;
    
    @Column(name = "NombreProyecto")
    private String NombreProyecto;
    
    @Column(name = "UbicacionProyecto")
    private String UbicacionProyecto;
    
    @Column(name = "NumDptoProyecto")
    private String NumDptoProyecto;

    // Constructor sin argumentos
    public Proyecto() {
    }

    // Constructor con argumentos
    public Proyecto(int numProyecto, String nombreProyecto, String ubicacionProyecto, String numDptoProyecto) {
        super();
        this.NumProyecto = numProyecto;
        this.NombreProyecto = nombreProyecto;
        this.UbicacionProyecto = ubicacionProyecto;
        this.NumDptoProyecto = numDptoProyecto;
    }

    // Getters y setters
    public int getNumProyecto() {
        return NumProyecto;
    }

    public void setNumProyecto(int numProyecto) {
        this.NumProyecto = numProyecto;
    }

    public String getNombreProyecto() {
        return NombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.NombreProyecto = nombreProyecto;
    }

    public String getUbicacionProyecto() {
        return UbicacionProyecto;
    }

    public void setUbicacionProyecto(String ubicacionProyecto) {
        this.UbicacionProyecto = ubicacionProyecto;
    }

    public String getNumDptoProyecto() {
        return NumDptoProyecto;
    }

    public void setNumDptoProyecto(String numDptoProyecto) {
        this.NumDptoProyecto = numDptoProyecto;
    }

    @Override
    public String toString() {
        return "Proyecto [NumProyecto=" + NumProyecto + ", NombreProyecto=" + NombreProyecto + ", UbicacionProyecto="
                + UbicacionProyecto + ", NumDptoProyecto=" + NumDptoProyecto + "]";
    }
}
