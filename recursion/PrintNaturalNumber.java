package recursion;

import java.util.Scanner;

public class PrintNaturalNumber {
    static void printIncrease(int n) {
        if (n == 1) {
            System.out.print(n);
            return;

        }
        printIncrease(n - 1);
        System.out.print(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncrease(n);
    }

}
