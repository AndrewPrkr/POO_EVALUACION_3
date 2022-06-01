/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_division_0;

import java.util.Scanner;

/**
 *
 * @author saeol
 */
public class Eva3_3_division_0 {

    /**
     * @param args the command line arguments
     */
    
    /* excepcion aritmetica , es una excepcion matematica*/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero");
        int entero = input.nextInt();
        
        System.out.println("Introduce tu edad en numero entero 2");
        int entero2 = input.nextInt();
        
        System.out.println("Diviosion: " + (entero/entero2));
        //excepciones sirven para evitar problemas en el prgrama
        
                
        
    }
    
}
