//to print the duplicate number in the array
import java.util.*;
public class SetExample {
    public static void main(String args[]){
        int a[] = { 5,1,3,2,5,2,1,4,6,3,5,2};
        Set<Integer> set = new HashSet<>();
        Set<Integer> uniqueSet = new HashSet<>();
        for(int i=0;i<=a.length-1;i++){
            boolean f = set.add(a[i]);
            if(!f){                        //if(f){ System.out.println(a[i] +" ");}
                uniqueSet.add(a[i]);
            }
        }
        System.out.println(uniqueSet);
    }
    
}
