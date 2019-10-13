/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author jackhemming
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    static int somaR(int x, int y) {
        int ss = x + y;
        return ss;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        soma(5, 2);
        System.out.println("A soma é "+ somaR(5, 2));
        int sm = somaR(10, 25);
        System.out.println(sm);
    }
    
}
