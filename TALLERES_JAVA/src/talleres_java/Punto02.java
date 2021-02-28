/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres_java;

import java.util.*;
/**
 *
 * @author usuario
 */
public class Punto02 {
     public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        
        System.out.println("******Suma, Resta y Multiplicación******");
        System.out.println("Escriba el valor 1");
        int num1=x.nextInt();
        System.out.println("Escribe el valor 2");
        int num2=x.nextInt();
        
        System.out.printf("Suma: %d + %d = %d\n", num1, num2,(num1+num2));
        System.out.printf("Producto(Multiplicacion: %d x %d = %d\n", num1, num2,(num1*num2));
        System.out.printf("Diferencia(Resta): %d - %d = %d\n", num1, num2,(num1-num2));
        System.out.println("By Sergio De La Hoz");
     }
}
