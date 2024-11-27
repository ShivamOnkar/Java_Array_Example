//To find the sum and second largest number
import java .util.Arrays;
public class Array6 {
    public static void main(String args[]){
        int a[] = {5,8,1,3,4,6,9,4,3,12,13,10};

        int sum =Arrays.stream(a).sum();
        System.out.println("Sum - "+sum);

        int largest = a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        System.out.println(largest);

        
        int secLargest = a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>secLargest && a[i]!=largest){
                secLargest = a[i];
            }
        }
        System.out.println(secLargest);
    }
    
}
