package main;

import main.com.banibis.backend.api.BillduApiServiceImpl;
import main.com.banibis.models.Printer;

public class Main {
    public static void main(String[] args) {
        BillduApiServiceImpl bill = new BillduApiServiceImpl();
        Printer allClient = bill.loadAllClients();
        allClient.printClass();
        System.out.println(bill.loadAllClients().embedded.getItems().get(0));
        System.out.println(bill.loadAllDocument().get_embedded().getItems().get(0));
    }
}
