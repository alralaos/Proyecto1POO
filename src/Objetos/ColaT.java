/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Alcides
 */
public class ColaT {
    private NodoC primerNodo;
    private NodoC ultimoNodo;
    private int size;
    private String nombre;

    public ColaT() {
        primerNodo=ultimoNodo=null;
        size=0;
    }

    public NodoC getPrimerNodo() {
        return primerNodo;
    }

    public void setPrimerNodo(NodoC primerNodo) {
        this.primerNodo = primerNodo;
    }

    public NodoC getUltimoNodo() {
        return ultimoNodo;
    }

    public void setUltimoNodo(NodoC ultimoNodo) {
        this.ultimoNodo = ultimoNodo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
