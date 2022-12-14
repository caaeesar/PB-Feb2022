package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String products = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0.00;

    if ("Sofia".equals(town)){
        switch (products){
            case "coffee":
                price = 0.50;
                break;
            case "water":
                price = 0.80;
                break;
            case "beer":
                price = 1.20;
                break;
            case "sweets":
                price = 1.45;
                break;
            case "peanuts":
                price = 1.60;
                break;
        }

    } else if ("Plovdiv".equals(town)){
        switch (products){
            case "coffee":
                price = 0.40;
                break;
            case "water":
                price = 0.70;
                break;
            case "beer":
                price = 1.15;
                break;
            case "sweets":
                price = 1.30;
                break;
            case "peanuts":
                price = 1.50;
                break;
        }

    } else if ("Varna".equals(town)) {
        switch (products){
            case "coffee":
                price = 0.45;
                break;
            case "water":
                price = 0.70;
                break;
            case "beer":
                price = 1.10;
                break;
            case "sweets":
                price = 1.35;
                break;
            case "peanuts":
                price = 1.55;
                break;
        }
    }
        System.out.println(price * quantity);
    }
}
