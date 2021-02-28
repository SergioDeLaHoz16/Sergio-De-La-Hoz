/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres_java;

import java.util.*;
public class Punto01{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Escriba el valor 1");
        int num1=x.nextInt();
        System.out.println("Escribe el valor 2");
        int num2=x.nextInt();
        System.out.printf("X = %d\n", num1);
        System.out.printf("El Valor de %d + %d es %d\n", num1, num1, (num1+num1));
        System.out.printf("X = %.2f\n",(double)num1 );//double para convertir el numero en float
        System.out.printf("%d - %d\n", (num1+num2), (num2+num1));
        System.out.println("By Sergio De La Hoz");
    }
        
  
}
