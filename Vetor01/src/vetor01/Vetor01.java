/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author jackhemming
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = new int[4];
        n[0] = 14;
        n[1] = 25;
        n[2] = 30;
        n[3] = 1;
        System.out.println(Arrays.toString(n) + "\n");
        System.out.println("Total de casas de N: " + n.length);// Atributo Lenght, caracteristica para medir o tamanho do vetor
        for (int c = 0; c <= 3; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
        
        // Usando o lenght para mostrar cada número no for
        for (int cc = 0; cc <= n.length-1; cc++) {
            System.out.println(n[cc]);
        }
        
        // System.out.println(Arrays.toString(n)); para mostrar os números desse objeto; importa a classe Arrays
        
        //Outra forma de fazer, mais simples
        /* 
        System.out.println(n[0]);
        int lista[] = {3, 5, 8, 2};
        System.out.println(lista[0]);
        System.out.println(Arrays.toString(lista));
        */
     }
    
}
