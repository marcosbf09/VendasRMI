
//package vendasRMI;

import java.rmi.Naming;

/**
 *
 * @author marcos
 */
public class ServidorCliente {
    
    public ServidorCliente() {
        try{
            
            Interface_ServidorCliente v = new Implementacao_ServidorCliente();
            Naming.rebind("//127.0.0.1:1099/VendasServiceClient", v);
            
            
        }catch(Exception e){
            System.out.println("Trouble: " + e);
        }
    }
    
    public static void main(String args[]) { 
         new ServidorCliente();
    }
    
}
