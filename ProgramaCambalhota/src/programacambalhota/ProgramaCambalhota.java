/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacambalhota;

/**
 *
 * @author jackhemming
 */
public class ProgramaCambalhota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ESTRUTURA DE REPETIÇÃO
        /*
        int cc = 0;
        while (cc < 4) {
            System.out.println("Cambalhota" + cc);
            cc++;
        }
        */
        
        // COMANDO CONTINUE;
        /*
        int c = 0;
        while (c < 10) {
            c++;
            if (c == 5 || c == 7) {
                continue;
            }
            System.out.println("Cambalhota " + c);
        }
        */
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if (cc == 7) {
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
