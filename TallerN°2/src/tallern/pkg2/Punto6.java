/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallern.pkg2;

import java.util.Scanner;

/**
 *Escriba un programa en Java que reciba como entrada una serie de 10 números enteros, y que determine e imprima
el mayor de los números. Su programa debe utilizar cuando menos las siguientes tres variables:
a) contador: Un contador para contar hasta 10 (para llevar el registro de cuántos números se han introducido, y para
determinar cuándo se hayan procesado los 10 números).
b) número: El entero más reciente introducido por el usuario.
c) mayor: El número más grande encontrado hasta ahora
 * @author Laura
 */
public class Punto6 {
    
    public static void main (String[]args){
    Scanner Entrada = new Scanner (System.in);
    
           
    int numero[] = new int[10];
    int aux=0;
    int numeroMayor;
    numeroMayor=0;
            System.out.println(" \n\tDigite 10 numeros");
        for (int i=0;i<numero.length;i++){
            System.out.printf( " Valor en la posicion[%d]:",i);
            numero[i]=Entrada.nextInt();
            
            if (numeroMayor <numero[i]){
                numeroMayor=numero[i];
                
        }
        }
        System.out.println(" El numero mayor es:"+numeroMayor);
    
    
    
    
    }
    
}
