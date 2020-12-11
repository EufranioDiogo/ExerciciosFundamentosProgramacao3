import java.util.Queue;
import java.util.Stack;

public class Main {
    public inverterFila(Queue<E> fila) {
        Stack<E> stack = new Stack<>(fila.size());

        while(!fila.isEmpty()) {
            stack.push(fila.dequeue());
        }
        while(!stack.isEmpty()) {
            fila.add(stack.pop());
        }
    }
}
