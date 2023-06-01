package ArrayList_PWS;
import java.util.ArrayList;
import java.util.Collections;

public class Array_list_2ex {
    static void reversList(ArrayList<Integer> l) {
        int i = 0, j = l.size() - 1;
        while (i < j) {
            Integer temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);
        System.out.println(l);

//        reversList(l);
        Collections.reverse(l);

        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);


        ArrayList<String> l1=new ArrayList<>();
        l1.add("Hari");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);





    }
}

