import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    private Livro buscarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public boolean emprestarLivro(int idLivro) {
        Livro livro = buscarLivroPorId(idLivro);

        if (livro == null || livro.isEmprestado()) {
            return false;
        }

        livro.emprestar();
        return true;
    }

    public boolean devolverLivro(int idLivro) {
        Livro livro = buscarLivroPorId(idLivro);

        if (livro == null || !livro.isEmprestado()) {
            return false;
        }

        livro.devolver();
        return true;
    }

    public ArrayList<Livro> listarLivros() {
        return livros;
    }
}
                   
