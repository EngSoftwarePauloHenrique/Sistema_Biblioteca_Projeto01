package sistemabiblioteca;

public class Colaborador {

    private int id;
    private String nome;

    public Colaborador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Colaborador: " + nome;
    }
}