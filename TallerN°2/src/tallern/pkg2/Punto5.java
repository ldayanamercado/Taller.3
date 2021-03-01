/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallern.pkg2;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Punto5 {
    public static void main (String[] args){
           binarioDecimal();
        decimalBinario();
    }
    public static void binarioDecimal(){
        Scanner Entrada = new Scanner(System.in);
        long numero, aux, digito, decimal, num;
        int exponente;
        boolean esBinario;
        do {
            System.out.print("Digita un numero en  binario: ");
            numero = Entrada.nextLong();
            num = numero;
            esBinario = true;
            aux = numero;
            while (aux != 0){
                digito = aux % 10; 
                if (digito != 0 && digito != 1)
                {
                    esBinario = false; 
                }
                aux = aux / 10; 
            }
        } while (!esBinario); 
            exponente = 0;
            decimal = 0; 
           while(numero != 0)
        {
            digito = numero % 10; 
            decimal = decimal + digito * (int) Math.pow(2, exponente); 
            exponente++; 
            numero = numero / 10; 
        }  
        System.out.printf("la conversion  binario [%d] en decimal es: [%d] \n\n",num,decimal);
    }
    public static void decimalBinario(){
        Scanner Entrada = new Scanner(System.in);
        int numero, exp, digito, num;
        double binario;
        do{ 
            System.out.print("Digita un numero entero");                                                
            numero = Entrada.nextInt();
            num = numero;
        }while(numero < 0);
        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;           
                binario = binario + digito * Math.pow(10, exp);                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("la conversion  decimal [%d] a binario es: [%.0f]\n\n",num,binario);
    }
}
    
    
    


