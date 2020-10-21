package Arrays;

import java.util.Scanner;

class NumBiggerPrevious {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr3 = new int[size];
        System.out.println("Enter elements: ");

        int j=0;
        for (int i : arr3) {
            arr3[i] = sc.nextInt();
        }
        for (int i=0; i<arr3.length-1; i++) {
            if(arr3[i+1] > arr3[i]) {
                j+=1;
            }
        }
        System.out.println("Elements bigger then previous = "+ arr3[j]);
    }
}