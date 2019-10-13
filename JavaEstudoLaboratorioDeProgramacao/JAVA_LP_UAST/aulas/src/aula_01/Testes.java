package aula_01;

public class Testes {
	public static void main(String[] args) {
		int numerosDeEstudantes = 10;
		System.out.println(numerosDeEstudantes);
		String nome = "Davi";
		int idade = 20;
		float altura = (float) 1.77;
		System.out.println("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Altura: " + altura);
		idade = 23;
		System.out.println(idade);
		nome = "João";
		System.out.println(nome);
		
		// Operadores aritméticos
		int num1 = 20;
		float num2 = 30.2f;
		float soma = num1 + num2;
		System.out.println(soma);
		
		// Operadores aritméticos de Atribuição
		int valor = 50;
		System.out.println(valor);
		valor += 100;
		System.out.println(valor);
		valor -= 120;
		System.out.println(valor);
		valor *= 10;
		System.out.println(valor);
		valor /= 2;
		System.out.println(valor);
		
		// Operadores de incremento (++) e decremento (--)
		int x = 100;
		++ x; // pré-incremento
		System.out.println(x);
		x ++;
		System.out.println(x);
		
		// Operadores de igualdade
		 boolean teste = x == valor;
		 System.out.println(teste);
		 teste = x != valor;
		 System.out.println(teste);
		 
		 // and = && ; or = || ;
		 float nota = 7.7f;
		 if (nota >= 7) {
			 System.out.println("Parabéns!");
		 } else {
			 System.out.println("Estude mais!");
		 }
	}
}	
