
import java.rmi.Naming;
import java.util.Scanner;

//package vendasRMI;

/**
 *
 * @author marcos
 */
public class Implementacao_ServidorCliente extends java.rmi.server.UnicastRemoteObject implements Interface_ServidorCliente{

    public Implementacao_ServidorCliente() 
        throws java.rmi.RemoteException { 
            super();
        } 
        
    public String retornaProdutos()
        throws java.rmi.RemoteException {
        
        String produtos = "";

            try{
                Interface_Servidor f = (Interface_Servidor) Naming.lookup("//127.0.0.1:1099/VendasService");
                produtos = f.produtosDisponiveis();
 
            }catch(Exception e){
                System.out.println("Erro:" + e);
            }
            
            return produtos;
        }
    
    public String detalhaProduto(int p)
        throws java.rmi.RemoteException {
        
        String detalhes = "";
        
        try{
            Interface_Servidor f = (Interface_Servidor) Naming.lookup("//127.0.0.1:1099/VendasService");
            detalhes = f.detalhesProduto(p);
 
        }catch(Exception e){
                System.out.println("Erro:" + e);
        }
        
        return detalhes;
        
    }
    
    public double compraProduto(int produtoId, int quantidade)
            throws java.rmi.RemoteException {
            double total = 0;   //variavel que armazenará o valor total da compra
            
            try{
                
                Interface_Servidor f = (Interface_Servidor) Naming.lookup("//127.0.0.1:1099/VendasService");
                total =  f.precoProduto(produtoId) * quantidade;
 
            }catch(Exception e){
                    System.out.println("Erro:" + e);
            }
            
            return total;

    }
    
    
    public String inicio()
            throws java.rmi.RemoteException {

        String inicio = "\n\n | Bem Vindo (a)! |\n Deseja realizar sua compra? (1 - sim) \n";
        return inicio;
        
    }
    
    public double calculafrete(double valor)
          throws java.rmi.RemoteException {
            if(valor < 50.00){
                valor = valor + 5.00;
            }
            
            return valor;
    } 
    
    public double calculatotal(double total, double subtotal)
            throws java.rmi.RemoteException {
        
            total = total + subtotal;
            return total;
    }
    
    
    
    
    
    

    
    
    
}
