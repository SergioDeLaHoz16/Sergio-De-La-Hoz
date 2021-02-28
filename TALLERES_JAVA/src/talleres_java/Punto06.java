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
public class Punto06 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in); 
        System.out.println("******INDICE DE MASA CORPORAL*******");
        System.out.println("Escriba el Peso en Kilogramos, por favor."); float peso=x.nextFloat();
        System.out.println("Escriba la Altura en Metros, por favor(Recuerde usar ',' es decir '1,75' "); float altura=x.nextFloat();
        System.out.printf("Tú Masa Corporal es: %.4f\nBy Sergio De La Hoz\n", ((peso)/(altura*altura)));
        
    }
}
