import java.util.*;
public class Array9 {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter "+a.length+ " elements");
    for(int i=0; i<=a.length-1;i++){
        a[i] = sc.nextInt();
    }
    Map<Integer, Integer> map = new LinkedHashMap<>();
    for(int i=0;i<=a.length-1;i++){
        if(map.containsKey(a[i])){
            //int newValue = map.get(a[i])+1;
            //map.put(a[i],newValue);

            map.put(a[i],map.get(a[i])+1);

        }
        else{
            map.put(a[i],1);
        }
    }
    for(Integer key : map.keySet())
    {System.out.println(key+ " - "+map.get(key));}
    sc.close();
}
}
