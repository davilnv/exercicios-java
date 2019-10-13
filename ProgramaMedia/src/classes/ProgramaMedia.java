/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author jackhemming
 */
public class ProgramaMedia {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota 1: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.print("Sua média é: " + media);
        if (media > 9) {
            System.out.print(" Parabéns ");
        }
    }
}
