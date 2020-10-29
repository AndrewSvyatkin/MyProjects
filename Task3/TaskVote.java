package Task3;


import java.util.Scanner;

class Vote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter elements: ");
        int j=0;
        for (int i : arr1) {
            arr1[i] = sc.nextInt();
        }
        for (int i=0; i<arr1.length-1; i++) {
            if(arr1[i] == arr1[i+1]) {
                j+=1;
            }
        }
        System.out.println("Vote = "+ j);
    }
}