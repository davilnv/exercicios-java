package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a 1ª Nota: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite a 2ª Nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println("=============================");
        System.out.println("Nome: " + nome);
        System.out.println("1ª Nota: " + nota1);
        System.out.println("2ª Nota: " + nota2);
        System.out.println("A média das duas notas é: " + media);
       
        /* System.out.printf("A média é %.1f\n", media);
        System.out.printf("Nome: %s\n1ª Nota: %.2f\n2ª Nota: %.2f\nMédia: %.2f"
                + "\n", nome, nota1, nota2, media);
        System.out.format("Sua 1ª nota é: %.1f", nota1);
        */
    }
}
