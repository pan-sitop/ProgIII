package stack1;

// u
import java.util.*;
public class Stack1 {
	
	public static void main(String[] args) {
		Stack b=new Stack();
		Stack c=new Stack();
		b.add("aaa");
		b.add("bbb");
		b.add("ccc");
		System.out.println(b.peek());
                System.out.println(b.pop());
                System.out.println(b);
                System.out.println("------------------");
                System.out.println("Ingresar valores");

                Stack d=new Stack();
                Stack e=new Stack();
                llenar (d,2);
                System.out.println(d);
                llenar(e,2);
                System.out.println(e);
                intercambiar(d,e);
                System.out.println("------------------");
                System.out.println(d);
                System.out.println(e);
                
	}
        
        public static void llenar(Stack A, int n){
            Scanner sc= new Scanner(System.in);
            for (int i = 1; i <=n; i++) {
                A.push(sc.next());
            }
        }
        public static void llevar(Stack a){
            Stack b=new Stack();
            Stack c=new Stack();
            while(!a.empty()){
                String x=(String)a.pop();
                if (x.charAt(0)=='A') {
                    b.push(x);
                }else{
                    c.push(x);
                }
            }
            vaciar(b,a);
            vaciar(c,a);
        }
        public static void vaciar(Stack z, Stack w){
            while(!z.empty()){
                w.push(z.pop());
            }
        }
        public static void intercambiar(Stack a, Stack b){
            Stack a1=new Stack();
            Stack a2=new Stack();
            vaciar(a,a1);
            vaciar(b,a2);
            vaciar(a1,b);
            vaciar(a2,a);
            
        }
}
