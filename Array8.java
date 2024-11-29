import java.util.*;
public class Array8 {
    public static void main(String args[]){
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("Rohit", 45);
        map.put("Dhoni", 7);
        map.put("Virat", 18);
        map.put("Yuvraj", 12);
        map.put("Sachin", 10);

        // System.out.println(map.get("Sachin"));
        //System.out.println(map);

       /*  for(String item : map.keySet()){
            System.out.println(item);
        }*/
        /*  for(Integer item : map.values()){
            System.out.println(item);
        }*/

      for(String item : map.keySet()){
            System.out.println(item+ " - " +map.get(item));
        }

        /*
         * for(Map.Entry<String , Integer> entry: map.entrySet()){
         * System.out.println(entry.getKey()+ " - " +entry.getValues());
         * }
         */
    } 
}
