/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallern.pkg2;

import java.util.Scanner;

/**
 * Escriba un método que tome un valor entero y devuelva el número con sus dígitos invertidos. Por ejemplo, para el
número 7631, el método debe regresar 1367. Incorpore el método en una aplicación que reciba como entrada un
valor del usuario y muestre el resultado
 *
 * @author Laura
 */
public class Punto10 {
public static void main(String arg[]){        
    Scanner Entrada = new  Scanner (System.in);
    int numero,numInvertido = 0,modulo;
    
        System.out.println(" Digite un numero entero");
        numero= Entrada.nextInt();
        
        while (numero>0){
            modulo = numero % 10;
            numInvertido = numInvertido*10 + modulo;
            numero/=10;
            
        }
        System.out.println(" El numero invertido es: "+numInvertido);
 
    }
    
}
