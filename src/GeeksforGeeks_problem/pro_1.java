 package GeeksforGeeks_problem;
public class pro_1 {
    static String reverse_sen(String str) {
        if (str.length()==0) return "";
        return reverse_sen(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str="Hariprasad";
        String rev_str=reverse_sen(str);
        System.out.println(rev_str);
    }
}
