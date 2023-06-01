package Data_structures_java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class array_list01 {
    public static void main(String[] args) {
//        Integer | Float | String | Boolean is class in ArrayList
//        ArrayList<String> list1=new ArrayList<>();
//        ArrayList<Boolean> list2=new ArrayList<>();

        ArrayList<Integer> list=new ArrayList<Integer>();
//        Add element
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);

//        Get element
        int elem=list.get(1);
        System.out.println(elem);
//        Add element in between
        list.add(1,2);
        System.out.println(list);
//        Set element
        list.set(0,5);
        System.out.println(list);
//        Delete element
        list.remove(2);
        System.out.println(list);
//        size
        int size=list.size();
        System.out.println(size);
//        Loop
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

//        Sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
