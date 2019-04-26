/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

/**
 *
 * @author Salas
 */
import paquetedos.MiMensajeDos;
public class CondicionalAnidado {
    public static void main(String[] args) {
        // documentacion

        int calificacion = 80;
        String mensajeUno = MiMensajeDos.mensajeUno;
        String mensajeDos = MiMensajeDos.mensajeDos;
        String mensajeTres = MiMensajeDos.mensajeTres;
        String mensajeCuatro = MiMensajeDos.mensajeCuatro;
        String mensajeCinco = MiMensajeDos.mensajeCinco;
        
        if (calificacion >= 90) {
            System.out.printf(mensajeUno , mensajeTres,"con %d\n", calificacion);
                    
        } else {
            if (calificacion < 90 && calificacion >= 80) {
           System.out.printf(mensajeUno , mensajeCuatro,"con %d\n", calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
           System.out.printf(mensajeUno , mensajeCinco,"con %d\n", calificacion);
                } else {
                    System.out.printf(mensajeDos,"con %d\n", calificacion);
                }
            }
        }
    }
}
