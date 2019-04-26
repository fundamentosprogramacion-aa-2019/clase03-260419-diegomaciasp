/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

import java.util.Scanner;
import paquetedos.MiMensaje;
/**
 *
 * @author Salas
 */
public class CondicionalSimple {
 public static void main (String []arg){
     Scanner entrada = new Scanner(System.in);
     System.out.println("Ingrese el valor de su calificacion");
     int calificacion = entrada.nextInt();
     
     String miMensaje = MiMensaje.mensajeUno;
     String miMensajeDos = MiMensaje.mensajeDos;
     if (calificacion >=85){
         System.out.printf("%s con %d puntos\n",miMensaje, calificacion);
     }
     Scanner entrad= new Scanner(System.in);
     System.out.println("Ingrese el valor de su segunda calificacion");
     int calificacion_2 = entrad.nextInt();
     
     if (calificacion_2 >=85){
         System.out.printf("%s con %d puntos\n",miMensajeDos, calificacion_2);
     }
     
    }
       
}
