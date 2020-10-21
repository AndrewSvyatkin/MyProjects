package Arrays;

import java.util.Scanner;

class PlusNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        System.out.println("Enter elements: ");

        int j = 0;
        for (int i : arr2) {
            arr2[i] = sc.nextInt();
            if(arr2[i]>0) {
                j = j+1;
                System.out.println("Sum elements >0 = "+ j);
            }
            }
        }
    }