/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package vendasRMI;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Cliente2 {
    public static void main(String[] args) {
        try{
            Interface_ServidorCliente v = (Interface_ServidorCliente) Naming.lookup("//127.0.0.1:1099/VendasServiceClient");
            Scanner entrada = new Scanner(System.in);
            double total = 0;
            int comecar;
            
            System.out.println(v.inicio());
            comecar = Integer.parseInt(entrada.next());
            
            while(comecar==1){
                System.out.println("\n PRODUTOS: " + v.retornaProdutos());
                System.out.println("\nQual produto deseja?");  
                int produtoId = Integer.parseInt(entrada.next());
                System.out.println(v.detalhaProduto(produtoId));
                System.out.println("\nDeseja realmente este produto? (1 - sim)\n");
                int escolha = entrada.nextInt();
                if(escolha==1){
                    System.out.println("\nQuantas unidades você deseja? : ");
                    int quantidade = Integer.parseInt(entrada.next());
                    System.out.println("\nSubTotal: " + v.compraProduto(produtoId, quantidade)); //subtotal
                    total = v.calculatotal(total, v.compraProduto(produtoId, quantidade));       //total acumulado
                    
                }
                
                System.out.println("\nTotal da Compra: " + total);
                System.out.println("\nDeseja continuar sua compra? (1 - sim)");
                int continuar = entrada.nextInt();
                if(continuar==1){
                    comecar = 1;
                }else{
                    comecar = 0;
                }
                
            }
            
            
            total = v.calculafrete(total);
            System.out.println("\n TOTAL FINAL DA COMPRA (com frete): " + total 
                    + "\n Obrigado pela preferência! \n");

            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
