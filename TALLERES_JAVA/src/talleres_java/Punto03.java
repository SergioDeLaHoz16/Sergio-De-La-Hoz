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
public class Punto03{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in); 
        System.out.println("XXXXXX SUMA, RESTA, DIVISION, MULTIPLICACION Y MODULO DE LOS DECIMALES XXXXXX");
        System.out.println("Escriba el valor 1(SOLO SE PUEDE DOS DECIMALES DESPUES DE LA COMA)"); double num1=entrada.nextDouble(); 
        System.out.println("Escribe el valor 2(SOLO SE PUEDE DOS DECIMALES DESPUES DE LA COMA)"); double num2=entrada.nextDouble();
        System.out.println("Escribe el valor 3(SOLO SE PUEDE DOS DECIMALES DESPUES DE LA COMA)"); double num3=entrada.nextDouble();
        System.out.printf("La Suma de %.2f + %.2f + %.2f es: %.2f\n", num1, num2, num3, (num1+num2+num3));
        System.out.printf("El Promedio de %.2f, %.2f y %.2f es: %.2f\n: ", num1, num2, num3, ((num1+num2+num3)/(3)));
        System.out.printf("El Producto(Multiplicacion) de %.2f x %.2f x %.2f es: %.2f\n", num1, num2, num3, (num1*num2*num3));
        System.out.printf("El Cociente o Division de %.2f, %.2f y %.2f es: %.2f\n", num1, num2, num3,((num1/num2)/num3));
        System.out.printf("El Modulo de la Division es: %.2f", ((num1/num2)/num3));
        System.out.println("By Sergio De La Hoz");
    }   
}
