public class Usuario {
    private String nome;
    private int id;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome;
    }
}
