package Task3;


import java.util.Scanner;

public class PhiNumber {
    public static void main(String[] args) {

        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long f0 = 1;
        long f1 = 1;
        long f2;

        for(int i = 3; i <= n; i++) {
            f2=f0+f1;
            System.out.print(f2);
            f0=f1;
            f1=f2;
        }
        System.out.println();
    }
}