package sistemabiblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Colaborador> colaboradores = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado!");
    }

    public void cadastrarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
        System.out.println("Colaborador cadastrado!");
    }

    public void registrarEmprestimo(Livro livro, Colaborador colaborador) {

        if (livro.isDisponivel()) {

            Emprestimo e = new Emprestimo(livro, colaborador);

            e.registrar();

            emprestimos.add(e);

        } else {
            System.out.println("Livro indisponível!");
        }
    }

    public void listarLivros() {

        System.out.println("\nLISTA DE LIVROS");

        for (Livro l : livros) {
            System.out.println(l);
        }
    }

    public void listarColaboradores() {

        System.out.println("\nCOLABORADORES");

        for (Colaborador c : colaboradores) {
            System.out.println(c);
        }
    }
}