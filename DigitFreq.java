//Write a program to find the Digit frequency
import java.util.*;
public class DigitFreq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        String num = Integer.toString(n);

        char a[] = num.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<=a.length-1;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        
        sc.close();
    }
}
