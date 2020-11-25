import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        SequentialList lista = new SequentialList();

        // a)
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        // b)
        int tamanho = lista.size();
        int aux = 0;

        while (tamanho > 0) {
            aux = lista.remove();
            System.out.println(aux);
            lista.add(aux);
            tamanho--;
        }

        // c)
        lista.add(14);

        // d)
        Scanner s = new Scanner(System.in);

        int numeroLido = s.nextInt();

        tamanho = lista.size();
        lista.add(numeroLido);

        while(tamanho > 0) {
            aux = lista.remove();
            lista.add(aux);
            tamanho--;
        }

        // e)
        tamanho = lista.size();
        int numeroProcurado = s.nextInt();
        int indexEncontrado = 0;
        boolean flagNumeroEncontrado = false;

        while(tamanho > 0) {
            aux = lista.remove();

            if (flagNumeroEncontrado == false) {
                if (aux == numeroProcurado) {
                    indexEncontrado = (lista.size() + 1) - tamanho;
                    flagNumeroEncontrado = true;
                }
            }
            lista.add(aux);
            tamanho--;
        }

        if (flagNumeroEncontrado) {
            System.out.println(indexEncontrado);
        } else {
            System.out.println("O valor: " + numeroProcurado + ", não está na lista");
        }

        // f)
        // Não sei


    }
}