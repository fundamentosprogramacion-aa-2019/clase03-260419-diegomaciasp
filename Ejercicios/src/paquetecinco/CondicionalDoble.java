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
public class CondicionalDoble {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el valor de su calificacion");
            int calificacion = entrada.nextInt();
            String mensajeUno = MiMensaje.mensajeUno;
            String mensajeDos = MiMensaje.mensajeDos;
     
     
        if (calificacion >=80){
            System.out.printf("%s con %d puntos\n",mensajeUno, calificacion);
                             
        }else{
            
           System.out.printf("%s con %d puntos\n",mensajeDos, calificacion);
                    
        }
    }
}
