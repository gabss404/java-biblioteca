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

    public void emprestar() { this.emprestado = true; }
    public void devolver() { this.emprestado = false; }

    @Override
    public String toString() {
        String status = emprestado ? "Emprestado" : "Disponível";
        return "ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", Status: " + status;
    }
}
