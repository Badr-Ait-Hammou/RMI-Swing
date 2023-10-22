/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serverside;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;

/**
 *
 * @author Badr
 */
public class ServerSide {

    public static void main(String[] args) throws RemoteException {
        try {
            IDao<Machine> dao = new  MachineService();
            IDao<Salle> salle = new SalleService();
            
            LocateRegistry.createRegistry(1099);
            
            Naming.bind("rmi://localhost:1099/machine", dao);
            Naming.bind("rmi://localhost:1099/salle", salle);
            
             for (Salle s:salle.findAll()){
                 System.out.println(s);
             }
            System.out.println("waiting for a client  ");
            
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(ServerSide.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServerSide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
