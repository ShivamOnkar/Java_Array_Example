//Write a java program to copy an array by iterating the array.

import java.util.*;
public class Array3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        System.out.println("Enter "+a.length+" elements");
        for(int i = 0;i <= a.length-1;i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        System.out.println("First Array - "+Arrays.toString(a));
        System.out.println("Second Array - "+Arrays.toString(b));
    sc.close();
    }
}