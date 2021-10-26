package com.design.mode.proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    String location;
    int count;
    int state;


    public GumballMachine(String location, int count) throws RemoteException {
        this.count = count;
        this.location = location;
        state = 1;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int getState() {
        return state;
    }
}
