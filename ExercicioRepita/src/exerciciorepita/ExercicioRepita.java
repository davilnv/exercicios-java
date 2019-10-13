/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author jackhemming
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OLÁ, MUNDO
        // JOptionPane.showMessageDialog(null, "Olá, Mundo", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        
        // LENDO E MOSTRANDO A MENSAGEM
        /*
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);
        */
        
        // PROGRAMA PRINCIPAL
        int n, s = 0, c = 0, p = 0, i = 0, m = 0, media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(Valor '0' interrompe o prorama)</em></html>"));
            s += n;
            c++;
            if (n % 2 == 0) {
                p += 1;
            } else {
                i += 1;
            }
            if (n > 100) {
                m++;
            }
        } while (n != 0);
        media = s / (c-1);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + 
                "<br>Somatório: " + s + "<br>Total de valores: " + (c-1) + 
                "<br>Total de Pares: " + (p - 1) + "<br>Total de Ímpares: " + i + 
                "<br>Acima de 100: " + m + "<br>Média dos valores: " + media + "</html>");
    }
}
