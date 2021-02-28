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
public class Punto11 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in); 
        System.out.println("---- CALCULO DE LONGITUD Y AREA DE UNA CIRCUNFERENCIA ----");
        System.out.println("Escriba el número que quiere descomponer"); int num=x.nextInt();
        
        int u, d, c, um;
        if (num>1000)
            System.out.println("Error, el numero que  escribió es mayor a Mil\nBy Sergio De La Hoz");
        else
            num=num;
            u=num%10; 
            num=num/10;
            d=num%10;
            num=num/10;
            c=num%10;
            um=num/10;
            System.out.printf("Unidades", u);
       
        
            
                
    } 
}
