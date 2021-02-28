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
public class Punto10{
     public static void main(String[] args) {
        Scanner x=new Scanner(System.in); 
        System.out.println("******CONVERSION DE KILOGRAMOS A GRAMOS, LIBRAs y TONELADAS*******");
        System.out.println("Escriba el Peso en Kilogramos para Convertirlos"); float num1=x.nextFloat(); 
        System.out.printf("El Peso de %.2f Kg a Gramos es: %.2f\n ", num1, (num1*1000)); 
        System.out.printf("El Peso de %.2f Kg a Toneladas es: %.3f\n ", num1, (num1/1000));
        System.out.printf("El Peso de %.2f Kg a Libras es: %.3f\n", num1, (num1*2.205));
        System.out.println("By Sergio De La Hoz");
     }
}
