package sistemabiblioteca;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(1, "Java POO", "Paulo Silveira");
        Livro livro2 = new Livro(2, "Estruturas de Dados", "Nélio Alves");

        Colaborador colaborador1 = new Colaborador(1, "Carlos");
        Colaborador colaborador2 = new Colaborador(2, "Maria");

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        biblioteca.cadastrarColaborador(colaborador1);
        biblioteca.cadastrarColaborador(colaborador2);

        biblioteca.listarLivros();
        biblioteca.listarColaboradores();

        biblioteca.registrarEmprestimo(livro1, colaborador1);

        Multa multa = new Multa(15.0, colaborador1);

        multa.gerarMulta();

        multa.enviarAviso();
    }
}