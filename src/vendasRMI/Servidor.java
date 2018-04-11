
//package vendasRMI;

import java.rmi.Naming;

/**
 *
 * @author marcos
 */
public class Servidor {

    public Servidor() {
        try{
            
            Interface_Servidor v = new Implementacao_Servidor();
            Naming.rebind("//127.0.0.1:1099/VendasService", v);
            
        }catch(Exception e){
            System.out.println("Trouble: " + e);
        }
    }
    
    public static void main(String args[]) { 
         new Servidor();
    }
       
}
