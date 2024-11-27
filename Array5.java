//sort the array in the reverse order
import java.util.*;
public class Array5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr size of an array ");
        int n = sc.nextInt();

        Integer a[] = new Integer[n];

        System.out.println("Enetr "+a.length+" elements");
        for(int i=0; i<=a.length-1 ; i++){
            a[i] = sc.nextInt();  
          }
          System.out.println("Before Sort - "+Arrays.toString(a));

          int mid = n/2;
          Arrays.sort(a,0,mid);
          Arrays.sort(a,mid,n,Collections.reverseOrder());
          System.out.println("After Sort - "+Arrays.toString(a));

          sc.close();

    }

}
