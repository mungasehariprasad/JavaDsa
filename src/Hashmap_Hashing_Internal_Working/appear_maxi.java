package Hashmap_Hashing_Internal_Working;

import java.util.HashMap;
import java.util.Map;
public class appear_maxi {
    public static void main(String[] args) {
         int[] arr={1,1,2,3,4,1,1,2,1,4,3,3,2,1,2,3,4,1,2,3,2,1};
        Map<Integer ,Integer> map=new HashMap<>();
        for (int el:arr){
            if (!map.containsKey(el)){    
                map.put(el,1);
            }else {
                map.put(el,map.get(el)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(map.entrySet());
        int mxf=0,anskey=-1;
        for (var key:map.keySet()){
            if (map.get(key)>mxf){
                mxf=map.get(key);
                anskey=key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times ",anskey,mxf);
    }
}
