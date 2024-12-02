import java.util.*;
class InsertExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter " + a.length + " elements:");
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter index:");
        int index = sc.nextInt();

        System.out.println("Enter value:");
        int value = sc.nextInt();

        // Convert Array to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        // Insert the value at the specified index
        if(index >= 0 && index <= list.size()) {
            list.add(index, value);
        } else {
            System.out.println("Invalid index.");
        }

        // Print the updated list
        System.out.println("Updated ArrayList:");
        for(int i : list) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
