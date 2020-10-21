package Arrays;

import java.util.Scanner;

class NumbersDel2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter elements: ");

        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);
            }
        }
    }
}