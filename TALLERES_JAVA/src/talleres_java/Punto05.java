    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres_java;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Punto05 {
    public static void main(String[] args){
        
       
        Scanner x=new Scanner(System.in); 
        System.out.println("Escriba la letra: ");
        char letras=x.next().charAt(0);
        int v =(int)letras;
        System.out.printf("El Caracter %s tiene un valor númerico de %d\nBy Sergio De La Hoz\n", letras, v);
        
    }
    
}
