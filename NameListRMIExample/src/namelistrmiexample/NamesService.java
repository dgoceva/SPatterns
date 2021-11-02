/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namelistrmiexample;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NamesService extends Remote {

    public void addName(String name) throws RemoteException;

    public Names getNames() throws RemoteException;

}