package main;

import main.com.banibis.backend.api.BillduApiServiceImpl;

public class Main {
    public static void main(String[] args) {
        BillduApiServiceImpl bill = new BillduApiServiceImpl();
        System.out.println(bill.loadAllClients());
        System.out.println(bill.loadAllDocument());
    }
}
