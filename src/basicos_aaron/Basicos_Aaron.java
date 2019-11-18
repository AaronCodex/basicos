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
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        numericos();
    }
    
}
