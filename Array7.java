//to find the missing number in the array
import java.util.Arrays;
public class Array7 {
    public static void main(String args[]){
        int a[] = {1,2,3,4,6};
        int n = 6;
        int expectedSum = n*(n+1)/2;
        int currentSum = Arrays.stream(a).sum();

        System.out.println("Missing number - "+(expectedSum-currentSum));
    }
}
