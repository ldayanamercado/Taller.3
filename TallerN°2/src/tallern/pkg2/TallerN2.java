/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallern.pkg2;

import java.util.Scanner;

/**
 *
 * Un vendedor minorista en línea requiere un informe de las ventas del día. Para ello cuenta con tres arreglos de n
 * elementos cada uno: A, B y C. El primero almacena el código de los productos vendidos en el día, El segundo almacena
 * el valor de venta de cada producto, y el tercero la cantidad de unidades vendidas de cada producto
 *  Requiere un aplicativo que le calcule rápidamente los siguientes datos:
     Total productos vendidos en el día.
     Total ingresos por ventas del día.
     El producto más vendido.
     El producto más costoso vendido.
 * @author Laura
 */
public class TallerN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo ");
        int tamaño= Entrada.nextInt();
        int A[] = new int[tamaño];// creo el arreglo
        int i, j,k,suma=0;
        float totalv=0;
        System.out.println(" \n\tDigite el codigo de los productos vendidos eb el dia");
        for (i=0;i<A.length;i++){
            System.out.printf( " Valor de A[%d]:",i);
            A[i]=Entrada.nextInt();
        }
        float Aux2=0;
        int VMax = 0;
       System.out.println(" \n\tDigite el valor de venta los productos vendidos en el dia");
        float B[] = new float [tamaño];
        for (j=0;j<B.length;j++){
            System.out.printf( " Valor de B[%d]:",j);
            B[j]=Entrada.nextFloat();
            totalv+=B[j];
            if (B[j]>Aux2){
                VMax= A[j];
                Aux2=B[j];
            }else{
                Aux2=B[j];
        }
            
            
            
        }
       int aux=0;
       int Pmax = 0;
        System.out.println(" \n\tDigite la cantidad de los productos vendidos");
        int C[] = new int [tamaño];
        for (k=0;k<C.length;k++){
            System.out.printf( " Valor de C[%d]:",k);
            C[k]=Entrada.nextInt();
                 suma+=C[k];
                 
            if (C[k]>aux){
                Pmax= A[k];
                aux=C[k];
            }else{
                aux=C[k];
        }
        }
        
        System.out.println("Los Datos Registrados Son: ");
        //mostrando los vectores
        for (int l = 0; l <tamaño; l++) {
            System.out.printf("Producto: A[%d] B[%.2f] C[%d]: \n",A[l],B[l],C[l]);
            
        }
           //  Total productos vendidos en el día.
           System.out.printf(" La cantidad de Productos vendidio en el dia son: [%d]\n",suma);
           // Total ingresos por ventas del día.
           System.out.printf("  Total ingresos por ventas del día.[%.2f] ",totalv);
           //     El producto más vendido.
           System.out.printf("\nel producto mas vendido es: [%d] ",Pmax);
           //     El producto más costoso vendido.
           System.out.printf("\nel producto mas costoso es : [%d] ",VMax);
                 

    }
    
}
