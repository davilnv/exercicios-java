/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostraescada;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jackhemming
 */
public class MostraEscada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos números você quer mostrar?\n>> ");
        int numDegraus = teclado.nextInt(); 
        int c = 1;
        while (c <= numDegraus) {
            int num[] = new int[c];
            int tamanho = num.length;
            if (tamanho < 10){
                Arrays.fill(num, c);
                for (int valor: num) {
                    System.out.print(valor + "  ");
                }
                System.out.println("");
                c++;
            } else {
                Arrays.fill(num, c);
                for (int valor: num) {
                    System.out.print(valor + " ");
                }
                System.out.println("");
                c++;
            }
        }
    }    
}
