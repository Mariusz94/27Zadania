package Zad6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        String numberMenu=" ";
        while(!numberMenu.equals("0"))
        System.out.println("1 Wyświetlenie dostępnych książek");
        System.out.println("2 Wyświetlenie wypożyczonych książek");
        System.out.println("3 Wypożycz książkę");
        System.out.println("4 Oddaj książkę");
        System.out.println("0 Koniec programu");
        numberMenu = scanner.nextLine();
        switch (numberMenu){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case"4":
                break;
            case"0":
                break;
        }
    }

}
