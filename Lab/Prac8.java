package Lab;

import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = input.nextInt();
        for (int i = 2; i <= num;) {
            if (num % i == 0) {
                System.out.print(i + ",");
                num /= i;
            } else {
                i++;
            }
        }

        input.close();

    }
}
