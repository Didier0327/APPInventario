package com.inventario.appinventario.model;

public class Activos {

    String codigo,encargado,equipo,estado,ubicacion;
    public Activos(){}

    public Activos(String cod, String encar, String equi,String est, String ubi) {
        this.codigo = cod;
        this.encargado = encar;
        this.equipo = equi;
        this.estado = est;
        this.ubicacion = ubi;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
