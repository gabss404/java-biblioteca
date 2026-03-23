public class Usuario {
    private final String nome;
    private final int id;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return String.format("ID: %d | Nome: %s", id, nome);
    }
}
