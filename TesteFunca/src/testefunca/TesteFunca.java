/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefunca;

/**
 *
 * @author WINDOWS
 */
public class TesteFunca {

    /**
     * @param args the command line arguments
     */
    
    
   ///////////////MÉTODO SEM RETORNO 
    static void soma(int a, int b){
        int s = a+b;
        System.out.println("A soma eh "+s);
    }
    
    
    /////////////////MÉTODO COM RETORNO
    static int somaRetorno(int a, int b){
        int sm = a+b;
        return sm;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Comecou o programa");
        soma (5,2);
        
        int variavelRecebeRetorno = somaRetorno(5,2);
        System.out.println("O retorno do método somaRetorno eh "+variavelRecebeRetorno);
    }
    
}
