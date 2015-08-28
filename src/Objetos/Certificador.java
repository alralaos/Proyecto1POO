/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Alcides
 */
public class Certificador {
    private String nombre,codigo;
    private ArrayList<Certificaciones> lista;

    public Certificador(String nombre, String codigo, ArrayList<Certificaciones> lista) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Certificaciones> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Certificaciones> lista) {
        this.lista = lista;
    }
}
