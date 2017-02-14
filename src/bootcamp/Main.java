package bootcamp;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String answer = "";
        System.out.println("Welcome to Batting Average Calculator!");
        System.out.println("");

        do {
            System.out.print("Enter number of times at-bat: ");
            int atBat = scan.nextInt();

            while (atBat <= 0) {
                System.out.print("Enter positive number :");
                atBat = scan.nextInt();
            }

            int[] numBats = new int[atBat];


            System.out.println("");
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");

            double count = 0;
            double sum = 0;

            for (int i = 0; i < numBats.length; i++) {

                System.out.print("\nResult for at-bat " + (i + 1) + ": ");

                numBats[i] = scan.nextInt();

                while (numBats[i] < 0 || numBats[i] > 4) {

                    System.out.print("Error! Enter a number (0,1,2,3,4): ");
                    numBats[i] = scan.nextInt();
                }
                sum = sum += numBats[i];

                if (numBats[i] > 0.0) {
                    count++;

                }
            }
            System.out.printf("\nBatting average: %.3f", count / atBat);
            System.out.printf("\nSlugging Percentage: %.3f", sum / atBat);

            System.out.println("\n");
            System.out.print("Do you want to continue? y/n ");
            answer = scan.next().toLowerCase();

        } while (answer.equals("y"));

        scan.close();
    }
}





