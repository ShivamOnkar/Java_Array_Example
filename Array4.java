//write the java program to reverse an array of integer value.

import java.util.Scanner;
import java.util.Arrays;
public class Array4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+arr.length+" elements");
        for(int i = 0;i <= arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Reverse - "+Arrays.toString(arr));

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;

            start++;
            end--;
        }
        System.out.println("After Reverse - "+Arrays.toString(arr));

        //for(int i:arr){
        // System.out.print(i+" ");
        //}
        sc.close();
    }
}