/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package vendasRMI;

/**
 *
 * @author marcos
 */
public interface Interface_ServidorCliente extends java.rmi.Remote{
   
    public double compraProduto(int produtoId, int quantidade)
            throws java.rmi.RemoteException; 
    
    public String inicio()
            throws java.rmi.RemoteException;
    
    public String retornaProdutos()
            throws java.rmi.RemoteException;
    
    public String detalhaProduto(int p)
            throws java.rmi.RemoteException;
    
    public double calculafrete(double valor)
            throws java.rmi.RemoteException;
    
    public double calculatotal(double total, double subtotal)
            throws java.rmi.RemoteException;
   
}
