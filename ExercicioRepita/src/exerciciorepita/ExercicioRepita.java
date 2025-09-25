/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author WINDOWS
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,soma = 0,total = 0, impares=0, pares=0, acimadeCem=0 ;
        float media;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog
                (null, "<html>Informe um numero<em> 0 Interrompe</em></html>"));
             soma +=numero; 
             total++;
            System.out.println(numero);
            
            if (numero % 2 == 0){
                pares++;
            }else{
                impares++;
            }
            
            if(numero >=100){
                acimadeCem++;
            }
            
        }while  (numero!=0);
        total--;
        pares--;
        media =(float) soma/total;
        JOptionPane.showMessageDialog(null,"<html>Resultado<hr>"
                + "Soma =  "+soma+"<br>Total =  "+total+
                "<br>Pares =  "+pares+
                "<br>Impares =  "+impares+
                "<br>Acima de 100 =  "+acimadeCem+
                "<br>Média =  "+media+
                "</html>");
        
    }
    
}
