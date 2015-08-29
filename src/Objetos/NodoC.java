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
public class NodoC {
    private String certificador;
    public NodoC next;
    private int id;
    private String nombreSolicitante, tipoCert, fecha, hora;

    public NodoC(String certificador, NodoC next, int id, String nombreSolicitante, String tipoCert) {
        this.certificador = certificador;
        this.next = next;
        this.id = id;
        this.nombreSolicitante = nombreSolicitante;
        this.tipoCert = tipoCert;
        Calendario cal=new Calendario();
        this.fecha =""+cal.getDia()+"/"+cal.getMes()+"/"+cal.getAño();
        this.hora = cal.getHora()+":"+cal.getMinuto()+":"+cal.getSeg();
    }

    public NodoC(String certificador, int id, String nombreSolicitante, String tipoCert, String fecha, String hora) {
        this.certificador = certificador;
        this.id = id;
        this.nombreSolicitante = nombreSolicitante;
        this.tipoCert = tipoCert;
        this.fecha = fecha;
        this.hora = hora;
        this.next=null;
    }  

    public String getCertificador() {
        return certificador;
    }

    public int getId() {
        return id;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public String getTipoCert() {
        return tipoCert;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
}
