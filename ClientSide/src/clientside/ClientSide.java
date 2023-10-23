/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientside;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Badr
 */
public class ClientSide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            IDao<Machine> machine = (IDao<Machine>) Naming.lookup("rmi://localhost:1099/machine");
            IDao<Salle> salles = (IDao<Salle>) Naming.lookup("rmi://localhost:1099/salle");
       
            for (Salle s: salles.findAll()){
                 System.out.println(s);
             }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClientSide.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClientSide.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientSide.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
}
