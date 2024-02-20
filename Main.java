import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
    Geral geral = new Geral();
    Scanner scanner = new Scanner(System.in);
    Formatacao fmt = new Formatacao();
    boolean verificador = true;

    do {

        fmt.limparConsole();
        fmt.linha();
        System.out.println("Selecione uma opção:");
        fmt.linha();
        System.out.println("[1] - Cadastrar aluno");
        System.out.println("[2] - Remover aluno");
        System.out.println("[3] - Listar Alunos");
        System.out.println("[4] - Encerrar programa");
        fmt.linha();
        int option = scanner.nextInt();
        
        

        switch (option) {
            case 1:
                
                scanner.nextLine();
                fmt.limparConsole();
                fmt.linha();

                System.out.println("Insira o nome do aluno: ");
                fmt.linha();
                System.out.println("");
                String nomeAluno = scanner.nextLine();
                fmt.limparConsole();
                fmt.linha();

                System.out.println("Insira a idade do aluno:");
                fmt.linha();
                System.out.println("");
                int idadeAluno = scanner.nextInt();
                fmt.limparConsole();
                fmt.linha();

                System.out.println("Insira o IAA do aluno: ");
                fmt.linha();
                System.out.println("");
                int iaaAluno = scanner.nextInt();
                fmt.limparConsole();
                fmt.linha();


                System.out.println("Selecione o curso desejado: ");
                fmt.linha();
                System.out.println("[1] - Ciência da Computação");
                System.out.println("[2] - Matemática");
                System.out.println("[3] - Pedagogia");
                System.out.println("[4] - Física");
                fmt.linha();
                System.out.println("");
                
                int indiceCursoSelecionado = scanner.nextInt();

                Curso cursoSelecionado = null;

                switch (indiceCursoSelecionado) {
                    case 1:
                        cursoSelecionado = Curso.CIENCIADACOMPUTACAO;
                    break;

                    case 2:
                        cursoSelecionado = Curso.MATEMATICA;
                    break;

                    case 3:
                        cursoSelecionado = Curso.PEDAGOGIA;
                    break;

                    case 4:
                        cursoSelecionado = Curso.FISICA;
                    break;
                
                    default:
                        break;
                }
                
                Aluno novoAluno = new Aluno(nomeAluno, idadeAluno, iaaAluno, cursoSelecionado);
                geral.inserirAluno(novoAluno);

                fmt.limparConsole();
                fmt.linha();
                System.out.println("Aluno Cadastrado com sucesso!");
                fmt.linha();
                System.out.println("");
                System.out.println("(Pressione enter para continuar...)");
                fmt.linha();
                scanner.nextLine();

                break;

            case 2:

            break;

            case 3:
                
                geral.listarAlunos();
                System.out.println("");
                System.out.println("Pressione enter para continuar...");
                fmt.linha();

            break;
        
            default:
                break;
        }


    } while (verificador);

    }
}