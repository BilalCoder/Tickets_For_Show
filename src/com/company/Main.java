package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total number of tickets: ");
        int no = sc.nextInt();
        int rem = no, i = 0;
        while(rem > 0) {
            System.out.println("Enter the number of tickets u need: ");
            int req = sc.nextInt();
            if(req>3){
                System.out.println("Maximum of 3 tickets per person");
                continue;
            }
            rem = rem - req;
            if(rem > 0)
                System.out.println("Tickets Available: "+rem);
            else if(rem == 0){
                System.out.println("No more tickets.");
            }
            else {
                System.out.println("Check the ticket availability.");
                rem = rem+req;
                i--;
            }
            i++;
        }
        System.out.println("Number of Employees who got the tickets: "+i);
    }
}
