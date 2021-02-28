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
public class Punto07 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in); 
        String nom;
        System.out.println("---- Ganacias de Productos ----");
        System.out.println("Nombre del Producto: "); nom = x.nextLine();
        System.out.println("Costo del producto: "); int c=x.nextInt();
        System.out.println("Valor del producto en Venta: "); int v=x.nextInt();
        System.out.printf("La ganacia que se obtiene de la venta de: %s\nes de: %d\nBy Sergio De La Hoz\n", nom, (v-c));
        
    }    
}
