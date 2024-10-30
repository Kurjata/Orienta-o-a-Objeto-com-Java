import screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibiFichaTecnica();
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(4);
        meuFilme.avaliaFilme(5);

//        System.out.println(meuFilme.avaliacao);
        System.out.println("Total de avaliações: "+ meuFilme.getTotalAvaliacoes());
//        System.out.println(meuFilme.mediaAvaliacoes());

    }
}