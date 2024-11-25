//write a java program to sort a numeric array and a string array
import java.util.Scanner;
import java.util.Arrays;
public class Array2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+arr.length+" elements");
        for(int i = 0;i <= arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
 
        System.out.println("Original Elements are -");
       System.out.println(Arrays.toString(arr));
       Arrays.sort(arr);

       System.out.println("Sorted Elements are -");
       System.out.println(Arrays.toString(arr));
        
        
        sc.close();
    }
}
