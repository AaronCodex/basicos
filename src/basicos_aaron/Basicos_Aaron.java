/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos_aaron;

/**
 *
 * @author Aarón Moreno
 */
public class Basicos_Aaron {
    public static void logicos() {
        boolean x=false;
        int a=3, b=2;
        if(a>b){
            x=true;
            System.out.println(a+" es mayor que "+b+": "+x);
        } else System.out.println(a+" es menor que "+b+": "+x);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        logicos();
    }
    
}
