import java.util.Scanner;

public class Array1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+arr.length+" array elements");
        for(int i = 0; i<=arr.length-1;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("__________________________");
        System.out.println(arr.length+ " array elements are =>");
        for(int i = 0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}
