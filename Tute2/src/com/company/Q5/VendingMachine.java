package com.company.Q5;

public class VendingMachine {
    private int numCans;
    private int tokens;

     public void vendingMachine(){
         numCans = 10;
         tokens = 0;
     }
    public void vendingMachine(int cans){
        numCans = cans;
        tokens = 0;
    }
    public void fillUp(int cans){
        numCans = numCans + cans;

    }
    public void insertToken(){
         numCans = numCans - 1;
         tokens = tokens + 1;
     }
     public int getCanCount() {
         return numCans;
     }
    public int getTokenCount(){
        return tokens;
     }
    public static void main(String[] args)
    {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10); // fill up with ten cans machine.insertToken();
        machine.insertToken();
        System.out.print("Token count = ");
        System.out.println(machine.getTokenCount());
        System.out.print("Can count = ");
        System.out.println(machine.getCanCount());
    }



    }

