package pw_Stack_part1;
import java.util.Stack;
public class Infix {
    public static void main(String[] args) {
        String st="9-(5+3)*4/6";
        Stack<Integer> val=new Stack<>();
        Stack<Integer> op=new Stack<>();
        for (int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            int ascii=(int)ch;
            if (ascii>=48&&ascii<=57) val.push(ascii-48);
            else if (op.size()==0||ch=='('||op.peek()=='(')
                op.push((int) ch);
            else if (ch==')'){
                while (op.peek()!='('){
                    int v2=val.pop();
                    int v1=val.pop();
                    if (op.peek()=='-')val.push(v1-v2);
                    if (op.peek()=='+')val.push(v1+v2);
                    if (op.peek()=='*')val.push(v1*v2);
                    if (op.peek()=='/')val.push(v1/v2);
                    op.pop();

                }
                op.pop();
            }
            else {
                if (ch=='+'||ch=='-'){
                   int v2=val.pop();
                   int v1=val.pop();
                   if (op.peek()=='-')val.push(v1-v2);
                    if (op.peek()=='+')val.push(v1+v2);
                    if (op.peek()=='*')val.push(v1*v2);
                    if (op.peek()=='/')val.push(v1/v2);
                    op.pop();
                    op.push((int)ch);

                }
                if (ch=='*'||ch=='/'){
                    if (op.peek()=='*'||op.peek()=='/'){
                        int v2=val.pop();
                        int v1=val.pop();
                        if (op.peek()=='*')val.push(v1*v2);
                        if (op.peek()=='/')val.push(v1/v2);
                        op.pop();
                        op.push((int)ch);
                    }
                    else op.push((int)ch);

                }
            }
        }
        while (val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if (op.peek()=='-')val.push(v1-v2);
            if (op.peek()=='+')val.push(v1+v2);
            if (op.peek()=='*')val.push(v1*v2);
            if (op.peek()=='/')val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());

    }
}
