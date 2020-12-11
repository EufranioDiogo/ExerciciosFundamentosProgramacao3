import java.util.Scanner;

class TestaPilha2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int auxVar;
        int quantRepeticoes;
        Pilha P = new Pilha();
        Pilha N = new Pilha();

        System.out.println("Digite a quantidade de vezes que quer que o programa repita: ");
        quantRepeticoes = leitor.nextInt();

        while (quantRepeticoes > 0) {
            System.out.println("Leitura de número: ");
            auxVar = leitor.nextInt();
            
            if (auxVar > 0) {
                P.push(auxVar);
            } else if (auxVar < 0) {
                N.push(auxVar);
            } else {
                P.pop();
                N.pop();
            }
        }
    }
}