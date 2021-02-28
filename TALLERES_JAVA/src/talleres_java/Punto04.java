/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres_java;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Punto04 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in); 
        System.out.println("---- CALCULO DE LONGITUD Y AREA DE UNA CIRCUNFERENCIA ----");
        System.out.println("¿Cuál es el Radio de la Circunferencia?"); float r=x.nextFloat();
        System.out.printf("El Área de la circunferencia es: %.2f \n", (r*r)*3.14); 
        System.out.printf("La Longitud de la Circunferencia es: %.2f \n", (2*3.14*r));
        System.out.println("By Sergio De La Hoz");
    }
}
