/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author WINDOWS
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
/////////////////DECLARAÇÃO DE VETOR E IMPRESSÃO        
//        int v[] = {2,1,4,6,6,4,34};;
//        
//        for(int c = 0; c< v.length; c++){
//            System.out.println(" Posição: "+c+", valor: "+v[c]);
//        }
//    }
//       


///////////////ORDENAÇÃO DE VALORES
//        double vetor2[] = {2213, 34, 34.2, 343.234};
//     
//        for(double valor2: vetor2){
//        System.out.print(valor2+" / ");
//        
//        }
//        
//        System.out.println(" ");
//                
//        Arrays.sort(vetor2);
//         for(double valor2: vetor2){
//        System.out.print(valor2+" / ");
//        
//        }


///////////////////BUSCA DE VALORES

    int vetor3 [] = {2, 3, 4, 1, 6};
    
    for(int vet:vetor3){
        System.out.print(vet+" ||");
    }
        System.out.println("");
    int posicao = Arrays.binarySearch(vetor3, 4);
        System.out.println("Valor na posiscao "+posicao);
    }
}
 
