package Hashmap_Hashing_Internal_Working;

import java.util.HashMap;

public class Voilid_AnagramQ1 {
    static HashMap<Character,Integer>make(String str){
        HashMap<Character,Integer>mp=new HashMap<>();
        for (int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if (!mp.containsKey(ch)){
                mp.put(ch,i);
            }else {
                int currF=mp.get(ch);
                mp.put(ch,currF+1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s,String t){
        if (s.length()!= t.length())return false;
        HashMap<Character,Integer>mp1=make(s);
        HashMap<Character,Integer>mp2=make(s);
        return mp1.equals(mp2);

    }

    public static void main(String[] args) {
        Voilid_AnagramQ1 a=new Voilid_AnagramQ1();
        String t="harip";
        String p="aripp";
        System.out.println(  a.isAnagram(t,p));
       

    }
}
