import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<E> s1 = new Stack(10);
        Stack s2 = new Stack(10);
        Stack sAux = new Stack(10);

        while(!s1.isEmpty()) {
            sAux.push(s1.pop());
        }
        while(!sAux.isEmpty()) {
            s2.push(sAux.pop());
        }
    }
}