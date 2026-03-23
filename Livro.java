public class Livro {
    private String titulo;
    private String autor;
    private int id;
    private boolean emprestado;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getId() { return id; }
    public boolean isEmprestado() { return emprestado; }

    public boolean emprestar() {
        if (emprestado) return false;
        this.emprestado = true;
        return true;
    }

    public boolean devolver() {
        if (!emprestado) return false;
        this.emprestado = false;
        return true;
    }

    @Override
    public String toString() {
        String status = emprestado ? "Emprestado" : "Disponível";
        return String.format(
            "ID: %d | Título: %s | Autor: %s | Status: %s",
            id, titulo, autor, status
        );
    }
}
