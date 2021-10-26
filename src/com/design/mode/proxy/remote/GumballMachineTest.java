package com.design.mode.proxy.remote;

import java.rmi.Naming;


public class GumballMachineTest {

    public static void main(String[] args) {
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        count = Integer.parseInt(args[1]);
        GumballMachineRemote gumballMachine = null;
        try {
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("rmi://" + args[0] + ":1099/gumballmachine", gumballMachine);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
