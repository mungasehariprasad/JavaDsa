package Collection_Framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class Map_hesh {
    public static void main(String[] args) {
//        Map<Integer,String> m=new HashMap<>();
        Map<Integer,String> m=new LinkedHashMap<>();
        m.put(1,"Hari");
        m.put(4,"Aman");
        m.put(3,"Rahul");
        for (var e:m.entrySet()){
            System.out.println(e.getValue());
        }
    }
}
