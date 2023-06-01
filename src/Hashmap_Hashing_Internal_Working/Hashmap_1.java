package Hashmap_Hashing_Internal_Working;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_1 {

    static void maps_1(){
        Map<String ,Integer> mp=new HashMap<>();
        mp.put("Hari",21);
        mp.put("Yash",16);
        mp.put("Lav",19);
        mp.put("Rishika",39);
        mp.put("Harry",29);
        System.out.println(mp.get("Yash"));
    }


    static void maping(){
        Map<String,String> m=new HashMap<>();
        m.put("Hari","a");
        m.put("Naru","b");
        m.put("","c");
        m.put("Krishna","d");
    }
    public static void main(String[] args) {
      Hashmap_1 a=new Hashmap_1();
      maps_1();



    }
}
