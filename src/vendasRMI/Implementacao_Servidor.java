
//package vendasRMI;

/**
 *
 * @author marcos
 */
public class Implementacao_Servidor extends java.rmi.server.UnicastRemoteObject implements Interface_Servidor{

    public Implementacao_Servidor() 
        throws java.rmi.RemoteException{
           
        super();
    }
    
    
    public String produtosDisponiveis()
        throws java.rmi.RemoteException{
            String produtos = "\n Lista de Produtos à Venda: \n 1 - Mouse USB "
                    + "\n 2 - Mouse Sem Fio \n 3 - Teclado USB \n 4 - Fone de Ouvido"
                    + "\n 5 - Caixas de Som \n\n --> Frete de R$ 5,00"
                    + "\n --> Compras acima de R$ 50,00 não pagam frete";
            return produtos;
        }
    
    public String detalhesProduto(int p)
        throws java.rmi.RemoteException{
            String detalhes = "";
            switch(p){
                case 1: 
                    detalhes = "\n Mouse USB Satelitte \n Preço: R$ 20,00 "
                            + "\n Cor: Preto \n Sistemas: Windows, Linux e Mac"; break;
                case 2: 
                    detalhes = "\n Mouse sem Fio Satelitte \n Preço: R$ 40,00 "
                            + "\n Cor: Preto \n Sistemas: Windows, Linux e Mac"; break;
                case 3: 
                    detalhes = "\n Teclado USB Satelitte \n Preço: 30,00 "
                            + "\n Cor: Preto \n Sistemas: Windows, Linux e Mac"; break;
                case 4:
                    detalhes = "\n Fone de Ouvido Philips \n Preço: R$ 25,00 "
                            + "\n Cor: Prata \n Entrada para Smartphones"; break;
                case 5: 
                    detalhes = "\n Caixas de Som Sony \n Preço: R$ 50,00 "
                            + "\n Cor: Azul \n Acompanha adaptador"; break;
            }
            
            return detalhes;
        }
    
    public double precoProduto(int p)
        throws java.rmi.RemoteException{
            double preco = 0;
            
            switch(p){
                case 1: preco = 20.00; break;
                case 2: preco = 40.00; break;
                case 3: preco = 30.00; break;
                case 4: preco = 25.00; break;
                case 5: preco = 50.00; break;
            }
            
            return preco;
        } 
    
}
