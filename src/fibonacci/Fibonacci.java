/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author jdbor
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
	int entrada = in.nextInt();
        
        int fibonacci = CalcularFibonacci(entrada);
        System.out.println("El Fibonacci es " + fibonacci + " y" + Primo(fibonacci));

    }
    
    public static String Primo(int calcular){
        
        int contador = 0;
        
        for (int i = 1; i <= calcular; i++) {
            if(calcular % i == 0){
                contador++;
            }
        }
        
        if(contador == 2){
            return " el número es primo";
        }else{
            return " el número no es primo.";
        }
        
    }
    public static int CalcularFibonacci(int calcular){
        int Primero = 0;
        int Segundo = 1;
        int resultado = 0;
        
        if (calcular >= 1) {
            for (int i = 0; i < calcular; i++) {
                resultado = Primero + Segundo;

                Primero = Segundo;
                Segundo = resultado; 
            }
        }
        return resultado;
    }
    
}
