import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    // Cadastrar livro
    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }

    // Cadastrar usuário
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    // Emprestar livro
    public void emprestarLivro(int idLivro) {
        for (Livro livro : livros) {
            if (livro.getId() == idLivro) {
                if (!livro.isEmprestado()) {
                    livro.emprestar();
                    System.out.println("Livro emprestado: " + livro.getTitulo());
                } else {
                    System.out.println("Livro já está emprestado!");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    // Devolver livro
    public void devolverLivro(int idLivro) {
        for (Livro livro : livros) {
            if (livro.getId() == idLivro) {
                if (livro.isEmprestado()) {
                    livro.devolver();
                    System.out.println("Livro devolvido: " + livro.getTitulo());
                } else {
                    System.out.println("O livro não estava emprestado!");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado!");
    }

    // Listar livros
    public void listarLivros() {
        System.out.println("\nLivros da Biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
