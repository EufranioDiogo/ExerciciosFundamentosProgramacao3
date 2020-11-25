public class SequentialList {
    /* Code pre implementado pela SequentialList
    .
    .
    .
    .
    */
    public void transferirMaior() {
        if(this.head != null) {
            int maior = this.head.data;
            boolean maiorChanged = false;

            if (this.head.next == null) {
                System.out.println("Lista com um só nó");
            }

            int tamanho = this.size();
            int aux;

            while(tamanho > 0) {
                aux = this.remove();

                if (aux > maior) {
                    maior = aux;
                    maiorChanged = true;
                }
                this.insert(aux);
                tamanho--;
            }

            if (maiorChanged == false) {
                System.out.println("Maior valor já está no início da lista");
            } else {
                tamanho = this.size();
                boolean insertMaior = false;

                lista.insert(maior);
                while (tamanho > 0) {
                    aux = this.remove();
                    if (aux == maior && insertMaior == false) {
                        insertMaior = true;
                        tamanho--;
                        continue;
                    }
                    this.insert(aux);
                    tamanho--;
                }

            }
        } else {
            System.out.println("Lista Vazia");
        }
    }
}
