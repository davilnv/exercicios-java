/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrandomes;

import java.util.Scanner;

/**
 *
 * @author jackhemming
 */
public class MostrandoMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", 
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", 
            "Dezembro"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c = 0; c <= dias.length-1; c++) {
            System.out.println("O mês de " + meses[c] + " tem " + dias[c] + 
                    " dias");
        }
        System.out.print("Qual mês você deseja mostrar na tela [1 - 12]? ");
        int num = teclado.nextInt();
        System.out.println("Mês: " + meses[num-1]);
        System.out.println("obs. Possui " + dias[num-1] + " dias no mês");
        
    }
}
