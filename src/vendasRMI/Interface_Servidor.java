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
public interface Interface_Servidor extends java.rmi.Remote{
    
    public String produtosDisponiveis()
            throws java.rmi.RemoteException;
    
    public String detalhesProduto(int p)
            throws java.rmi.RemoteException;
    
    public double precoProduto(int p)
            throws java.rmi.RemoteException;
}
