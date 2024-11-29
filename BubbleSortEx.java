import java.util.*;
public class BubbleSortEx {
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
        for(int i = 0;i <= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
 
       

        for(int i = 0;i <= arr.length-2;i++){
           for(int j=0;j<=arr.length-2;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
           }
        }
        
        System.out.println();
        System.out.println("Sorted Elements are -");
        for(int i = 0;i <= arr.length-1;i++){
            System.out.print(arr[i]+" ");

        }
        sc.close();
    }
}