/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.println("A nota é " + nota);
        System.out.println("A nota eh " + nota);
        System.out.printf("A nota de %s é %.2f \n", nome, nota);

    }

}
