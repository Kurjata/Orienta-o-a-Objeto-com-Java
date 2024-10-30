package screenmatch.modelos;

public class Filme {

    private String nome;
    private int anoDeLancamento;
//    private inscuidoNoPlano;
    private double avaliacao;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibiFichaTecnica() {
        System.out.println("O nome do filme é: " + nome);
        System.out.println("O ano de lançamento foi em: " + anoDeLancamento);
    }

    public void avaliaFilme(double nota) {
        avaliacao += nota;
        totalAvaliacoes++;
    }

    public double mediaAvaliacoes() {
        return avaliacao / totalAvaliacoes;
    }
}
