/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadocubo;

import java.util.Scanner;

/**
 *
 * @author MoisesDario
 */
public class ElevadoCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int arreglo[];
        int resultado;
        
        System.out.print("Ingrese el numero de operaciones: ");
        int digito = sc.nextInt();     
        arreglo = new int[digito];
        
        for(i= 0; i < digito; i++){
            System.out.print("Ingrese el numero: ");
            int numero = sc.nextInt(); 
            resultado =(int) Math.pow(numero, 3);
            arreglo[i] = resultado;
        }
        System.out.println("\n");
       System.out.print("Resultado Cubicos: ");
       for(i=0; i < digito; i++){
            System.out.print(arreglo[i] +"," );
       }
    }
    
}
