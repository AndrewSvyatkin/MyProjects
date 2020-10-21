package Arrays;

import java.util.Scanner;

class LastToFirst {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int num = sc.nextInt();
        int[] arr5 = new int[num];
        System.out.println("Enter elements: ");

        for (int i = 0; i < num; i++) {
            arr5[i] = sc.nextInt();
        }
        System.out.println("Elements from last to first: ");
        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.println(arr5[i]);
        }
    }
}