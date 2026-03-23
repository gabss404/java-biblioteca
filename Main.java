import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            exibirMenu();
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    cadastrarLivro(sc, biblioteca);
                    break;
                case 2:
                    cadastrarUsuario(sc, biblioteca);
                    break;
                case 3:
                    emprestarLivro(sc, biblioteca);
                    break;
                case 4:
                    devolverLivro(sc, biblioteca);
                    break;
                case 5:
                    listarLivros(biblioteca);
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

    private static void exibirMenu() {
        System.out.println("\n--- Biblioteca ---");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Cadastrar Usuário");
        System.out.println("3 - Emprestar Livro");
        System.out.println("4 - Devolver Livro");
        System.out.println("5 - Listar Livros");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.print("ID do livro: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        biblioteca.cadastrarLivro(new Livro(id, titulo, autor));
        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void cadastrarUsuario(Scanner sc, Biblioteca biblioteca) {
        System.out.print("ID do usuário: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        biblioteca.cadastrarUsuario(new Usuario(id, nome));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void emprestarLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.print("ID do livro: ");
        int id = sc.nextInt();

        boolean sucesso = biblioteca.emprestarLivro(id);

        if (sucesso) {
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não foi possível emprestar o livro.");
        }
    }

    private static void devolverLivro(Scanner sc, Biblioteca biblioteca) {
        System.out.print("ID do livro: ");
        int id = sc.nextInt();

        boolean sucesso = biblioteca.devolverLivro(id);

        if (sucesso) {
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Não foi possível devolver o livro.");
        }
    }

    private static void listarLivros(Biblioteca biblioteca) {
        System.out.println("\nLivros da Biblioteca:");
        for (Livro livro : biblioteca.listarLivros()) {
            System.out.println(livro);
        }
    }
}
