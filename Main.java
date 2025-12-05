import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\n--- Biblioteca ---");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Usuário");
            System.out.println("3 - Emprestar Livro");
            System.out.println("4 - Devolver Livro");
            System.out.println("5 - Listar Livros");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (escolha) {
                case 1:
                    System.out.print("ID do livro: ");
                    int idLivro = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    biblioteca.cadastrarLivro(new Livro(idLivro, titulo, autor));
                    break;
                case 2:
                    System.out.print("ID do usuário: ");
                    int idUsuario = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome do usuário: ");
                    String nome = sc.nextLine();
                    biblioteca.cadastrarUsuario(new Usuario(idUsuario, nome));
                    break;
                case 3:
                    System.out.print("ID do livro a emprestar: ");
                    int idEmprestar = sc.nextInt();
                    biblioteca.emprestarLivro(idEmprestar);
                    break;
                case 4:
                    System.out.print("ID do livro a devolver: ");
                    int idDevolver = sc.nextInt();
                    biblioteca.devolverLivro(idDevolver);
                    break;
                case 5:
                    biblioteca.listarLivros();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);

        sc.close();
    }
}
