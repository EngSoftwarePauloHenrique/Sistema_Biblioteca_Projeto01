package sistemabiblioteca;

public class Multa {

    private double valor;
    private Colaborador colaborador;

    public Multa(double valor, Colaborador colaborador) {
        this.valor = valor;
        this.colaborador = colaborador;
    }

    public void gerarMulta() {
        System.out.println("Multa gerada para " + colaborador.getNome());
        System.out.println("Valor: R$ " + valor);
    }

    public void enviarAviso() {
        System.out.println("Aviso enviado para " + colaborador.getNome());
    }
}