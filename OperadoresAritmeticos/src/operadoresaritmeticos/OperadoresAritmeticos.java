/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author jackhemming
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Operadores Aritméticos
        /*
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        */
        
        // Operadores Unitários
        /*
        int numero = 5;
        int num = 10;
        int valor = 5 + ++numero;
        int value = 5 + --numero;
        int teste = 5 - ++num;
        System.out.println(valor);
        System.out.println(value);
        System.out.println(teste);
        System.out.println(num);
        */
        
        // Operadores de Atribuição
        /*
        int x = 4;
        //x += 2; // x = x + 2 or x = 4 + 2
        //x -= 2; // x = x - 2 or x = 4 - 2
        //x *= 2; // x = x * 2 or x = 4 * 2
        x /= 2; // x = x / 2 or x = 4 / 2
        System.out.println(x);
        */
        
        // Classe Math
        /*
        float v = 8.3f;
        float x = 6.5f;
        float y = 3.6f;
        int u = -10;
        int a = (int) Math.floor(v);
        int b = (int) Math.ceil(x);
        int c = (int) Math.round(y);
        int d = Math.abs(u);
        System.out.println("Arredondamento para baixo " + a);
        System.out.println("Arredondamento para cima " + b);
        System.out.println("Arredondamento Aritmético " + c);
        System.out.println("Valor Absolto (Módulo) " + d);
        */
        
        // Arredondamentos
        double ale = Math.random();
        int sorteio = (int) (10 + Math.random() * (20 - 10));
        System.out.println(ale);
        System.out.println(sorteio);
    }
    
}
