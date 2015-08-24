/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.Calendar;

/**
 *
 * @author Alcides
 */
public class Calendario {
    private int dia;
    private int mes;
    private int año;
    private int hora;
    private int minuto;
    private int seg;
    private int miliSeg;
    
    public Calendario(){
        Calendar cal1 = Calendar.getInstance();
        dia = cal1.get(Calendar.DATE);
        mes=cal1.get(Calendar.MONTH);
        año=cal1.get(Calendar.YEAR);
        hora=cal1.get(Calendar.HOUR);
        minuto=cal1.get(Calendar.MINUTE);
        seg=cal1.get(Calendar.SECOND);
        miliSeg=cal1.get(Calendar.MILLISECOND);
    }
}
