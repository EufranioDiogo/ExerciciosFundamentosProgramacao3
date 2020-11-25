public class Main extends SequentialList{
    public void insert(int o) {
        if(this.size()) {
            Node current = this.head;
            boolean flagInserir = true;

            while(current.next != null) {
                if(current.data == o) {
                    flagInserir = false;
                    break;
                }
            }

            if (flagInserir) {
                this.tail.next = new Node(o);
            }
        }
    }
    
}
