package Arrays;

import java.util.Scanner;

class BigMiddle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr4 = new int[size];
        System.out.println("Enter elements: ");

        int j = 0;
        for (int i : arr4) {
            arr4[i] = sc.nextInt();
            if((arr4[i]>arr4[i+1]) && (arr4[i+1]>arr4[i+2])) {
                j = j+1;
            }
        }
        System.out.println("Sum elements > previous and next = "+ arr4[j]);
    }
}