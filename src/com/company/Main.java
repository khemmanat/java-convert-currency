
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner thb = new Scanner(System.in);
        System.out.println("Enter Thai baht input: ");
        int num = thb.nextInt();

        thb.close();

        double convert_to_won = num * 33.72;
        double convert_to_usd = num * 0.028;
        double convert_to_yen = num * 3.4;

        System.out.println("Converted WON currency :" + convert_to_won);
        System.out.println("Converted USD currency :" + convert_to_usd);
        System.out.println("Converted YEN currency :" + convert_to_yen);

    }
}
