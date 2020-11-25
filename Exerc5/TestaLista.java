public class TestaLista {
    static Aluno primeiroAluno;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeAluno;
        int matricula;
        int idade;
        int index = 0;
        boolean flagAlunoRegistrado = false;

        while (index < 40) {
            matricula = sc.nextInt();
            idade = sc.nextInt();
            nomeAluno = sc.nextString();

            flagAlunoRegistrado = verificarExistenciaAluno(matricula);

            if (flagAlunoRegistrado == false) {
                inserirAlunoNaLista(matricula, nomeAluno, idade);
            } else {
                removerAlunoRegistrado(matricula);
            }
        }
    }

    public static boolean verificarExistenciaAluno(int matricula) {
        if (primeiroAluno == null) {
            return false;
        } else {
            Aluno alunoAux = primeiroAluno;;

            while(alunoAux != null) {
                if (alunoAux.matricula == matricula) {
                    return true;
                }
                alunoAux = alunoAux.proxALuno;
            }
        }
        return false;
    }

    public static void inserirAlunoNaLista(int matricula, String nomeAluno, int idade) {
        if(primeiroAluno == null) {
            primeiroAluno = new Aluno(matricula, nomeAluno, idade);
        } else {
            Aluno alunoAux = primeiroAluno;

            while(alunoAux.nextAluno != null) {
                alunoAux = alunoAux.nextAluno;
            }
            alunoAux.nextAluno = new Aluno(matricula, nomeAluno, idade);
        }
    }

    public static void removerAlunoRegistrado(int matricula) {
        if(matricula == primeiroAluno.matricula) {
            primeiroAluno = primeiroAluno.next;
        } else {
            Aluno alunoAnterior = null;
            Aluno alunoAux = primeiroAluno;


            while (alunoAux.matricula != matricula) {
                alunoAnterior = alunoAux;
                alunoAux = alunoAux.nextAluno;
            }
            alunoAnterior.nextAluno = alunoAux.nextAluno;
        }
    }
}
