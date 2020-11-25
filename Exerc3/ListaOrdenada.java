public class ListaOrdenada extends SequentialList{
    public void insert(int o) {
        if(this.size()) {
            Node previous = null;
            Node current = this.head;

            while(current != null) {
                if (current.data > o) {
                    Node newElement = new Node(o);
                    if(previous == null) {
                        newElement.next = this.head;
                        this.head = newElement;
                    }
                    else if (current.next == null) {
                        current.next = newElement;
                    }
                    else {
                        newElement.next = this.current;
                        previous.next = newElement;
                    }
                    break;
                }
                prev = current;
                current = current.next;
            }
            this.size +=1;
        }
    }
    
}
