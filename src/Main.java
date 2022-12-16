/*
 * @author Emircan Aktaş - 16.Dec.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        double c;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. side :");
        a = inp.nextInt();

        System.out.print("2. side :");
        b = inp.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hyponetus :" + c);



    }
}