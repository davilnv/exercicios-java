/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Arrays;

/**
 *
 * @author jackhemming
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Outra forma de exibir com o for it
        double numeros[] = {3.5, 2.75, 5.5, 3.2, 4.4};
        for (double valor: numeros) {
            System.out.println(valor);
        }
        
        // Oredenando Vetores
        int notas[] = {8, 6, 8, 9, 4, 10, 2, 5, 6};
        Arrays.sort(notas); // Classe Arrays para ordenar um vetor em ordem Crescente
        for (int valor: notas) {
            System.out.print(valor + " ");
        }
        
        System.out.println("\n");
        
        // Busca no vetor
        int num[] = {3, 5, 1, 8, 4};
        int pos = Arrays.binarySearch(num, 1);
        System.out.print(pos);
        if (pos == 2) {
            System.out.println(" Na segunda posição");
        }
        
        //Preenchendo o vetor com o mesmo valor
        int n[] = new int[20];
        Arrays.fill(n, 10);
        for (int valor: n) {
            System.out.print(valor + " ");
        }
        
    }
}
