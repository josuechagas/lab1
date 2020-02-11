/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josué P. Chagas
 */

import java.util.Scanner;
public class Main 
    { public static void main (String[] args){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter the total value of the items = ");
        double totalvalue=user_input.nextDouble();
        double state_tax = totalvalue * 0.04;
        double county_tax = totalvalue * 0.02;
        double total_purchase=totalvalue+state_tax+county_tax;
        System.out.println("Amount of the purchase = " + totalvalue+"$");
        System.out.println("Amount of the state tax (4%) = " + state_tax+"$");
        System.out.println("Amount of the county tax (2%) = " + county_tax+"$");
        System.out.println("Amount of the state tax (4%) = " + state_tax+"$");
        System.out.println("Total of the purchase = " + total_purchase+"$");
    }
}
