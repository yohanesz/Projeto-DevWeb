import java.util.ArrayList;
import java.util.Scanner;

public class Geral {

    ArrayList <Aluno> listaAlunos = new ArrayList<>();
    Formatacao fmt = new Formatacao();
    Scanner scanner = new Scanner(System.in);

    public void inserirAluno(Aluno novoAluno) {
        listaAlunos.add(novoAluno);
    }

    public void listarAlunos() {
        
        fmt.linha();

        if (listaAlunos.isEmpty()) {
            System.out.println("A lista de alunos está vazia.");
            return;
        }

        for(int i=0; i < listaAlunos.size(); i++) {
            System.out.println("[" + i + "]" + listaAlunos.get(i).getNome());
        }
        fmt.linha();
    }

    public void removerAluno(int indiceAluno) {

        System.out.println("Selecione o aluno que deseja remover: ");

        listarAlunos();
        System.out.println("");
        int indiceRemover = scanner.nextInt();

        String alunoRemovido = listaAlunos.get(indiceRemover).getNome();

        listaAlunos.remove(indiceRemover);
        
        fmt.linha();
        System.out.println("O aluno " + alunoRemovido + "foi removido");
        fmt.linha();

    }

    
}
