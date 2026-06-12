package sistemabiblioteca;

public class Emprestimo {

    private Livro livro;
    private Colaborador colaborador;

    public Emprestimo(Livro livro, Colaborador colaborador) {
        this.livro = livro;
        this.colaborador = colaborador;
    }

    public void registrar() {
        livro.emprestar();
        System.out.println("Empréstimo realizado com sucesso!");
    }

    public void finalizar() {
        livro.devolver();
        System.out.println("Livro devolvido!");
    }

    public Livro getLivro() {
        return livro;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }
}