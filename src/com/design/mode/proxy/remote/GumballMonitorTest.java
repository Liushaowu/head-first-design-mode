package com.design.mode.proxy.remote;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class GumballMonitorTest {
    public static void main(String[] args) {
        String[] locations = {"rmi://127.0.0.1:1099/gumballmachine",
                "rmi://127.0.0.1:1099/gumballmachine",
                "rmi://127.0.0.1:1099/gumballmachine"};
        GumballMonitor[] monitors = new GumballMonitor[locations.length];
        for (int i = 0; i < locations.length; i++) {
            try {
                GumballMachineRemote remote = (GumballMachineRemote) Naming.lookup(locations[i]);
                monitors[i] = new GumballMonitor(remote);
                System.out.println(monitors[i]);
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        for (GumballMonitor monitor : monitors) {
            monitor.report();
        }
    }
}
