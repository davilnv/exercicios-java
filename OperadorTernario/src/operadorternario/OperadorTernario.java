/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author jackhemming
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1 > n2) ? n1:n2;
        System.out.println(r);
        
        int a = 5, b=2;
        String c;
        /*if (a > b) {
            c = "Primeito é maior";
        } else {
            c = "Segundo é maior";
        }
        */
        // c= (a >= b)?"Primeito é maior":"Segundo é maior";
        c= (a <= b)?"Segundo é maior":"Primeiro é maior";
        System.out.println(c);
    }
    
}
