import java.util.*;
public class MyArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();//order maintein karta hai , duplicates print karta hai
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(9);

        System.out.println(list);

        list.add(12);

        System.out.println(list);

        //list.remove(1);
        //list.remove((Integer)8);
        //list.add(2,12);
        //list.set(3,33);
    }
}
