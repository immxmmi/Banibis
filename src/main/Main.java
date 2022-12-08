package main;

import main.com.banibis.backend.api.BillduApiServiceImpl;
import main.com.banibis.utilits.Printer;

import java.util.Scanner;

public class Main {

    public static void printMenu() {

        System.out.println("MENU:");
        System.out.println("1. Print All Clients");
        System.out.println("2. Print Single Client");
        System.out.println("3. Print All Document");
        System.out.println("#. Print Single Docoument");
        System.out.println("0. Quit");

    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void startMenu() {
        BillduApiServiceImpl server = new BillduApiServiceImpl();
        Printer client = server.loadClient();
        Printer clients = server.loadAllClients();
        Printer documents = server.loadAllDocument();
        //Printer document = bill.loadAllClients();

        boolean running = true;

        do {
            printMenu();
            switch (getInput()) {
                case 1:
                    clients.printClass();
                    break;
                case 2:
                    client.printClass();
                    break;
                case 3:
                    documents.printClass();
                    break;
                case 4:
                    documents.printClass();
                    break;
                case 0:
                    running = false; break;
                default:
                    System.out.println("Try Agin!");
            }
        }
        while (running);
    }

    public static void main(String[] args) {
        startMenu();
    }
}
