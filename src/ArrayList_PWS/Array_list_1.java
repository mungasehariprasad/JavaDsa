package ArrayList_PWS;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_list_1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
//        Add new element
        l1.add(4);
        l1.add(3);
        l1.add(6);
        l1.add(7);
//        get an element at index i
//        System.out.println(l1.get(1));

//        Print With for loop
//        for (int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
//        printing the Array list directly
        System.out.println(l1);

//        Adding element at same index i

        l1.add(1,100);
        System.out.println(l1);
//Modifying element at index i
        l1.set(1,10);
        System.out.println(l1);

//        removing an element at index i
        l1.remove(1);
        System.out.println(l1);
//        removing an element e
        l1.remove(Integer.valueOf(3));
        System.out.println(l1);
//Checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(7));
        System.out.println(ans);
//        if you don't specify class,you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("Hari");
        l.add(43);
        l.add(34.44f);
        l.add(0);
        System.out.println(l);
    }
}
