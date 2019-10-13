/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;
/**
 *
 * @author jackhemming
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nascimento = teclado.nextInt();
        int idade = 2019 - nascimento;
        System.out.println("Idade: " + idade);
        if (idade >= 18) {
            System.out.println("Classificação: Maior de Idade");
        } else {
            System.out.println("Classificação: Menor de Idade");
        }
    }
    
}
