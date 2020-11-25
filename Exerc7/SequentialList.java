public class SequentialList {
    /* Code pre implementado pela SequentialList
    .
    .
    .
    .
    */
    public void concat(SequentialList L) {
        int tamanhoListaL = L.size();

        while(tamanhoListaL > 0) {
            this.insert(L.remove());
            tamanhoList--;
        }
    }
}
