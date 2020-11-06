package edu.it.model;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Objects;

import static edu.it.utiles.Utiles.ver;

public class Alumno {
    public String id;
    public String nombre;
    public String apellido;

    public Alumno(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Alumno() {
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder
                .reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return this.hashCode()==o.hashCode();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
