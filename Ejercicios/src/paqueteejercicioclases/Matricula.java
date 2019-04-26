/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteejercicioclases;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Matricula {
    public static void main(String[] args) {
            
    Scanner entrada = new Scanner(System.in);
        String ciudad;
        String estadoCivil;
        int edad;
        double impuesto=0;
        double descuento=0;
        double costo_matricula=1200;
        double costo_final_matricula=0;
        
        System.out.println("Ingrese el nombre de su ciudad: ");
            ciudad = entrada.nextLine();
        System.out.println("Ingrese su estado civil: ");
            estadoCivil = entrada.nextLine();
        System.out.println("Ingrese su edad");
            edad = entrada.nextInt();
        if (ciudad.equals("Loja")|| ciudad.equals("Zamora")){
            descuento =(costo_matricula * 20)/100;
            costo_final_matricula = costo_matricula - descuento;
        }
        if ((edad>=17) && (edad<20)){
            descuento =(costo_matricula * 10)/100;
            costo_final_matricula = costo_matricula - descuento;
        }
        if (estadoCivil.equals("Casado")){
            descuento =(costo_matricula * 5)/100;
            costo_final_matricula = costo_matricula - descuento;
        }
        impuesto = (costo_final_matricula * 2)/100;  
        costo_final_matricula = costo_matricula - descuento + impuesto;
        System.out.printf("Su matricula es %f :", costo_final_matricula);
    }
}
