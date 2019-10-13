/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author jackhemming
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // CRESCENTE
        for (int cc = 0; cc <= 3; cc++) {
            System.out.println("Cambalhota " + cc);
        }
        
        // DECRESCENTE
        for (int diminui = 20; diminui >= 0; diminui--) {
            System.out.println(diminui);
        }
        /*
        int c= 0;
        while (c < 4) {
            System.out.println("Cambalhota " + c);
            c++;
        */
    }
    
}
