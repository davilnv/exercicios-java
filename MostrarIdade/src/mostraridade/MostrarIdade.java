package mostraridade;

import java.util.Scanner;

public class MostrarIdade {
    public static void main(String[] Args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual sua idade? ");
        int idade = teclado.nextInt();
        System.out.printf("Idade: " + idade);
    }
}