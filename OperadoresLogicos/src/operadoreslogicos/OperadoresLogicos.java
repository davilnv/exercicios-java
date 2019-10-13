/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author jackhemming
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean e, ou, xou;
        e = (x<y && y<z)?true:false;
        // .E. = outra forma sem a redundância r = (x<y && y<z);
        System.out.println(e);
        ou = (x<y || y==z)?true:false;
        System.out.println(ou);
        // .OU. = outra forma sem a redundância ou = (x<y || y==z);
        xou = (x<y ^ y<z)?true:false;
        System.out.println(xou);
        // .XOU. = outra forma sem a redundância xou = (x<y ^ y==z);
        
    }
    
}
